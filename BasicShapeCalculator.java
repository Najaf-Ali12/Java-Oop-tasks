/*2. Basic Shape Calculator:
•	Create a Shape class with a method to calculate area (abstract).
•	Create subclasses like Circle, Rectangle, and Triangle inheriting from Shape and implementing their respective area calculations.
•	Demonstrate polymorphism by creating an array of Shape objects and calculating the area of each shape using a loop.

 */
interface Shape{
    abstract void calculateArea();
 }
 class Rectangle implements Shape{
    double length,width;
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
     public void calculateArea(){
         System.out.println("The area of rectangle is "+width*length);
     }
 }
 class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
     public void calculateArea(){
         System.out.println("The area of  circle is "+Math.PI*2*radius);
     }
 }
 class Triangle implements Shape{
    double hypotenues, base;
    Triangle(double base, double hypotenues){
        this.hypotenues=hypotenues;
        this.base=base;
    }
     public void calculateArea(){
         System.out.println("Area of the triangle is "+base*hypotenues*0.5);
     }
 }
 public class BasicShapeCalculator{
     public static void main(String[] args) {
        Shape[] arrayofShapeObjects=new Shape[3];
        arrayofShapeObjects[0]=new Rectangle(20.45,15.43);
        arrayofShapeObjects[1]=new Circle(20.32);
        arrayofShapeObjects[2]=new Triangle(30.00,31.00);
        for (Shape object:arrayofShapeObjects){
            object.calculateArea();
        }
     }
}
