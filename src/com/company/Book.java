package com.company;

/**
 * Created by 102693 on 2/11/2020.
 */
public class Book {

    private String author;
    private String title;
    private int totalPages;

    private double price;

    static int numBooks = 0;
    static double totalPrice = 0;

    public Book(String author, String title, int totalPages, double price) {
        this.author = author;
        this.title = title;
        this.totalPages = totalPages;
        this.price = price;
        numBooks++;
        totalPrice += this.getPrice();
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

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}
