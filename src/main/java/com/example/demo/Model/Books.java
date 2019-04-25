package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Books {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "BOOK_ID", length = 8, unique = true, nullable = false)
    private Integer bookId;

    @Column(name = "AUTHOR", nullable = false)
    private String author;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "PUBLISHER", nullable = false)
    private String publisher;

    @Column(name = "YEAR_OF_PUBLICATION")
    private String year_of_publication;

    public Books()
    {

    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(String year_of_publication) {
        this.year_of_publication = year_of_publication;
    }
}
