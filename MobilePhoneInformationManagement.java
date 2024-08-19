/*5. Mobile Phone Information:
•	Create a MobilePhone class with attributes like brand, model, price, and storage capacity.
•	Implement methods to display phone details, compare prices of two phones, and check if a phone meets specific requirements
 (e.g., minimum storage).
•	Create an array of MobilePhone objects and find the phone with the highest storage capacity.
 */

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

class MobilePhone{
    String brand, model;
    int storage;
    double price;
    int higheststorage=0;
    int highestprice=0;
    MobilePhone(String brand, String model, int storage, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.storage=storage;
    }
    //print phone details
    public void phonedetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Storage: "+storage+"GB");
        System.out.println("Price: "+price+"PKR");
        System.out.println();
    }//take storage of each mobile and send it to the main method
    public int highestStorage(){
        return storage;
    }//take price of each mobile and send it to the main method
    public double comparePrices(){
        return price;
    }
}
public class MobilePhoneInformationManagement{
    public static void main(String[] args) {
        System.out.println("\3 \3 \3 \3 Welcome to MobilePhone Information Management System \3 \3 \3 \3");
        double highestprice=0;    //variable to keep the highest price and compare with
        double higeststorage=0;   //variable to keep the highest storage and compare with
        String expensivebrand="nothing";  // variable to keep the brand with high price
        String heavybrand="nothing"; //variable to keep the brand with high storage
        ArrayList<MobilePhone> mobileobjects=new ArrayList<>();     //arraylist to store different mobiles
        MobilePhone mobile1=new MobilePhone("Vivo", "S1", 64, 30000.00);
        MobilePhone mobile2=new MobilePhone("Samsung", "Galaxy GrandPrime+", 8, 7000.00);
        MobilePhone mobile3=new MobilePhone("Itel", "I37", 128, 29999.00);
        mobileobjects.add(mobile1);
        mobileobjects.add(mobile2);
        mobileobjects.add(mobile3);
        //take each mobile one by one and then call method to display details of each and also compare their prices
        for (MobilePhone each:mobileobjects){
            each.phonedetails();
            double price=each.comparePrices();
            if (price>=highestprice){
                highestprice=price;
                expensivebrand=each.brand;
            }
        }
        System.out.println(expensivebrand +" has highest price");
        //take each mobile one by one and also compare their storage capacity.
        for (MobilePhone object:mobileobjects){
            int storage=object.highestStorage();
            if (higeststorage<=storage){
                higeststorage=storage;
                heavybrand=object.brand;

            }
        }
        System.out.println(heavybrand+" has largest storage capacity");
    }
}