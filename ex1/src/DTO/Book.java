package DTO;

import java.util.Scanner;

class Book {
    private String code;
    private String title;
    private String publisher;

    public Book(String code, String title, String publisher) {
        this.code = code;
        this.title = title;
        this.publisher = publisher;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}