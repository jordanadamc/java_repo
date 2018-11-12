//Project 7

//Kayla Jordan
//
package jordan_k_project7;


public class SumOfDigits {
    private String userStr;
    private String userDigits;
    private int userNum;
    private int userSums;
    
    public SumOfDigits(){
        
    }
    public SumOfDigits (String num){
        userStr = num;
    }
    
    //Stores user input in a String array, separates the String into single 
    //digitals, converts String array to int array.    
    public void convertNum(String userStr){
        userDigits = userStr;

        char[] chArray = userDigits.toCharArray();
        for (int i = 0; i < chArray.length; i++){            
        }                
        calculateSum(chArray, userDigits);                                
    }

    public int calculateSum(char[] array, String user){
        userSums = 0;
        
        for (int i = 0; i < array.length; i++){
            userSums += Character.getNumericValue(array[i]);             
        }
        return userSums;
    }
    public int getSum(){
        return userSums;
    }
   
}
