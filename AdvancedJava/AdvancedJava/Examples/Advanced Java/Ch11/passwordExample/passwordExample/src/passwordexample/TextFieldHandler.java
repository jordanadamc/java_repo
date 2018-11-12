/**
 * The TextFieldHandler defines how the program will respond to different
 * user inputs into the JTextField.
*/
package passwordexample;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class TextFieldHandler implements ActionListener{
    //Instantiate all the components of the JFrame
    private Container contents;
    private JTextArea instructions, brokenRules;
    private JLabel strength;
    private JTextField usrPWord;
    
    public void actionPerformed( ActionEvent e ){
    /** 
     * Calls on functions to validate each rule
     * if the password followed the rule, the function would return 1
     * if not, the function would return 0.
     */
    String password = usrPWord.getText();
    int length, spChar, lowCase, upCase, digit;
    length = lengthChecker(password);
    spChar = specialCharacter(password);
    upCase = upperCase(password);
    lowCase = lowerCase(password);
    digit = digitize(password);
	
    //Initiate pStrength, and add 1 or 0 depending on what the function returned.
    //the pStrength is the strength out of 5 for the password. 
    int pStrength = 0;
    pStrength = length + spChar + upCase + lowCase + digit;
				
    strength.setText("Your password has a strength of: " + pStrength
				+ " out of 5.");
			
    //Define various outcomes for different strengths.
	if (pStrength == 5){
            brokenRules.setForeground( Color.BLUE );
            brokenRules.setText("Congratulations, you are a password pro!");
	}

	else if (pStrength == 0 ){
            brokenRules.setForeground( Color.RED );
            brokenRules.setText("Are you serious?! you violated every single rule!");
	}
	else{
            brokenRules.setForeground( Color.RED );
            brokenRules.setText("Your password violated the following rule(s):\n");
				
	/**
	 * These rules will appened to the list of brokenRules if any of the functions
	 * returned 0. making it possible for multiple rules to be broken, while also 
	 * allowing any possible combination of broken rules.
	 */
	if (length == 0){
            brokenRules.append("  Rule1: It must have at least 8 characters, "
               		+ "and it must not contain any space character.\n");
	}
				if (spChar == 0)
				{
					brokenRules.append("  Rule2: It must contain at least one special character, "
						+ "which is not a letter or digit.\n");
				}
				if (upCase == 0)
					brokenRules.append("  Rule3: It must contain at least one upper-case letter.\n");
				if (lowCase == 0)
					brokenRules.append("  Rule4: It must contain at least one lower-case letter.\n");
				if (digit == 0)
					brokenRules.append("  Rule5: It must contain at least one digit.\n");
			}	
}
}
