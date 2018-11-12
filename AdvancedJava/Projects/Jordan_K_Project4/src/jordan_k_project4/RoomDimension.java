//Project 4

//Kayla Jordan
//Calculates area and passes information to RoomCarpet Class.
package jordan_k_project4;

public class RoomDimension  {
    double length;
    double width;
    double area;
   // double userLength;
   // double userWidth;    
    
public RoomDimension(double userLength, double userWidth){
    this.length = userLength;
    this.width = userWidth;
}

public double getLength()
{
    return length;
}
public double getWidth()
{
    return width;
}

public void setLength(double userLength){
   this.length = userLength;
}

public void setWidth(double userWidth){
    this.width = userWidth;
}
    
/**
*
* @param length
* @param width
*/
public void CalculateArea(double length, double width){        
    area = (length * width);
}
/** 
 * 
 * @return area
 */
public double getArea(){
    return area;
}
/**
 *  toString method
 * @return the length, width, and area 
 */
public String toString(){
    String str = "Length: " + length + "\nWidth: " + width + "\nArea: " + area;
    return str;
}
}
