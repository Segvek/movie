
package com.segvek.inmovie.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News extends Model{
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "patchImage")
    private String patchImage;
    
    @Column(name = "content", length = Integer.MAX_VALUE)
    private String content;

    public News() {
    }

    public News(Long id) {
        super(id);
    }

    public News(String title, String patchImage, String content) {
        this.title = title;
        this.patchImage = patchImage;
        this.content = content;
    }

    public News(String title, String patchImage, String content, Long id) {
        super(id);
        this.title = title;
        this.patchImage = patchImage;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPatchImage() {
        return patchImage;
    }

    public void setPatchImage(String patchImage) {
        this.patchImage = patchImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
