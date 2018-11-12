//Project 4

//Kayla Jordan
//Calculates area and passes information to RoomCarpet Class.
package jordan_k_project4;

public class RoomDimension {

    double length;
    double width;
    double area;

    public RoomDimension() { 
    }

    public RoomDimension(double userLength, double userWidth) {
        this.length = userLength;
        this.width = userWidth;
    }

    public void setLength(double userLength) {
        length = userLength;
    }

    public void setWidth(double userWidth) {
        width = userWidth;
    }

    public void CalculateArea(double length, double width) {
        area = (length * width);
    }
    /**
     *
     * @return area of carpet.
     */
    public double getArea() {
        return area;
    }
    /**
     * toString method
     *
     * @return the length, width, and area as a string.
     */
    public String toString() {
        String str = "Length: " + length + "\nWidth: " + width + "\nArea: " + area;
        return str;
    }
}
