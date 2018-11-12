//Project 4 
//Kayla Jordan
//Calculates the cost of the carpet and passes it to the main.
package jordan_k_project4;

public class RoomCarpet {

    private final RoomDimension roomDim;
   // private double sqftCost;
    private final double carpetCost;

    /**
     *
     * @param dim area of the room
     * @param cost cost per sqft
     */

    public RoomCarpet(RoomDimension roomDimension, double cost) { //parameterized constructor
           this.roomDim = roomDimension;
           this.carpetCost = cost;
    }

    public RoomDimension getDimension() {
        return roomDim;
    }

    public double getTotalCost() {

        return carpetCost * roomDim.getArea(); //* RoomDimension.getArea();
    }
}
