//Project 5

//Kayla Jordan
//Calculates the area of a circle, rectangle, and triangle and returns it to the
//main.
package jordan_k_project5;
import java.util.Scanner;
import java.math.*;

public class Geometry {
    
    //Accepts the radius args, calculates the area of a circle 
    //and passes it back to the calculateCircle method.
    public static double areaOfCircle(double radius){
       return Math.PI * radius * radius; 
    }
    
    //Accepts the length and width args, calculates the area of a rectangle,
    //and passes it back to the calculateRectangle method.
    public static double areaOfRectangle(double length, double width){
        return length * width;
    }
    
    //Accepts the base and height args, calculates the area of a triangle,
    //and passes it back to the calculateTriangle method.
    public static double areaOfTriangle(double base, double height){
        return base * height * 0.5;
    }
    
    
}
