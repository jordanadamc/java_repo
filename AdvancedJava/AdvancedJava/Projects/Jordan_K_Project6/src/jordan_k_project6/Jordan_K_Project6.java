//Project 6

//Kayla Jordan
//Password Verifier
//This program prompts the user to enter a password and then checks the input
//to make sure it meets the criteria.

package jordan_k_project6;

import java.util.Scanner;
import java.io.IOException;

public class Jordan_K_Project6 {
    
    //Prompts user for password and passes input as argument to the 
    //verifyLen method in the PasswordVerify class.
    
    public static void main(String[] args) throws IOException {
        
        String userPassword = "";
        String digit;
        String cap;
        String low;
        boolean valid;
        String again = "Y";
        
        //Controls program loop. 
        while (again.equalsIgnoreCase("Y")){
            
            Scanner another = new Scanner(System.in);
            Scanner keyboard = new Scanner(System.in);
        
        
            //Password rules.
            System.out.println("Create a new password.");
            System.out.println("Your password must:\n" + "1. Be at least eight " +
                "characters long.\n" + "2. Contain an uppercase letter.\n" + 
                "3. Contain a lowercase letter.\n" + "4. Contain a numeric " +
                "digit.\n");
        
            System.out.println("Please enter a password");
            userPassword = keyboard.nextLine();
        
            
            PasswordVerify newPass = new PasswordVerify(userPassword);
            
            valid = newPass.verifyLen(userPassword);
            
            //Gets data from verifyLen method and prints out any issues with 
            //password.
            if (valid){
                System.out.println("\nThank you. Your password has been set");
            }
            else {
                digit = newPass.getIsDigit();
                System.out.println("\n" + digit);
            
                cap = newPass.getIsUpper();
                System.out.println(cap);
            
                low = newPass.getIsLower();
                System.out.println(low);
            }
            
        System.out.println("\nWould you like to create a new password?");
        System.out.println("Press Y for yes and N for no: \n");
        again = another.nextLine();
        }
                                 
    } 
    
}
