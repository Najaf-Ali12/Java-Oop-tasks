/*3. Task: Shape Drawing Application
Objective: Develop an application that can handle different shapes and their properties.

Instructions:

Create an abstract class Shape with attributes like color and borderWidth.
Define abstract methods for calculating area and drawing the shape.
Implement subclasses like Circle, Rectangle, and Triangle that extend Shape and provide specific calculations and drawing methods.
Use an interface Resizable to define a method resize() and implement it in the shape subclasses. */
abstract class Shape{
    String color="Blue";
    int borderWidth=6;
    abstract CalculateArea();
    abstract DrawShape();
}
interface Resizable{
    abstract resize(){
        System.out.println("cHECKING ABSTRACTION");
    } 
}
class Circle extends Shape implements Resizable{
    public void CalculateArea(double radius){
        System.out.println("The radius of circle is "+Math.PI*2*radius);
    }
    public void DrawShape(){
        System.out.println("Drawing the shape of Circle");
    }
    public void resize(double newRadius){
        System.out.println("After resizing the area of circle is "+Math.PI*2*newRadius);
    }
}
class  Triangle extends Shape implements Resizable{
    public void CalculateArea(double base,double hypoteneus){
        System.out.println("The area of Triangle is "+ (base*hypoteneus*1/2));
    }
    public void DrawShape(){
        System.out.println("Drawing the shape of Triangle");
    }
    public void resize(double newbase, double newhypoteneus){
        System.out.println("After resizing the area of triangle is "+(newbase*newhypoteneus*1/2));
    }
}
class Rectangle extends Shape implements Resizable{
    public void CalculateArea(double width, double height){
        System.out.println("The area of rectangle is "+(width*height));
    }
    public void DrawShape(){
        System.out.println("Drawing the shape of Rectangle");
    }
    public void resize(double newwidth,double newheight){
        System.out.println("After resizing the area of rectangle is "+(newwidth*newheight));
    }
}
public class ShapeDrawingApplication_using_Abstraction{
    public static void main(String[] args) {
        Circle circle_obj=new Circle();
        circle_obj.CalculateArea(20.00);
        circle_obj.DrawShape();
        circle_obj.resize(10.90);
        System.out.println();
        System.out.println("Watch triangle");
        Triangle triangle_obj=new Triangle();
        triangle_obj.CalculateArea(20.00,10.90);
        triangle_obj.DrawShape();
        triangle_obj.resize(10.90,9.8);
        System.out.println();
        System.out.println("Watch Rectangle");
        Rectangle Rectangle_obj=new Rectangle();
        Rectangle_obj.CalculateArea(20.00,10.00);
        Rectangle_obj.DrawShape();
        Rectangle_obj.resize(10.90,20.89);
    }   
}