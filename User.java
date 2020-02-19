import java.util.*;

public class User {
    private Map<String, Integer> listOfShips;
    private Map<String, Ship> listOfUsersShip;
    public List<Coordinates> hits;

    public User() {
        this.hits = new ArrayList<>();
        this.listOfShips = new HashMap<>();
        this.listOfUsersShip = new HashMap<>();

        listOfShips.put("Carrier", 5);
        listOfShips.put("Battleship", 4);
        listOfShips.put("Cruiser", 3);
        listOfShips.put("Submarine", 3);
        listOfShips.put("Destroyer", 2);
    }

    public Map<String, Ship> createAndAddShipToList() {
        for (Map.Entry<String, Integer> row : listOfShips.entrySet()) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please provide startingX: ");
            int startingX = scan.nextInt();

            System.out.println("Please provide startingY: ");
            int startingY = scan.nextInt();

            System.out.println("if ship should be horizontal please provide with 'true'");
            Boolean horizontal = scan.nextBoolean();

            Ship ship = new Ship(row.getKey(), horizontal, row.getValue(), startingX, startingY);
            listOfUsersShip.put(row.getKey(), ship);
        }
        return listOfUsersShip;
    }

    public Map<String, Ship> getListOfUsersShip() {
        return listOfUsersShip;
    }

    public void displayShips() {
        for (Map.Entry<String, Ship> entry : listOfUsersShip.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public List<Coordinates> userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("X: ");
        int x = scan.nextInt();
        System.out.println("Y: ");
        int y = scan.nextInt();

        Coordinates coordinates = new Coordinates(x, y);

        if (hits.isEmpty()) {

        }


        // ArrayList<ArrayList<Integer>> allUsersInputs = new ArrayList<>();
        // allUsersInputs(inputs);
        hits.add(coordinates);
        System.out.println(hits);
        return hits;
    }


    // public ArrayList<ArrayList<Integer>> allUsersInputs(ArrayList<Integer> userInput){
    //     ArrayList<ArrayList<Integer>> allUsersInputs = new ArrayList<>();
    //     System.out.println( allUsersInputs.add(userInput));
    //     return allUsersInputs;
    // }
}
