//Project 1

//Kayla Jordan
//Search an Array
//Create a class with an array and have your main search through it for M. 
package jordan_k_project1;

public class Jordan_K_Project1 {

    //In your main program, search the array and display all of the elements 
    //that begin with 'M'.
    public static void main(String[] args) {
        
        String userInput = "m";
        String[] names = {"Bill", "Mike", "Joe", "Dave", "Sam", "Mary", 
            "George"};
        
        
            for (int i = 0; i < names.length; i++) 
            if (names[i].trim().toLowerCase().startsWith(userInput.toLowerCase()
                )==true)
            {                
                System.out.println(names[i].toString());
            }
       
    }  
}
