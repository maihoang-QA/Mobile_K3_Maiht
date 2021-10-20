package bai07;

import java.util.Scanner;

public class TestBook {
    public static void inputBookInfo(Book.Builder bookBuilder) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input ISBN with valid value: ");
            bookBuilder.ISBN(scanner.nextLine());
        } while (bookBuilder.getISBN()!= null);

        System.out.print("Input name : ");
        bookBuilder.name(scanner.nextLine());
        System.out.print("Input author: ");
        bookBuilder.author(scanner.nextLine());

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book.Builder bookBuilder[] = null;
        int numberOfBooks = 0;
        String searchISBN;

        while (true) {
            System.out.println("\n--------------------------- Book Builder ---------------------------\n");
            System.out.println("1/ Input book information");
            System.out.println("2/ Show all book information");
            System.out.println("3/ Search book by ISBN");
            System.out.println("4/ Exit program");
            System.out.println("\n--------------------------------------------------------------------\n");
            System.out.print("Please input your option: ");
            int inputOption = scanner.nextInt();
            System.out.println("\n--------------------------------------------------------------------\n");

            switch (inputOption) {
                case 1:
                    System.out.print("Input total numbers of book: ");
                    numberOfBooks = scanner.nextInt();
                    bookBuilder = new Book.Builder[numberOfBooks]; //Assign how many elements for Array Book.Builder
                    System.out.println("\n----------- Please input your book info -----------");
                    for (int i = 0; i < numberOfBooks; i++) {
                        System.out.println("Book number " + (i + 1) + ": ");
                        bookBuilder[i] = new Book.Builder();
                        TestBook.inputBookInfo(bookBuilder[i]); //Assign Book.Builder object at index i
                    }
                    break;
                case 2:
                    System.out.println("-------------------------- List of books ---------------------------\n");
                    for (int i = 0; i < numberOfBooks; i++) {
                        System.out.println("Book number " + (i + 1) + ": ");
                        bookBuilder[i].build().getBooksInfor(); //bookBuilder[i].build() -> Will return Book object
                    }
                    break;
                case 3:
                    Scanner scannerSearch = new Scanner(System.in);
                    System.out.print("Input your search by ISBN: ");
                    searchISBN = scannerSearch.nextLine();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Here is your search result: ");
                    for (int i = 0; i < numberOfBooks; i++) {
                        if (searchISBN.equals(bookBuilder[i].build().getISBN())) { //bookBuilder[i].build() -> Will return Book object
                            System.out.println("Book number " + (i + 1) + ": ");
                            bookBuilder[i].build().getBooksInfor(); //bookBuilder[i].build() -> Will return Book object
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Wrong option ! Please try again");
            }
        }
    }
}