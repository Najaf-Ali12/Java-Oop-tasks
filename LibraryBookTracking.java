/*2. Library Book Tracking
•	Scenario: Design a system to keep track of books in a library. Each book has a title, author, publication date, and an ID. 
    There are different types of books: eBooks and Printed Books.
•	Concepts: Classes, Inheritance, Date
•	Task: Create a Book class with relevant attributes and methods. 
Then, create EBook and PrintedBook classes that extend Book. Implement methods to display book details.
*/
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
class Book{
    String title,author;
    LocalDate date_of_publication;
    int id;
    Book(String title, String author, LocalDate publicationDate, int id){
        this.title=title;
        this.author=author;
        this.id=id;
        date_of_publication=publicationDate;
    }
    public void BookDetails(){
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication Date: "+date_of_publication);
    }
}
class Ebook extends Book{
    String title,author;
    LocalDate date_of_publication;
    int id;
    String booktype="Ebook";
    Ebook(String title, String author, LocalDate publicationDate, int id){
        super(title,author,publicationDate,id);
        this.title=title;
        this.author=author;
        this.id=id;
        date_of_publication=publicationDate;
}
    public void BookDetails(){
        System.out.println("Book Type: "+booktype);
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication Date: "+date_of_publication);
    }
}
class PrintedBook extends Book{
    String title,author;
    LocalDate date_of_publication;
    int id;
    String booktype="PrintedBook";
    PrintedBook(String title, String author, LocalDate publicationDate, int id){
        super(title,author,publicationDate,id);
        this.title=title;
        this.author=author;
        this.id=id;
        date_of_publication=publicationDate;
}
    public void BookDetails(){
        System.out.println("Book Type: "+booktype);
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication Date: "+date_of_publication);
    }
}
public class LibraryBookTracking{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter 1. if the book is Ebook, 2. if the book is PrintedBook");
        String choice=Sc.nextLine();
        if (choice.equals("1")){
            System.out.println("Enter the title of book: ");
            String title=Sc.nextLine();
            System.out.println("Enter the name of author of "+title);
            String author=Sc.nextLine();
            System.out.println("Enter the id of "+title);
            int id=Sc.nextInt();
            Sc.nextLine();
            System.out.println("Enter the Publication date of "+title+" in format(2024-12-29):");
            String date_of_publication=Sc.nextLine();
            LocalDate publicationDate=LocalDate.parse(date_of_publication);
            Ebook ebook_obj=new Ebook(title, author,publicationDate, id);
            ebook_obj.BookDetails();
        }
        else if (choice.equals("2")){
            System.out.println("Enter the title of book: ");
            String title=Sc.nextLine();
            System.out.println("Enter the name of author of "+title);
            String author=Sc.nextLine();
            System.out.println("Enter the id of "+title);
            int id=Sc.nextInt();
            Sc.nextLine();
            System.out.println("Enter the Publication date of "+title+" in format(2024-12-29):");
            String date_of_publication=Sc.nextLine();
            LocalDate publicationDate=LocalDate.parse(date_of_publication);
            PrintedBook Printedbook_obj=new PrintedBook(title, author,publicationDate, id);
            ebook_obj.BookDetails();
        }
        else{
            System.out.println("Only those two types of book can be used");
        }
    }
}