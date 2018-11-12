
package essayclasstest;

import javax.swing.JOptionPane;


public class EssayClassTest {

    public static void main(String[] args) {
        String again = "Y";
        
        //Controls program loop.
        while (again.equalsIgnoreCase("Y")){
            
            EssayClass score = new EssayClass();            

            JOptionPane.showMessageDialog(null, "Essay Grades\n" + "Please enter"
                    + " the point score for the following ");
            
            //Each while loop tests the data entered to make sure it is in the
            //proper range.
            boolean repeatGrammer = false;
            while (repeatGrammer == false){
                String g = JOptionPane.showInputDialog("Grammer: ");
                double userGrammer = Double.parseDouble(g);
                if (userGrammer <= 30){
                    score.setGrammer(userGrammer);
                    repeatGrammer = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Score has to be 30 or "
                            + "less.");
                    repeatGrammer = false;
                }
            }
            
            boolean repeatSpelling = false;
            while (repeatSpelling == false){
                String s = JOptionPane.showInputDialog("Spelling: ");
                double userSpelling = Double.parseDouble(s);
                if (userSpelling <= 20){
                    score.setSpelling(userSpelling);
                    repeatSpelling = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Score has to be 20 or"
                            + " less");
                    repeatSpelling = false;
                }
            }
            
            boolean repeatLength = false;
            while (repeatLength == false){
                String l = JOptionPane.showInputDialog("Correct Length: ");
                double userLength = Double.parseDouble(l);
                if (userLength <=20){
                    score.setLength(userLength);
                    repeatLength = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Score has to be 20 or"
                            + " less");
                    repeatLength = false;
                }
            }
            
            boolean repeatContent = false;
            while (repeatContent == false){
                String c = JOptionPane.showInputDialog("Correct Length: ");
                double userContent = Double.parseDouble(c);
                if (userContent <= 30){
                    score.setContent(userContent);
                    repeatContent = true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Score has to be 30 or "
                            + "less.");
                    repeatContent = false;
                }
            }
            //Calls the calculateGrade method.
            score.calculateGrade();
            
            //Prints grades.
            JOptionPane.showMessageDialog(null, "You scored " +
                    score.getTotalGrade() + " out of 100.\n" + "Your grade is: " 
                    + score.getGrade());
                        
        again = JOptionPane.showInputDialog("Would you like to test another "
                + "essay?\n" + "Please press Y for yes or N for no: ");        
        }
    }
    
}
