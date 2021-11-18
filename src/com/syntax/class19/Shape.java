package com.syntax.class19;

public class Shape {
   // Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code

    double radius;
    public Shape(double radius){
        this.radius=radius;
    }

}
class Circle extends Shape{
    public Circle(double radius){
        super(radius);
    }
  void calculate(){
        double Area=3.14*radius*radius;
        System.out.println(Area);
 }
}