/*4. Library Book Management:
•	Create a Book class with attributes like title, author, ISBN, and availability status.
•	Create a Library class that manages a collection of books.
•	Implement methods to add books, search for books, and check out/return books.
•	Maintain a simple lending history for each book (e.g., who borrowed it, when it was returned).
 */

import java.util.HashMap;
import java.util.Scanner;

class Book{
    String title,author,status;
    int ISBN;

}
class Library{
    HashMap<Integer,HashMap<String,String>> bookstore=new HashMap<>();
    HashMap<String,String> bookData=new HashMap<>();
    HashMap<Integer,String> borrowerdata=new HashMap<>();
    Scanner Sc;
    Library(Scanner Sc){
        this.Sc=Sc;
        bookData.put("title", "The Alchemist");
        bookData.put("author", "Paulo Coelho");
        bookData.put("status", "available");
        bookstore.put(12345, bookData);
    }
    public void addBook(int ISBN){
        HashMap<String,String> newBookData=new HashMap<>();
        if (bookstore.containsKey(ISBN)){
            System.out.println("A Book already exists with same ISBN");
        }
        else{
            System.out.print("Enter the title of book: ");
            String title=Sc.nextLine();
            System.out.print("Enter the author of the book: ");
            String author=Sc.nextLine();
            newBookData.put("title", title);
            newBookData.put("author", author);
            newBookData.put("status", "available");
            bookstore.put(ISBN, newBookData);
            System.out.println("Book added Successfully");
        }
    }
    public void SearchBook(int ISBN){
        if (bookstore.containsKey(ISBN)){
            System.out.println("ISBN: "+ISBN);
            HashMap<String, String> temporarystore=bookstore.get(ISBN);
            for (String each:temporarystore.keySet()){
                System.out.println(each+":"+temporarystore.get(each));
            }
        }
        else{
            System.out.println("Book doesnot exists");
        }
    }
    public void borrowBook(int ISBN){
        for (int isbn:bookstore.keySet()){              //same book can be borrowed multiple times without
            if (isbn==ISBN){                           // being returned
                HashMap<String, String> temporarystore=bookstore.get(isbn);
        for (String each:temporarystore.keySet()){
            if (each.equals("status")){
                if (temporarystore.get(each).equals("available")){
                            System.out.print("Enter the name of borrower: ");
                            String borrower=Sc.nextLine();
                            System.out.println("The book with ISBN number "+ISBN+" is given to "+borrower);
                            borrowerdata.put(ISBN, borrower);
                            temporarystore.remove(each);
                            temporarystore.put("status","not available");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Book is not available");
    }
    public void returnBook(int ISBN){
        for (int isbn:bookstore.keySet()){              //same book can be borrowed multiple times without
            if (isbn==ISBN){                           // being returned
                HashMap<String, String> temporarystore=bookstore.get(isbn);
        for (String each:temporarystore.keySet()){
            if (each.equals("status")){
                if (temporarystore.get(each).equals("not available")){
                    for (Integer ISBNnumber:borrowerdata.keySet()){
                        if (ISBNnumber==ISBN){
                            String borrower=borrowerdata.get(ISBNnumber);
                            System.out.println("The book with ISBN number "+ISBN+" is returned by "+borrower);
                            temporarystore.remove(each);
                            temporarystore.put("status","available");
                            return;
                        }
                    }
                        }
                    }
                }
            }
        }
        System.out.println("Book cannot be returned");
    }

}
public class LibraryBookManagement2{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Library obj=new Library(Sc);
        System.out.println("\3 \3 \3 Welcome to Library Book Management System \3 \3 \3 \3");
        while (true){
            System.out.println("Menu");
            System.out.println("1. Add a new Book");
            System.out.println("2. Search a book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String option=Sc.nextLine();
            if (option.equals("1")){
                System.out.print("Enter the ISBN number of book that you want to add: ");
                int ISBN=Sc.nextInt();
                Sc.nextLine();
                obj.addBook(ISBN);
            }
            else if (option.equals("2")){
                System.out.print("Enter the ISBN number of book that you want to search: ");
                int ISBN=Sc.nextInt();
                Sc.nextLine();
                obj.SearchBook(ISBN);
            }
            else if (option.equals("3")){
                System.out.print("Enter the ISBN number of book that you want to borrow: ");
                int ISBN=Sc.nextInt();
                Sc.nextLine();
                obj.borrowBook(ISBN);
            }
            else if (option.equals("4")){
                System.out.print("Enter the ISBN number of book that you want to return: ");
                int ISBN=Sc.nextInt();
                Sc.nextLine();
                obj.returnBook(ISBN);
            }
            else if (option.equals("5")){
                System.out.println("Thanks a lot to use our services");
                break;
            }
        }
    }
}