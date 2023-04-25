package org.yearup;

import java.util.Scanner;

public class LibraryApp {
    static Scanner scanner = new Scanner(System.in);
    static BookClass[] books;
    static int selection;
//    public static void main(String[] args)
//        create a book class with getters,setters, constructors, and methods;
//        properties: id int, isbn String, title String, isCheckedOut boolean, checkedOutTo String;
//        methods: checkOut(Name), checkIn()

//          use array to hold an inventory of 5 books;
//          when book is checked out: books checked out variable should be set to the name provided;
//          the isCheckedOutTo variable should be set to true;
//          when a booked is checked in: the books checkedOutTo variable should be set to
//          the isCheckedOut variable should be set to false;

    //create inventory
    public static void main(String[] args) {
        createInventory();
        displayHomeScreen();
    }

    private static void createInventory() {
        books = new BookClass[5];
        books[0] = new BookClass(1, "1455-7-885", "Piggy And Gerald", true, "chen ");
        books[1] = new BookClass(2, "4556-7-885", "pete the cat", false, " ");
        books[2] = new BookClass(5, "4568-7-885", "jack and jill", true, "rain");
        books[3] = new BookClass(4, "4552-8-545", "twinkles", false, " ");
        books[4] = new BookClass(8, "4565-8-511", "lion king", true, "she");

    }

    public static void displayHomeScreen() {
        boolean display = true;
        while (display) {
            System.out.println();
            System.out.println("Welcome to the Library");
            System.out.println("what do you want to do?");
            System.out.println("1)Display available Books");
            System.out.println("2)Show checked out books");
            System.out.println("3)Check in a book");
            System.out.println("4)Exit");
            System.out.println("Enter your option:");
            int selection = scanner.nextInt();
            scanner.nextLine();

//
            switch (selection) {
                case 1:
                    System.out.println("Available books");
                    for (BookClass book : books) {
                        System.out.printf("%d\t%s\t%s\n", book.getId(), book.getIsbn(), book.getTitle());
                    }
                    while (!display) {
                        System.out.println("Enter the title of the book you want to check out:");
                        selection = scanner.nextInt();
                        displayHomeScreen();
                    }
                    break;

                case 2:
                    selection = 2;
                    System.out.println("Checked Out Books");
                    for (BookClass book : books) {
                        if (book.getisCheckedOut()) {
                            System.out.printf("%d\t%s\t%s\t%s\n", book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
                            selection = scanner.nextInt();
                            displayHomeScreen();
                        }
                    }
                    break;
                case 3:
                    selection = 3;
                    System.out.println("Check in a Book");
                    System.out.println("Enter the book Id you want to check in");
                    for (BookClass book : books) {
                        if (book.getId() == selection)
                            if (book.getisCheckedOut()) {
                                display = true;
                                System.out.printf("'%s'\t is checked in\n", book.getTitle());
                                book.checkIn();
                                selection = scanner.nextInt();
                                displayHomeScreen();

                            }
                    }
                    break;
                case 4:
                    selection = 4;
                    System.out.println("Exit");
                    display = true;
                    displayHomeScreen();

                    System.out.println("Thanks, come again");

            }
        }
    }
}





