//Project 9

//Kayla Jordan
//Reading a File
//This program creates a file with a list of names and then reads the file and
//displays to the user. 
package jordan_k_project9;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

//Create a text file that contains:
//
//Bob Jones
//Mike Smith
//Dave Anderson
//Mary Johnson
//Sam Watkins
//Tom Harding
//
//Write a Java program that uses a try/catch block to open and read the contents 
//of the file. 
//Each line of the file should be stored in an array of text Strings.
//After you complete reading the file, display the contents of the array to the 
//screen.
public class Jordan_K_Project9 {

    public static void main(String[] args) throws IOException {
           
        String[] names = { "Bob Jones ", "Mike Smith ", "Dave Anderson ", 
            "Mary Johnson ", "Sam Watkins ", "Tom Harding ", "i love you" };
        
        WriteReadNames readWrite = new WriteReadNames();
        readWrite.writeToArray(names);
        readWrite.writeFile();
        
        System.out.println("File name:" + readWrite.getName());
        readWrite.readFile();
        
        

    }
    
}
