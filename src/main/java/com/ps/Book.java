package com.ps;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
     public int id;

    public String isbn;

    public String title;

    public  boolean isCheckedOut;

    public String checkedOutTo;

    public void checkOut() {

    }

    public static void checkOut(int name, Book[] bookStock){
        System.out.println("What is the ID of the book you are checking in? ");
        Scanner scanner = new Scanner(System.in);
        int borrowedbookID = scanner.nextInt();
        for (int newID = 0; newID < bookStock.length; newID++) {
            if (borrowedbookID == bookStock[newID].id) {
                bookStock[newID].isCheckedOut = false;
                bookStock[newID].checkedOutTo = " ";
            }

        }
    }

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }
}
