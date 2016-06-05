/**
  * jQuery Kinopoisk Plugin 0.4
  *
  * Kinopoisk is a jQuery plugin that let you easily add to your web page movie rating informer. This informer shows
  * movie rating from kinopoisk.ru and imdb.com. It does not use any server side scripts. It use javascript and css files only.
  *
  * @name kinopoisk
  * @version 0.6
  * @requires jQuery v1.5.0+
  * @author Dmitry Shamin <dmitry.shamin@gmail.com>
  * @license Dual licensed under the MIT or GPL Version 2 licenses.
  *
  * Copyright 2012-2013, Dmitry Shamin
  */
;(function( $ ) {

    /**
     * ��������� �� ���������
     *
     * @type {Object}
     */
    var settings = {
        "movie"  : false,
        "url"    : "http://rating.kinopoisk.ru",
        "range"  : 10,
        "fix"    : 1,
        "order"  : ["kinopoisk", "imdb"],
        "kinopoisk_template": '<div>' +
                '<span class="kp_description">������� <a href="http://kinopoisk.ru" target="new">����������</a>:</span>' +
                '<span class="kp_rating" title="������������� $vote">$rating</span>',
        "imdb_template": '<div>' +
                '<span class="kp_description">������� <a href="http://imdb.com" target="new">IMDB</a>:</span>' +
                '<span class="kp_rating" title="������������� $vote">$rating</span>',
        "cache_time" : 86400000,
        "no_data": "��� ������",
        "show_zero_rating": true
    };

    /**
     * ������ �������
     *
     * @type {Object}
     */
    var methods = {

        /**
         * ������������� �������
         *
         * @param options {String[]} ������ � ����������� �������
         *
         * @return {*}
         */
        init : function(options) {
            return this.each(function() {
                var $this = $(this);
                // �������� data ����������� settings, � options ����������� data
                var params = $.extend({}, settings, $this.data(), options);
                // ���� ������ �������������� �������� ������
                for (var i in params) {
                    if (i == 'movie') {
                        var movie = params[i].toString().split('/');
                        if (movie.length > 1) {
                            params[i] = movie[4];
                        } else {
                            params[i] = movie[0];
                        }
                    }
                }
                $this.data({'params': params}); // ���������� ��������� ��������
                $this.kinopoisk('getRating');
            });
        },
        /**
         * ��������� �������� � ����� kinopoisk.ru
         *
         * @return {*}
         */
        getRating: function() {
            var el = $(this);
            var params = el.data('params');
            if (!params.movie) {
                throw '�� ������ ������������� ������ �� ���������� (data-movie).';
            }
            // ��������� ���
            var movie_xml = methods._getCache(el, params.movie);
            if (movie_xml) {
                return methods._showRating(el, movie_xml);
            } else {
                $.ajax(
                    {
                        type: 'GET',
                        url: 'http://query.yahooapis.com/v1/public/yql?q='
                                + encodeURIComponent('select * from xml where url="' + params.url + '/' + params.movie
                                + '.xml"') + '&format=xml&callback=?',
                        dataType: 'json',
                        success: function(data) {
                            movie_xml = methods._setCache(el, params.movie, data.results[0]); // �������� ������
                            return methods._showRating(el, movie_xml);
                        },
                        error: function(data) {
                            console.log(data);
                            $.error(data.responseText);
                        }
                    }
                );
            }
        },
        /**
         * ��������� �������� �� ����.
         *
         * @param el    {Object}  jQuery ������ �������� ��������
         * @param movie {Integer} ������������� ������
         *
         * @return {*}
         * @private
         */
        _getCache: function(el, movie) {
            var params = el.data('params');
            var timestamp = new Date().getTime();
            var cache = localStorage.getItem("movie_" + movie);
            if (!cache) {
                return false;
            } else {
                var xml_doc      = $.parseXML(cache);
                var $xml         = $(xml_doc);
                if ((timestamp - $xml.find("cache_time").text()) > params.cache_time) {
                    // ���� ��� ����, ������ ���
                    localStorage.removeItem("movie_" + movie);
                    return false;
                }
            }
            return cache;
        },
        /**
         * ��������� ����
         *
         * @param el    {Object}  ������ jQuery
         * @param movie {Integer} ������������� ������
         * @param data  {String}  XML � ������� ������� kinopoisk
         *
         * @return {String}
         * @private
         */
        _setCache: function(el, movie, data) {
            var params = el.data('params');
            var timestamp = new Date().getTime();
            var cache = localStorage.getItem("movie_" + movie);
            var movie_xml = "<result>" + data +  "<cache_time>" + timestamp + "</cache_time></result>";
            if (!cache) {
                localStorage.setItem("movie_" + movie, movie_xml);
            } else {
                var xml_doc      = $.parseXML(cache);
                var $xml         = $(xml_doc);
                if ((timestamp - $xml.find("cache_time").text()) > params.cache_time) {
                    // ���� ������� �� ������� ����� �����, �� ��������� ���
                    localStorage.setItem("movie_" + movie, movie_xml);
                } else {
                    movie_xml = cache;
                }
            }
            return movie_xml;
        },
        /**
         * ����� ��������
         *
         * @param el {Object}   jQuery ������
         * @param data {String} XML � ������� ������� kinopoisk
         *
         * @private
         */
        _showRating: function(el, data) {
            var params = el.data('params');
            if (!data) {
                throw '��������� ������������ url "' + params.url + '"';
            }
            var xml_doc      = $.parseXML(data);
            var $xml         = $(xml_doc);
            var $kp_rating   = $xml.find("kp_rating");
            var $imdb_rating = $xml.find("imdb_rating");
            // ���� ��� ������ ����� movie_id
            if ($kp_rating.text() == 0 && $kp_rating.attr("num_vote") == 0) {
                if (!params.no_data) {
                    return el;
                } else {
                    return el.html('<span class="kp_container">' + params.no_data + '</span>');
                }

            }
            // ���������� ��������
            $kp_rating.text(methods.__roundRating($kp_rating, params.fix));
            $imdb_rating.text(methods.__roundRating($imdb_rating, params.fix));
            // ��������� ����
            $kp_rating.stars   = methods._getStar($kp_rating.text(), params.range);
            $imdb_rating.stars = methods._getStar($imdb_rating.text(), params.range);
            var kp_tpl = methods._getTemplate(params.kinopoisk_template, $kp_rating);
            var imdb_tpl = methods._getTemplate(params.imdb_template, $imdb_rating);
            if (params.show_zero_rating == false) {
                if ($kp_rating.text() == 0) {
                    kp_tpl = "";
                }
                if ($imdb_rating.text() == 0) {
                    imdb_tpl = "";
                }
            }
            var ratings = {
                "kinopoisk": kp_tpl,
                "imdb": imdb_tpl
            };
            var text = "";
            for (var i in params.order) if (params.order.hasOwnProperty(i)) {
                if (typeof ratings[params.order[i]] != 'undefined') {
                    text += ratings[params.order[i]];
                }
            }
            return el.hide().html('<span class="kp_container">' + text + '</span>').fadeIn();
        },
        /**
         * ���������� ��������
         *
         * @param rating {Object} ������ ��������
         * @param fix    {int}    ���������� ������ ����� �������
         * @private
         */
        __roundRating: function(rating, fix) {
            return Math.round(parseFloat(rating.text()) * Math.pow(10, fix)) / Math.pow(10, fix);
        },
        /**
         * ������ �����������
         *
         * @param template  {String} ������
         * @param $rating   {Object} ������ ��������
         *
         * @return {String}
         * @private
         */
        _getTemplate: function(template, $rating) {
            return template
                .replace("$rating", $rating.text())
                .replace("$vote", $rating.attr("num_vote"))
                .replace("$stars", $rating.stars);
        },
        /**
         * ����������� ����
         *
         * @param rating {FLoat}   �������
         * @param range  {Integer} �������� ���������
         *
         * @return {String}
         * @private
         */
        _getStar: function(rating, range) {
            var star = "";
            var round_rating = Math.round(rating * range / 10);
            for (var i = 1; i <= range; i++) {
                if (i <= round_rating) {
                    star += "<span>&#9733;</span>";
                } else {
                    star += "<span>&#9734;</span>";
                }
            }
            return star;
        }
    };

    $.fn.kinopoisk = function(method) {
        try {
            if (methods[method]) {
                if (method.charAt(0) == "_") {
                    throw "������ �������� ��������� �����";
                }
                return methods[method].apply(this, Array.prototype.slice.call(arguments, 1));
            } else if (typeof method === 'object' || ! method) {
                return methods.init.apply(this, arguments);
            } else {
                throw '����� ' +  method + ' �� ������';
            }
        } catch(e) {
            $.error(e);
        }
    };

})(jQuery);

$(document).ready(function() {
    $(".kinopoisk").kinopoisk();
});
