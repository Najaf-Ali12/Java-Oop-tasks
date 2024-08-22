/*1. Online Store Management
•	Scenario: Develop a system to manage products in an online store. 
There are different types of products, such as Electronics and Clothing. Each product has a unique ID, name, and price.
•	Concepts: Classes, Inheritance, Polymorphism, Encapsulation
•Task: Create a base class Product with attributes id, name, and price. 
Create two subclasses Electronics and Clothing, each with an additional attribute
 (warranty for Electronics and size for Clothing). Implement a method displayDetails in each subclass to show product information.
 */
import java.util.Scanner;
class Product{                           //values for attributes are obtained using encapsulation
    String name;
    int id;
    double price;
    public void getDetails(String name, int id, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Name of Product: "+name);
        System.out.println("Id of Product: "+id);
        System.out.println("Price of Product: "+price);
    }
}
//Concept of inheritance is used by both Electronics and Clothing class
class Electronics extends Product{
    String warranty;
    Electronics(String warranty){
        this.warranty=warranty;
    }  //displayDetails() method uses the concept of methodoverriding or Run_time polymorphism.
    public void displayDetails(String name, int id, double price){
        System.out.println("Name of Product: "+name);
        System.out.println("Id of Product: "+id);
        System.out.println("Price of Product: "+price);
        System.out.println("Warranty for product is "+warranty);
    }
}
class Clothing extends Product{
    double size_in_metres;
    Clothing(double size_in_metres){
        this.size_in_metres=size_in_metres;
    }
    public void displayDetails(String name, int id, double price){
        System.out.println("Name of Product: "+name);
        System.out.println("Id of Product: "+id);
        System.out.println("Price of Product: "+price);
        System.out.println("Size of product: "+size_in_metres);
    }
}
public class OnlineStoreManagement{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Product product=new Product();
        product.getDetails("Chair", 04, 1900.90);  

        System.out.println("Enter the name of Electronics Product: ");
        String name=Sc.nextLine();
        System.out.println("Enter the Price of "+name+": ");
        double price=Sc.nextDouble();
        Sc.nextLine();
        System.out.println("Enter the warranty tenure of "+name+": ");
        String warranty=Sc.nextLine();
        System.out.println();
        Electronics electronics=new Electronics(warranty);
        electronics.displayDetails(name,90,price);

        System.out.println("Enter the name of Clothing Product: ");
        String Cloth_name=Sc.nextLine();
        System.out.println("Enter the Price of "+Cloth_name+": ");
        double Cloth_price=Sc.nextDouble();
        System.out.println("Enter the size of "+Cloth_name+" in metres: ");
        double size=Sc.nextDouble();
        System.out.println();
        Clothing clothing =new Clothing(size);
        electronics.displayDetails(name,80,price);
    }
}