//Project 3
//Kayla Jordan
//2D Array Operations
//Create a 2D array with test data. Create methods and demonstrate getting 
//totals and averages of the array in addition to specified rows and columns of
//the array.
package jordan_k_project3;

import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Jordan_K_Project3 {

    public static void main(String[] args) throws IOException {
        int row = 0;
        int col = 0;
        int[][] testData = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int allValues = getTotal(testData);
        System.out.println("The total of all values is: " + allValues);

        double allAverage = getAverage(testData);
        System.out.printf("The average of all the values is: %.2f", allAverage);
        System.out.println();

        Scanner userRow = new Scanner(System.in);
        System.out.println("Please enter a row from 0-2: ");
        row = userRow.nextInt();
        int totalOfRow = getRowTotal(testData, row);
        System.out.println("The total of row " + row + " is " + totalOfRow);

        Scanner userCol = new Scanner(System.in);
        System.out.println("Please enter a column from 0-2: ");
        col = userCol.nextInt();
        int totalOfColumn = getColumnTotal(testData, col);
        System.out.println("The total of column " + col + " is " + totalOfColumn);

    }

    //Adds the rows and colums together for a total of all values.
    private static int getTotal(int[][] array) throws IOException {
        int total = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
        }
        return total;
    }

    //Gets the average of all values in the array.
    public static double getAverage(int[][] array) throws IOException {
        int total = 0;
        double average = 0;
        double averageTotal = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
                averageTotal = total;
            }
        }
        average = (averageTotal / 6.0);
        return average;
    }

    //Gets the sum of a selected row and returns it back to main.
    public static int getRowTotal(int[][] array, int selectedRow) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            sum += array[selectedRow][row];
        }
        return sum;
    }

    //Gets the sum of a selected column and returns it to the main.
    public static int getColumnTotal(int[][] array, int selectedCol) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {

            sum += array[row][selectedCol];

        }
        return sum;
    }

}
//    public static void getHighestInRow(){
//        
//    }
//    public static void getLowestInRow(){
//        
//    }    

