package com.ps;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "64b92c13", "A Game of Thrones",false, " " );
        Book book2 = new Book(2, "44b58i33", "The Maze Runner",false, " " );

        Book book3 = new Book(3, "64b92f17", "To Kill a Mockingbird",false, " " );

        Book book4 = new Book(4, "64b92c13", "Guns, Germs & Steel",false, " " );
        Book book5 = new Book(5, "64b92c13", "Calculus 1",false, " " );

        Book book6 = new Book(6, "64b92c13", "Gone Girl",false, " " );
        Book book7 = new Book(7, "64b92c13", "The Catcher in the Rye",false, " " );

        Book book8 = new Book(8, "64b92c13", "The Lord of the Rings",false, " " );
        Book book9 = new Book(9, "64b92c13", "The Hunger Games",false, " " );

        Book book10 = new Book(10, "64b92c13", "The Road",false, " " );
        Book book11 = new Book(11, "64b92c13", "The Girl with the Dragon Tattoo",false, " " );

        Book book12 = new Book(12, "64b92c13", "Pride and Prejudice",false, " " );
        Book book13 = new Book(13, "64b92c13", "The Book Thief",false, " " );

        Book book14 = new Book(14, "64b92c13", "The Chronicles of Narnia",false, " " );
        Book book15 = new Book(15, "64b92c13", "Animal Farm",false, " " );

        Book book16 = new Book(16, "64b92c13", "The Night Circus",false, " " );
        Book book17 = new Book(17, "64b92c13", "Frankenstein",false, " " );

        Book book18 = new Book(18, "64b92c13", "The Secret History",false, " " );
        Book book19 = new Book(19, "64b92c13", "A Brief History of Time",false, " " );
        Book book20 = new Book(20, "64b92c13", "The Handmaid's Tale",false, " " );

        Book[] bookStock = {book1, book2, book3, book4, book5, book6, book7, book8, book9,
                book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};

        int option;
        do {
            System.out.println("Please choose an option: ");
            System.out.println("\t(1) Show available books ");
            System.out.println("\t(2) Show Checked out books ");
            System.out.println("\t(3) Exit: ");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Available books ");
                    break;
                case 2:
                    System.out.println("These are the checked out books: ");
                    break;
                default:

            }




        } while (option ==3);
        System.out.println("Thanks for being here ");

    }
}