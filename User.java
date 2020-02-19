import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {


    private Map<String, Integer> listOfShips;
    private Map<String, ArrayList<ArrayList<Integer>>> listOfUsersShip;
    public ArrayList<ArrayList<Integer>> allUsersInputs;
    public User(){
        this.allUsersInputs = new ArrayList<>();
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
            System.out.println("Please provide startingX: ");
            int startingX = scan.nextInt();
            System.out.println("Please provide startingY: ");
            int startingY = scan.nextInt();
            System.out.println("if ship should be horizontal please provide with 'true'");
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
        }
    }

    public ArrayList<ArrayList<Integer>> userInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("X: ");
        Integer x = scan.nextInt();
        System.out.println("Y: ");
        Integer y = scan.nextInt();

        ArrayList<Integer> inputs = new ArrayList<>();
        inputs.add(x);
        inputs.add(y);
        if(allUsersInputs.contains(inputs)){
            userInput();
        }
        // ArrayList<ArrayList<Integer>> allUsersInputs = new ArrayList<>();
        // allUsersInputs(inputs);
        allUsersInputs.add(inputs);
        System.out.println(allUsersInputs);
        return allUsersInputs;
    }
    // public ArrayList<ArrayList<Integer>> allUsersInputs(ArrayList<Integer> userInput){
    //     ArrayList<ArrayList<Integer>> allUsersInputs = new ArrayList<>();
    //     System.out.println( allUsersInputs.add(userInput));
    //     return allUsersInputs;
    // }
}
