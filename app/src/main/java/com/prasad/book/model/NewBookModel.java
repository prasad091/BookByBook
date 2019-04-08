package com.prasad.book.model;

public class NewBookModel {
    Integer imgSrc;
    String bookName;
    String authorName;

    public NewBookModel(Integer imgSrc, String bookName, String authorName) {
        this.imgSrc = imgSrc;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Integer getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(Integer imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
