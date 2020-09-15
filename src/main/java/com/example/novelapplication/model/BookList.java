package com.example.novelapplication.model;

import java.util.List;

public class BookList {
    private int total;
    private List<Book> books;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
