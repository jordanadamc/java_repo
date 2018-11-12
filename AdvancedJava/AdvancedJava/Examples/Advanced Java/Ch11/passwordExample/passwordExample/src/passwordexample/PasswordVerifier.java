/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

public class PasswordVerifier extends JFrame {
    private Container contents;
    private JTextArea instructions, brokenRules;
    private JLabel strength;
    private JTextField usrPWord;
    
    public PasswordVerifier(){
        super("Password Strength Tester");
		contents = getContentPane();
		contents.setLayout( new FlowLayout(FlowLayout.LEFT) );

		
		instructions = new JTextArea("Please type your desired password.\n"
                    + "\nYour Password must follow these conditions:\n"
                    + "Rule1: It must have at least 8 characters, and it must "
                        + "not contain any space character.\n"
                    + "Rule2: It must contain at least one special character, "
                        + "which is not a letter or digit.\n"
                    + "Rule3: It must contain at least one upper-case letter.\n"
                    + "Rule4: It must contain at least one lower-case letter.\n"
                    + "Rule5: It must contain at least one digit.");
		instructions.setOpaque(false);
		instructions.setEditable(false);
		
		//This will explain how strong the password entered is.
		strength = new JLabel("");
		
		//This TextArea will display the rules that the password broke.
		brokenRules = new JTextArea("");
		brokenRules.setEditable(false);
		brokenRules.setOpaque(false);
		brokenRules.setForeground( Color.RED);
		
		usrPWord = new JTextField( "", 15 );
		
		contents.add( instructions );
		contents.add( usrPWord );
		contents.add( strength );
		contents.add( brokenRules );
		
		//Create a textFieldHandler to take in user inputs
		TextFieldHandler tfh = new TextFieldHandler();
		
		usrPWord.addActionListener( tfh );	
		
		setSize( 600, 300 );
setVisible( true );
    }
}
