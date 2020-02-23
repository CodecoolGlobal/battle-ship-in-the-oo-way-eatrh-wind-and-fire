import java.util.ArrayList;
import java.util.List;


class Ship {
    private String ShipName;
    private Integer startingX;
    private Integer startingY;
    private boolean horizontal;
    private Integer lenght;
    private ArrayList<Coordinates> coordinates;


    // private ArrayList<ArrayList<Integer>> ship;

    public Ship(String shipName, Boolean horizontal, Integer lenght, Integer startingX, Integer startingY) {
       this.ShipName = shipName;
       this.startingX = startingX;
       this.startingY = startingY;
       this.horizontal = horizontal;
       this.lenght = lenght;
       this.coordinates = new ArrayList<>();
       calculateCoordinates(horizontal, lenght, startingX, startingY);
       
        // this.ship = createShip(shipName, horizontal, lenght, startingX, startingY);
    }

    private void calculateCoordinates(Boolean horizontal, Integer lenght,
            Integer startingX, Integer startingY) {
           

        if (horizontal) {
            for (int i = 0; i < lenght; i++) {
                Coordinates coordinate = new Coordinates(startingX, startingY);
                this.coordinates.add(coordinate);
                startingX++;
            }
           
        }
        for (int i = 0; i < lenght; i++) {
            Coordinates coordinate = new Coordinates(startingX, startingY);
            this.coordinates.add(coordinate);
            startingY++;
        }
    }
    public ArrayList<Coordinates> getShip(){
        return coordinates;
    }
    
}