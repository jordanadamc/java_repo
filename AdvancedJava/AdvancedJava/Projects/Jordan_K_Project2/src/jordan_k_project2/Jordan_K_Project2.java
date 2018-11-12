//Project 2

//Kayla Jordan
//Sort an Array
//Create an array of ints. Sort them and display results.
package jordan_k_project2;

public class Jordan_K_Project2 {
    //This program will sort an array of numbers and display the results.
    public static void main(String[] args) {
        int [] numbers = {12, 193, 56, 74, 9, 34, 165, 102, 154, 63, 19, 49 };
                
        //Send to numberSort method to sort.
        numberSort(numbers);
        
        //Display sorted array.
        System.out.println("The sorted array: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + "");
        }
    }
    //This method sorts the array.
    public static void numberSort(int[] array){
        int startScan, index, minIndex, minValue;
        
        for (startScan = 0; startScan < (array.length-1); startScan++){
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++){
                if (array[index] < minValue){
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array [startScan] = minValue;
        }
    }    
}
