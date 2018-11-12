//Project 8

//Kayla Jordan
//Essay Class
//This program will determine the students grade for an essay based on user
//imput on 4 areas.

package jordan_k_project8;

import java.util.Scanner;

public class Jordan_K_Project8 {
    
    //This method prompts user for total points in each area: Grammer, Spelling,  
    //Correct Length, and Content and sends data to the EssayClass to calculate.
    //Then it prints the data.
    public static void main(String[] args) {
        String again = "Y";
        
        //Controls program loop.
        while (again.equalsIgnoreCase("Y")){
            
            EssayClass score = new EssayClass();            
            
            System.out.println("Essay Grades");
            System.out.println("--------------");
            System.out.println("Please enter the point score for the "
                    + "following ");
            
            Scanner keyboard = new Scanner(System.in);
            
            //Each while loop tests the data entered to make sure it is in the
            //proper range.
            boolean repeatGrammer = false;
            while (repeatGrammer == false){
                System.out.println("Grammer: ");
                double userGrammer = keyboard.nextInt();
                if (userGrammer <= 30){
                    score.setGrammer(userGrammer);
                    repeatGrammer = true;
                }
                else{
                    System.out.println("Score has to be 30 or less.");
                    repeatGrammer = false;
                }
            }
            
            boolean repeatSpelling = false;
            while (repeatSpelling == false){
                System.out.println("Spelling: ");
                double userSpelling = keyboard.nextInt();
                if (userSpelling <= 20){
                    score.setSpelling(userSpelling);
                    repeatSpelling = true;
                }
                else{
                    System.out.println("Score has to be 20 or less");
                    repeatSpelling = false;
                }
            }
            
            boolean repeatLength = false;
            while (repeatLength == false){
                System.out.println("Correct Length: ");
                double userLength = keyboard.nextInt();
                if (userLength <=20){
                    score.setLength(userLength);
                    repeatLength = true;
                }
                else{
                    System.out.println("Score has to be 20 or less.");
                    repeatLength = false;
                }
            }
            
            boolean repeatContent = false;
            while (repeatContent == false){
                System.out.println("Content: ");
                double userContent = keyboard.nextInt();
                if (userContent <= 30){
                    score.setContent(userContent);
                    repeatContent = true;
                }
                else{
                    System.out.println("Score has to be 30 or less.");
                    repeatContent = false;
                }
            }
            //Calls the calculateGrade method.
            score.calculateGrade();
            
            //Prints grades.
            System.out.println("You scored " + score.getTotalGrade() + " out of"
                    + " 100.");
            System.out.println("Your grade is: " + score.getGrade());
                        
        Scanner another = new Scanner(System.in);
        System.out.println("Would you like to test another essay?");
        System.out.println("Please press Y for yes or N for no: ");
        again = another.nextLine();
        }
            
        
     
    }
    
}
