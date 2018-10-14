//Practice array for project 1.
//Search an Array
package firstarraypractice;

public class FirstArrayPractice {

  
    public static void main(String[] args) {
        String[] names = {"Bill", "Mike", "Joe", "Dave", "Sam", "Mary", 
            "George"};
        int results = nameSearch(names, "M");
        
        if (results == -1 ) {
           System.out.println("Did not find any names that start with M");
        }
        else {
            System.out.println("The names that start with M are: " + 
                    (results + 1));
        }
    }
    public static int nameSearch(String[] array, String value){
        int index;
        int element;
        boolean found;
        
        // Element 0 is the starting point of the search.
        index = 0;
        
        // Store the default values element and found.
        element = -1;
        found = false;
        
        //Search the array.
        while (!found && index < array.length){
            if (array[index] == value){
                found = true;
                element = index;
            }
            index++;
        }
        //String nameResults = Integer.toString(element);        
        return element;
    }
}
