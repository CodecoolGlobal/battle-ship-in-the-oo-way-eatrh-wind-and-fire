import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {

    // private Ocean board;
    // public User(Ocean board) {
    //     this.board = board;
    // }

    // public void markBoard() {

    // }
    private Map<String, Integer> listOfShips;
    private Map<String, ArrayList<ArrayList<Integer>>> listOfUsersShip;
    public User(){
        this.listOfShips = new HashMap<>();
        this.listOfUsersShip = new HashMap<>();

        listOfShips.put("Carrier", 5);
        listOfShips.put("Battleship", 4);
        listOfShips.put("Cruiser", 3);
        listOfShips.put("Submarine", 3);
        listOfShips.put("Destroyer", 2);
    }
    public Map<String, ArrayList<ArrayList<Integer>>> createAndaddShipToList(){
        
        for(Map.Entry<String, Integer> row : listOfShips.entrySet()){
            Scanner scan = new Scanner(System.in);
            int startingX = scan.nextInt();
            int startingY = scan.nextInt();
            Boolean horizontal = scan.nextBoolean();
            Ship statek = new Ship(row.getKey(),horizontal, row.getValue(), startingX, startingY);
            listOfUsersShip.put(row.getKey(),statek.getShip());
        }
        return listOfUsersShip;
    }

    public Map<String, ArrayList<ArrayList<Integer>>> getListOfUsersShip(){
        return listOfUsersShip;
    }

    public void displayShips(){
        for(Map.Entry<String, ArrayList<ArrayList<Integer>>> row : listOfUsersShip.entrySet()){
            System.out.println(row.getKey() + row.getValue());
            System.out.println(row.getValue().isEmpty());
        }
    }


}
