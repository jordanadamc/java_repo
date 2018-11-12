/**
   This class stores data about a course.
*/

public class Course2
{
   private String courseName;      // Name of the course
   private String2 string2;  // The instructor
   private String3 string3;      // The textbook

   /**
      This constructor initializes the courseName,
      instructor, and text fields.
      @param name The name of the course.
      @param instructor An Instructor object.
      @param text A TextBook object.
   */

   public Course2(String name, String2 instr,
                 String3 text)
   {
      // Assign the courseName.
      courseName = name;

      // Create a new Instructor object, passing
      // instr as an argument to the copy constructor.
      string2 = new String2(instr);

      // Create a new TextBook object, passing
      // text as an argument to the copy constructor.
      string3 = new String3(text);
   }

   /**
      getName method
      @return The name of the course.
   */

   public String getName()
   {
      return courseName;
   }

   /**
      getInstructor method
      @return A reference to a copy of this course's
              Instructor object.
   */

   public String2 getInstructor()
   {
      // Return a copy of the instructor object.
      return new String2(instructor);
   }

   /**
      getTextBook method
      @return A reference to a copy of this course's
              TextBook object.
   */

   public String3 getTextBook()
   {
      // Return a copy of the textBook object.
      return new String3(textBook);
   }

   /**
      toString method
      @return A string containing the course information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Course name: " + courseName +
                   "\nInstructor Information:\n" +
                   instructor +
                   "\nTextbook Information:\n" +
                   textBook;

      // Return the string.
      return str;
   }
}