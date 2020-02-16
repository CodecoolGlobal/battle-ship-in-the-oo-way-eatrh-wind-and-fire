import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Ship {
    private List<Coordinates> coordinates;
    private String shipName;
    private Boolean horizontal = true;       // true for horizontal
    private Integer lenght;
    private Integer startingX;
    private Integer startingY;
    private ArrayList<Integer> pointList;
    private ArrayList<ArrayList<Integer>> ship;

    public Ship(String shipName, Boolean horizontal, Integer lenght, Integer startingX, Integer startingY) {
        this.ship = createShip(shipName, horizontal, lenght, startingX, startingY);
    }

    private ArrayList<ArrayList<Integer>> createShip(String shipName, Boolean horizontal, Integer lenght,
            Integer startingX, Integer startingY) {
                ArrayList<ArrayList<Integer>> ship = new ArrayList<>();

        if (horizontal == true) {
            for (int i = 0; i < lenght; i++) {
                ArrayList<Integer> pointList = new ArrayList<>();
                pointList.add(startingX);
                pointList.add(startingY);
                ship.add(pointList);
                startingX++;
            }
            return ship;
        }
        for (int i = 0; i < lenght; i++) {
            ArrayList<Integer> pointList = new ArrayList<>();
            pointList.add(startingX);
            pointList.add(startingY);
            ship.add(pointList);
            startingY++;
        }
        return ship;

    }
    public ArrayList<ArrayList<Integer>> getShip(){
        return ship;
    }
    // public void display() {
    //     for (ArrayList<Integer> points : ship) {
    //         System.out.println(points);
    //     }
    // }
    
}