import java.util.*;

public class User {
    private Map<String, Integer> listOfShips;
    private Map<String, Ship> listOfUsersShip;
    private List<Coordinates> hits;

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

    public void createAndAddShipToList() {
        for (Map.Entry<String, Integer> row : listOfShips.entrySet()) {
            Scanner scan = new Scanner(System.in);

            List<Integer> shipCoordinatesFromUser = getShipCoordinatesFromUser();
            System.out.println("if ship should be horizontal please provide with 'true'");
            Boolean horizontal = scan.nextBoolean();

            Ship ship = new Ship(
                    row.getKey(),
                    horizontal,
                    row.getValue(),
                    shipCoordinatesFromUser.get(0),
                    shipCoordinatesFromUser.get(1));

            listOfUsersShip.put(row.getKey(), ship);
        }
    }

    private List<Integer> getShipCoordinatesFromUser() {
        Scanner scan = new Scanner(System.in);
        List<Integer> coordinates = new ArrayList<>();

        int startingX = 0;
        int startingY = 0;

        boolean continueAsk = true;
        while (continueAsk) {
            System.out.println("Please provide startingX: ");
            startingX = scan.nextInt();

            System.out.println("Please provide startingY: ");
            startingY = scan.nextInt();

            boolean existingCoordinates = areCoordinatesAlreadyChosen(startingX, startingY);
            if (!existingCoordinates) {
                continueAsk = false;
            } else {
                System.out.println("You have already provided given coordinates! Please Try again!");
            }
        }

        coordinates.add(startingX);
        coordinates.add(startingY);

        return coordinates;
    }

    private boolean areCoordinatesAlreadyChosen(int x, int y) {
        boolean exists = false;
        for (Map.Entry<String, Ship> entry : listOfUsersShip.entrySet()) {
            Ship existingShip = entry.getValue();
            if (existingShip.containsCoordinate(x, y)) {
                exists = true;
            }
        }

        return exists;
    }

    public void printUserShips() {
        for (Map.Entry<String, Ship> entry : listOfUsersShip.entrySet()) {
            Ship ship = entry.getValue();
            System.out.println(
                    entry.getKey() + ": " + ship.getCoordinates()
            );
        }
    }

}
