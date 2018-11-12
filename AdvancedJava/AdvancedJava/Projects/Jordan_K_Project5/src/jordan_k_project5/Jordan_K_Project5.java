//Project 5

//Kayla Jordan
//Geometry Calculator
//This program calculates the area of a circle, rectangle, and triangle.

package jordan_k_project5;
import java.util.Scanner;


public class Jordan_K_Project5 {

    public static void main(String[] args) {
        int choice;
        
        //Sends the program to the right method depending on the users choice.
        do{
            choice = getMenu();
            
            if (choice == 1){
                calculateCircle();
            }
            else if (choice == 2){
                calculateRectangle();
            }
            else if (choice == 3){
                calculateTriangle();
            }
            else if (choice == 4){
                System.out.println("You have chosen to exit. Bye!");
            }
        } while (choice != 4);              
    }
    
    //This method holds the main menu and returns it to the main.
    public static int getMenu(){
        int userChoice;
        
        Scanner menuChoice = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Geometry Calculator");
        System.out.println("---------------------");
        System.out.println("1. Calculate the area of a circle.");
        System.out.println("2. Calculate the area of a rectangle.");
        System.out.println("3. Calculate the area of a triangle.");
        System.out.println("4. Exit");
        
        System.out.println("Please enter your choice: ");
        userChoice = menuChoice.nextInt();
        
        //Displays error if the user chooses a number out of range.
        while (userChoice < 1 || userChoice > 4){
            System.out.println("Not valid. Please enter a number between 1-4");
            userChoice = menuChoice.nextInt();
        }
        return userChoice;       
    }
    
    //Passes the information from the user to the Geometry class to calculate
    //the area of a circle and prints the results.
    public static void calculateCircle(){
        double radius;
        
        Scanner userRadius = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        radius = userRadius.nextDouble();
        
        System.out.println("The area of the circle is: " 
                + Geometry.areaOfCircle(radius));
    }
    
    //Passes the information from the user to the Geometry class to calculate
    //the area of a rectangle and prints the results.
    public static void calculateRectangle(){
        double length;
        double width;
        
        Scanner userLength = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        length = userLength.nextDouble();
        
        Scanner userWidth = new Scanner(System.in);
        System.out.println("Please enter the width: ");
        width = userWidth.nextDouble();
        
        System.out.println("The area of the rectangle is: " 
                + Geometry.areaOfRectangle(length, width));
    }
    
    //Passes the information from the user to the Geometry class to calculate
    //the area of a triangle and prints the results. 
    public static void calculateTriangle(){
        double base;
        double height;
        
        Scanner userBase = new Scanner(System.in);
        System.out.println("Please enter the base: ");
        base = userBase.nextDouble();
        
        Scanner userHeight = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        height = userHeight.nextDouble();
        
        System.out.println("The area of the triangle is: " 
                + Geometry.areaOfTriangle(base, height));
    }
    
}
