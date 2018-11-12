//Project 8

//Kayla Jordan
//This class accepts user input from the main, calculates the essay grade, and
//sends the grade to the Graded Activity class to get the letter grade.
package jordan_k_project8;

public class EssayClass extends GradedActivity{
    private double grammer;
    private double spelling;
    private double length;
    private double content;
    private double totalGrade;

public EssayClass(){
    
}
//Calculates the grade based on user input.
public double calculateGrade(){
    totalGrade = (grammer + spelling + length + content);
    setScore(totalGrade);
    return totalGrade;
}
//Sets each field.
public void setGrammer(double g){
    grammer = g;   
}
public void setSpelling(double s){
    spelling = s;
}
public void setLength(double l){
    length = l;
}
public void setContent(double c){
    content = c;
}
//Returns each field if needed.
public double getGrammer(){
    return grammer;
}
public double getSpelling(){
    return spelling;
}
public double getLength(){
    return length;
}
public double getContent(){
    return content;
}
public double getTotalGrade(){
    return totalGrade;
}

}
