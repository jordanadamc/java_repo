//Project 4 

//Kayla Jordan
//Calculates the cost of the carpet and passes it to the main.
package jordan_k_project4;

public class RoomCarpet{
    private RoomDimension size;
    private double sqftCost;
    private double carpetCost;

/**
 * 
 * @param dim area of the room
 * @param cost cost per sqft
 */    
public RoomCarpet(RoomDimension dim, double cost){
    size = new RoomDimension(dim);
    sqftCost = cost;
}

//public static void RoomCarpet(RoomDimension dim, double cost){
//    
//}
public RoomDimension getDimension(){
    return new RoomDimension(size);
}
//public double getAreaOfRoom(){
//    Double areaOfRoom = getArea();
//}

    /**
     *
     * @return totalCost of carpet
     */
    public double getTotalCost(){
        
    return sqftCost * size.getArea(); //* RoomDimension.getArea();
}
//public 
}
