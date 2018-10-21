//Project 4

//Kayla Jordan
//Carpet Calculator
//This program gathers the users input the sqft of the carpet, calculates the
//cost of the carpet, and displays the results.

package jordan_k_project4;

import java.util.Scanner;


public class Jordan_K_Project4 {
       
    public static void main(String[] args) {
        double length;
        double width;
        double sqftCost;
        
        RoomDimension cost = new RoomDimension();
        
        //Get the length from the user.
        Scanner userLength = new Scanner(System.in);        
        System.out.println("Please enter the length of the carpet: ");
        length = userLength.nextDouble();
        cost.setLength(length);
        
        //Get the width from the user.
        Scanner userWidth = new Scanner(System.in);
        System.out.println("Please enter the width of the carpet: ");
        width = userWidth.nextDouble();
        cost.setWidth(width);
        
        cost.CalculateArea(length, width);
        System.out.println("Area = " + cost.getArea());
        
        //Get the cost per sqft of carpet.
        Scanner costPerSqft = new Scanner(System.in);
        System.out.println("Please enter the price per sqft of the carpet: ");
        sqftCost = costPerSqft.nextDouble();
        //myObjects(length, width, sqftCost);
        
        RoomCarpet totalCost = new RoomCarpet(cost, sqftCost);
        totalCost.getTotalCost();
        System.out.printf("The total cost of the carpet is: $ %,.2f.", 
                totalCost.getTotalCost());
        
    }
}  

