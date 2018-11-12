//Project 4 

//Kayla Jordan
//Calculates the cost of the carpet and passes it to the main.
package jordan_k_project4;

public class RoomCarpet{
    private double areaOfRoom;
    private double sqftCost;
    private double carpetCost;

/**
 * 
 * @param size area of the room
 * @param cost cost per sqft
 */    
public RoomCarpet(double size, double cost){
    this.areaOfRoom = size;
    this.sqftCost = cost;
}
/**
 *
 * @return totalCost of carpet
 */
public double getTotalCost(){
    carpetCost = sqftCost * areaOfRoom;
    return carpetCost; 
}
}
