package com.ps;

import java.util.Scanner;

public class Book {
    private int id;

    private String isbn;

    private String title;

    private static boolean isCheckedOut;

    private String checkedOutTo;

    public static void checkOut() {

    }
    public static void homeScreen() {
        int option;
        int i = 0;
        System.out.println("Please choose an option: ");
        System.out.println("\t(1) Show available books ");
        System.out.println("\t(2) Show Checked out books ");
        System.out.println("\t(3) Exit: ");

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
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

    public static boolean isCheckedOut() {
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
}
