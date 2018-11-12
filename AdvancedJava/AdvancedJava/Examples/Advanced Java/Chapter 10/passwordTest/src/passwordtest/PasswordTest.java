//Password test

package passwordtest;

import java.util.Scanner;

public class PasswordTest {

    public static void main(String[] args) {
        String password;
        
        Scanner keyboard = new Scanner(System.in);
    
        System.out.println("Create a new password.");
        System.out.println("Your password must:\n" + "1. Be at least eight " +
                "characters long.\n" + "2. Contain an uppercase letter.\n" + 
                "3. Contain a lowercase letter.\n" + "4. Contain a numeric " +
                "digit.\n");
        System.out.println("Please enter a password");
        password = keyboard.nextLine();
        
        System.out.println(verifyLen(password));
            
        
    }
    //Be at least eight characters long
    //Contain an uppercase letter
    //Contain a lowercase letter
    //Contain a numeric digit
    
    public static boolean verifyLen(String password){
        if (password.length() >= 8){
            
            if (checkPass(password)){
                return true;
            }
            else {
                return false;
            }                        
        }
        else {
            System.out.println("Your password is too short");
            return false;
        }
    }
    public static boolean checkPass(String password){
        boolean hasNum = false;
        boolean hasCap = false;
        boolean hasLow = false;
        char c;
        
        for (int i = 0; i < password.length(); i++){
            
            c = password.charAt(i);
            
            if (Character.isDigit(c)){
                hasNum = true;
            }
            else if (Character.isUpperCase(c)){
                hasCap = true;
            }
            else if (Character.isLowerCase(c)){
                hasLow = true;
            }
        }
        if (hasNum && hasCap && hasLow){
           return true; 
        }
        return false;        
    }
}
