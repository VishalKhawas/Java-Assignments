package LibraryManagementSystem;

import java.util.ArrayList;

public class Library extends Book{
    ArrayList<Book> books=new ArrayList<>();

    public Library(){
        System.out.println("Welcome to Vishal's Library Management System");
    }

    public void addNewBook(String name, float price, String genre, int quantity) throws InvalidIndexException{
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getName().equals(name)){
                int x=books.get(i).getQuantity();
                books.get(i).setQuantity(x+quantity);
                return;
            }
        }
        Book b=new Book(books.size(), name, price, genre, quantity);
        books.add(b);
        System.out.println("Book Added Succesfully.");
    }

    public void rentBook(String name){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getName().equals(name)){
                if(books.get(i).getQuantity()==0) System.out.println("Book not available currently.");
                else{
                    int x=books.get(i).getQuantity();
                    books.get(i).setQuantity(x-1);
                    System.out.println("Book issued succesfully.");
                }
                return;
            }
        }
        System.out.println("Book not available");
    }

    public void returnBook(String name){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getName().equals(name)){
                int x=books.get(i).getQuantity();
                books.get(i).setQuantity(x+1);
                System.out.println("Book return successful.");
                return;
            }
        }
    }
}
