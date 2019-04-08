package com.prasad.book.model;

public class AuthorModel {
    Integer imgSrc;
    String authorName;

    public AuthorModel(Integer imgSrc, String authorName) {
        this.imgSrc = imgSrc;
        this.authorName = authorName;
    }

    public Integer getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(Integer imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
