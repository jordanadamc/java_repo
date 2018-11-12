//Project 7

//Kayla Jordan

//Sum of Digits in a String

//Program that asks the user for a series of single digit numbers. This 
//program will get the sum of those numbers and display them. Program will
//also display the highest and lowest numbers in the string.
package jordan_k_project7;

import java.util.Scanner;
import java.io.IOException;

public class Jordan_K_Project7 {

    public static void main(String[] args) throws IOException {
        String again = "Y";
        String userInput;
        String test;
                               
        while (again.equalsIgnoreCase("Y")){
            
            Scanner another = new Scanner(System.in);
            
            Scanner user = new Scanner(System.in);
            System.out.println("Please enter a series of single digit numbers: "
                    + " ");
            userInput = user.nextLine();
         
            SumOfDigits sumDigits = new SumOfDigits(userInput);
            sumDigits.convertNum(userInput);
            System.out.println("The sum of " + userInput + " = " + 
                    sumDigits.getSum());
            
                                                     
        System.out.println("\n Would you like to play again?");
        System.out.println("Please press Y for yes or N for no: ");
        again = another.nextLine();
        }    
    }
    
    
    
}
 