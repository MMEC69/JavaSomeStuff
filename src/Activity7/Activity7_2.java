/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activity7;

import java.util.Scanner;

/**
 *
 * @author FruitCake
 */
public class Activity7_2 implements Activity7_1{
    @Override
    public void Circle(){
        try(Scanner kb = new Scanner(System.in)){
            System.out.println("Enter the radius of the circle");
            double r = kb.nextInt();
            double areaOfCircle = 3.14 * r*r;
            System.out.println("Area of the circle is "+areaOfCircle);
        }
    }
    
    @Override
    public void Square(){
        try(Scanner kb2 = new Scanner(System.in)){
            System.out.println("Enter the length of the side of the Square");
            double s = kb2.nextInt();
            double areaOfSquare = s * s;
            System.out.println("Area of the square is "+areaOfSquare);
        }
    }
    
    @Override
    public void Rectangle(){
        try(Scanner kb3 = new Scanner(System.in)){
            System.out.println("Enter the length of the Rectangle");
            double l = kb3.nextInt();
            System.out.println("Enter the breadth of the Rectangle");
            double b = kb3.nextInt();
            double areaOfRectangle = l*b;
            System.out.println("Area of the rectangle is "+areaOfRectangle);
        }
    }
    
    @Override
    public void Triangle(){
        try(Scanner kb4 = new Scanner(System.in)){
            System.out.println("Enter the base of the Triangle");
            double base = kb4.nextInt();
            System.out.println("Enter the height of the Triamngle");
            double h = kb4.nextInt();
            double areaOfTriangle = 0.5 * base * h;
            System.out.println("Area of the Triangle is "+areaOfTriangle);
        }
    }
    
    public static void main(String args[]){
        Activity7_2 geometry = new Activity7_2();
        
//        geometry.Circle();
        geometry.Square();
        geometry.Rectangle();
//        geometry.Triangle();
    }
}
