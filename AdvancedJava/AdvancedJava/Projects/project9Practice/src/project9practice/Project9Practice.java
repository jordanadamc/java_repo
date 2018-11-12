/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project9practice;

import java.util.Scanner;

public class Project9Practice {

    public static void main(String[] args) {          
        String test = "123456789";
        int sum = 0;
        int i;
        
        char[] testArray = test.toCharArray();
        for (i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + " ");            
        }
        for (i = 0; i < testArray.length; i++){
            sum += Character.getNumericValue(testArray[i]);
            //System.out.println(sum);
        }
        System.out.println(sum);
//        for (int j = 0; j < testArray.length; j++){
//            sum = sum + (testArray[j]-'0');
//            System.out.println(sum);
//        }
    }
       
}


