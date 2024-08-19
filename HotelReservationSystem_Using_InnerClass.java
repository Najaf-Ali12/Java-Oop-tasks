import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

class Hotel{
    String hotelName;
    Hotel(String hotelName){
        this.hotelName=hotelName;
    }
    class Room1{
        int roomno=1;
        String roomtype="Double";
        boolean available=true;
        public void ViewRoom(){
            System.out.println("Room no is "+roomno);
            System.out.println("The room type is "+roomtype);
            System.out.println("The room is available: "+available);
        }
    }
    class Room2{
        int roomno;
        String roomtype;
        boolean available;
        Room2(int roomno,String roomtype, boolean available){
            this.roomno=roomno;
            this.roomtype=roomtype;
            this.available=available;
        }
        public void ViewRoom(){
            System.out.println("Room no is "+roomno);
            System.out.println("The room type is "+roomtype);
            System.out.println("The room isavailable: "+available);
        }
    }
    static class staticInnerClass{
        String classtype;
        staticInnerClass(String classtype){
            this.classtype=classtype;
            System.out.println("The type of class is "+classtype);
        }
        public static void ViewClass(){
            System.out.println("This is the inner class method but static");
        }
    }
}
public class HotelReservationSystem_Using_InnerClass{
    public static void main(String[] args) {
        Hotel hotel_obj=new Hotel("Baloch Gareebani Hotel");
        //making objects of inner class
        Hotel.Room2 room2_obj=hotel_obj.new Room2(2,"single",false);
        Hotel.Room2 room3_obj=hotel_obj.new Room2(3,"single",true);
        Hotel.Room2 room4_obj=hotel_obj.new Room2(4,"Doube",false);
        Hotel.Room2 room5_obj=hotel_obj.new Room2(5,"Double",true);
        Hotel.Room2 room6_obj=hotel_obj.new Room2(6,"single",false);
        Hotel.Room1 room1_obj=hotel_obj.new Room1();
        //making an array of inner class objects
        ArrayList<Hotel.Room2> Room2_objects=new ArrayList<>();
        Room2_objects.add(room2_obj);
        Room2_objects.add(room3_obj);
        Room2_objects.add(room4_obj);
        Room2_objects.add(room5_obj);
        Room2_objects.add(room6_obj);
        // calling the inner class method from its objects one by one
        for (Hotel.Room2 each:Room2_objects){
            each.ViewRoom();
            System.out.println();
        }
        //creating an object of static inner class
        Hotel.staticInnerClass staticInnerClassObject=new Hotel.staticInnerClass("Static");
        //Calling a static method of an static inner class using the object of inner class;
        staticInnerClassObject.ViewClass();
        //calling a static method of an static inner class using the name of outerclass.innerclass;
        Hotel.staticInnerClass.ViewClass();
    }
}