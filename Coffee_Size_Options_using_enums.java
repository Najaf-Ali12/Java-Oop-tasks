/*2. Task: Coffee Size Options
Objective: Build a system to handle coffee size options for an order.

Instructions:

Define an enum CoffeeSize with constants like SMALL, MEDIUM, and LARGE.
Create a class CoffeeOrder that has a CoffeeSize attribute and a method to calculate the price based on the size.
In the main method, create instances of CoffeeOrder with different sizes and display the price for each order.
These tasks will help you understand how to define and use enums for managing a set of related constants in Java.*/
enum CoffeeSize{
    SMALL,
    MEDUIM,
    LARGE
}
class CoffeeOrder{
    CoffeeSize size;
    CoffeeOrder(CoffeeSize size){
        this.size=size;
    }
    public void OrderCoffee(){
        if (size==CoffeeSize.LARGE){
            System.out.println("Customer ordered "+CoffeeSize.LARGE+" Coffee. Its price is 150PKR");
        }
        if (size==CoffeeSize.MEDUIM){
            System.out.println("Customer ordered "+CoffeeSize.MEDUIM+" Coffee.Its price is 100PKR");
        }
        if (size==CoffeeSize.SMALL){
            System.out.println("Customer ordered "+CoffeeSize.SMALL+" Coffee. Its price is 80PKR");
        }
    }
}
public class Coffee_Size_Options_using_enums{
    public static void main(String[] args) {
        CoffeeOrder ordertype=new CoffeeOrder(CoffeeSize.LARGE);
        CoffeeOrder ordertype2=new CoffeeOrder(CoffeeSize.MEDUIM);
        CoffeeOrder ordertype3=new CoffeeOrder(CoffeeSize.SMALL);
        ordertype.OrderCoffee();
        ordertype2.OrderCoffee();
        ordertype3.OrderCoffee();
    }
}