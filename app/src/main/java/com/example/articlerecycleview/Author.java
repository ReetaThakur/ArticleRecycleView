package com.example.articlerecycleview;

public class Author {
    private String author_name;
    private int image;
    private String books_name;
    private int book1_image;
    private int book2_image;

    public String getAuthor_name() {
        return author_name;
    }

    public int getImage() {
        return image;
    }

    public String getBooks_name() {
        return books_name;
    }

    public int getBook1_image() {
        return book1_image;
    }

    public int getBook2_image() {
        return book2_image;
    }

    public Author(String author_name, int image, String books_name, int book1_image, int book2_image) {
        this.author_name = author_name;
        this.image = image;
        this.books_name = books_name;
        this.book1_image = book1_image;
        this.book2_image = book2_image;
    }
}
