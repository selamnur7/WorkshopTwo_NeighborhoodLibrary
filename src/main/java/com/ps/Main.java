package com.ps;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean showHomeScreen = true;
        int option1;

        Book book1 = new Book(1, "64b92c13", "A Game of Thrones",false, " " );
        Book book2 = new Book(2, "44b58i30", "The Maze Runner",false, " " );

        Book book3 = new Book(3, "17b92f17", "To Kill a Mockingbird",false, " " );

        Book book4 = new Book(4, "95b01m43", "Guns, Germs & Steel",true, "Chris Rock " );
        Book book5 = new Book(5, "20b75d90", "Calculus 1",false, " " );

        Book book6 = new Book(6, "89b68p33", "Gone Girl",false, " " );
        Book book7 = new Book(7, "42b56c81", "The Catcher in the Rye",false, " " );

        Book book8 = new Book(8, "39b35k47", "The Lord of the Rings",true, "Joe Schmoe " );
        Book book9 = new Book(9, "73b59o15", "The Hunger Games",false, " " );

        Book book10 = new Book(10, "48b07g36", "The Road",false, " " );
        Book book11 = new Book(11, "24b31f89", "The Girl with the Dragon Tattoo",false, " " );

        Book book12 = new Book(12, "73b21s19", "Pride and Prejudice",false, " " );
        Book book13 = new Book(13, "36b32q44", "The Book Thief",false, " " );

        Book book14 = new Book(14, "52b26u09", "The Chronicles of Narnia",false, " " );
        Book book15 = new Book(15, "31b60r21", "Animal Farm",false, " " );

        Book book16 = new Book(16, "51b27t68", "The Night Circus",false, " " );
        Book book17 = new Book(17, "82b23w42", "Frankenstein",false, " " );

        Book book18 = new Book(18, "80b39j47", "The Secret History",false, " " );
        Book book19 = new Book(19, "93b01w13", "A Brief History of Time",false, " " );
        Book book20 = new Book(20, "46b29x31", "The Handmaid's Tale",false, " " );

        Book[] bookStock = {book1, book2, book3, book4, book5, book6, book7, book8, book9,
                book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};



        do {
            // Home Screen
            if (showHomeScreen == true) {
                System.out.println("Welcome to the Library");
                System.out.println("Press 1 for a list of Available books");
                System.out.println("Press 2 for a list of checked out books");
                System.out.println("Press 3 to exit");
            }
            Scanner scanner = new Scanner(System.in);
            option1 = scanner.nextInt();


            switch (option1){
                case 1:
                    for(int i = 0; i < bookStock.length; i++){
                        if (!bookStock[i].isCheckedOut()){
                            System.out.println("ID: " + bookStock[i].getId());
                            System.out.println("ISBN: " + bookStock[i].getIsbn());
                            System.out.println("Title: : " + bookStock[i].getTitle());

                            }
                        }
                    System.out.println("Press 7 to check out a book, or 9 to exit");
                    int checkOrNo = scanner.nextInt();

                    if (checkOrNo == 7){
                        System.out.println("What is the ID of the book you want to check out? ");
                        int idCheckOut = scanner.nextInt();
                        System.out.println("What is your first and last name? ");
                        String nameCheckedOut = scanner.nextLine();
                        for (int counter = 0; counter < bookStock.length; counter++){
                            if (idCheckOut == bookStock[counter].id) {
                                bookStock[counter].checkedOutTo = String.valueOf(true);
                                bookStock[counter].checkedOutTo = nameCheckedOut;
                            }
                        }
                    }
                    break;

                case 2:
                    for(int b = 0; b < bookStock.length; b++){
                        if (bookStock[b].isCheckedOut()){
                            System.out.println("ID: " + bookStock[b].getId());
                            System.out.println("ISBN: " + bookStock[b].getIsbn());
                            System.out.println("Title: : " + bookStock[b].getTitle());
                            showHomeScreen = false;


                        }
                    }
                    System.out.println("Press C to Check in a book, or X to go back to home page");
                    String option2 = scanner.nextLine();


                    if (option2.equalsIgnoreCase("c")){
                            System.out.println("What is the ID of the book you are checking in? ");
                        int borrowedbookID = scanner.nextInt();
                        for (int newID = 0; newID < bookStock.length; newID++){
                            if (borrowedbookID == bookStock[newID].id) {
                                bookStock[newID].isCheckedOut = false;
                                bookStock[newID].checkedOutTo = " ";
                            }
                        }
                            showHomeScreen = true;


                        }else if (option2.equalsIgnoreCase("x")){
                            showHomeScreen = true;
                        }


                    break;
            }







        }while(option1 != 3);



    }

}
