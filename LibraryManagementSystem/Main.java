package LibraryManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidIndexException {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while(true) {
            System.out.println("Hello There, What would you like to do?");
            System.out.println("1. Issue a book\n2. Return a book\n3. Add new book\n4. Exit");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Enter the name of book: ");
                    String rentName = sc.next();
                    library.rentBook(rentName);
                    break;
                case 2:
                    System.out.println("Enter name of book to return: ");
                    String returnName = sc.next();
                    library.returnBook(returnName);
                    break;
                case 3:
                    System.out.println("Enter name, price, genre and quantity of books to add:");
                    String name = sc.nextLine();
                    sc.next();
                    float price = sc.nextFloat();
                    String genre = sc.nextLine();
                    sc.next();
                    int quantity = sc.nextInt();
                    try {
                        library.addNewBook(name, price, genre, quantity);
                    }
                    catch (InvalidIndexException e){
                        System.out.println("Exception occured");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!!");
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option.");
            }
        }
    }
}
