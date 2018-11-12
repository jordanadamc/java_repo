/**
   This program demonstrates the Course class.
*/

public class CourseDemo2
{
   public static void main(String[] args)
   {
      // Create an Instructor object.
      String2 myString2 =
          new String2("Kramer", "Shawn", "RH3010");
      
      // Create a TextBook object.
      String3 myString3 =
          new String3("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create a Course object.
      Course myCourse = 
         new Course("Intro to Java", myString2,
                    myString3);
      
      // Display the course information.
      System.out.println(myCourse);
   }
}