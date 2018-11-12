//Project 6

//Kayla Jordan
//Accepts user input as an argument and checks the password to make sure it 
//meets the criteria.

package jordan_k_project6;

public class PasswordVerify {
    
    private String password;
    private boolean hasNum;
    private boolean hasCap;
    private boolean hasLow;
    private String digit;
    private String cap;
    private String low;
    private String isValid;
    private String nothing = "";
    char c;
        
    public void PasswordVerify(){
    }
    
    public PasswordVerify(String pass){
        password = pass;            
    }
    
    //This method checks the length of the password with a nested loop for  
    //checkNum method.
    public boolean verifyLen (String password){
                
        if (password.length() >= 8){            
            if (checkNum(password)){                
                return true;
            }
            else{
                return false;
            }
        }
        else {
            System.out.println("Password is too short. Please try "
                          + "again.");            
            return false;
        }
    }
    //This method checks the other rules for the password.
    public boolean checkNum (String password){
        hasNum = false;
        hasCap = false;
        hasLow = false;
        
        for (int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            
            if (Character.isDigit(c)){
                hasNum = true;
            }
            else if (Character.isUpperCase(c)) {
                hasCap = true;                
            }
            else if (Character.isLowerCase(c)){
                hasLow = true;
            }
        }
        if (hasNum && hasCap && hasLow){
            return true;
        }
        return false;
    }
    
    //Returns message to the main if password is missing a digit.
    public String getIsDigit (){
        this.digit = "Missing digit.";
                
        if (hasNum != true){           
            return this.digit;
        }
        else {
            return nothing;
        }        
    }
    //Returns message to the main if password is missing an uppercase letter.
    public String getIsUpper (){
        this.cap = "Missing uppercase letter.";
        
        if (hasCap != true){
            return this.cap;
        }
        else {
            return nothing;            
        }        
    }
    //Returns message to the main if password is missing a lowercase letter.
    public String getIsLower(){
        this.low = "Missing lowercase letter.";
        
        if (hasLow != true){           
            return this.low;
        }
        else {
            return nothing;
        }
    }
     
}
