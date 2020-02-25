import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Ocean {
    private int width;
    private int height;
    public List<ArrayList<Square>> ocean;
    
    private List<Ship> ships;

    
    public Ocean() {
        this.width = 10;
        this.height = 10;
        this.ocean = new ArrayList<>();
    

        for (int i = height; i > 0; i--) {
            ArrayList<Square> nestedList = new ArrayList<>();
            for (int x = width; x > 0; x--) {
                nestedList.add(new Square());
            }
            ocean.add(nestedList);
        }

        this.ships = new ArrayList<>();
    }

    public void display() {
        System.out.println("  A B C D E F G H I J");
        System.out.println("  ___________________");
        System.out.println(" ");

        int i = 0;
        for (List<Square> list : ocean) {
            System.out.print(i + " ");
            for (Square symbol : list) {
                System.out.print(symbol.getSquare() + " ");
            }
            System.out.println(" ");
            i = i + 1;
        }
        System.out.println("  ___________________");
    }


    public boolean isHit(int x, int y,Map<String, ArrayList<Coordinates>> listOfUsersShip) {
        for(Map.Entry<String, ArrayList<Coordinates>> ship : listOfUsersShip.entrySet()){
            for(Coordinates coordinates : ship.getValue()){
                if(coordinates.getX() == x && coordinates.getY() == y){
                    coordinates.setX(-1); 
                    coordinates.setY(0);
                    System.out.println("hit");
                    markSquareAsHitted(x, y, "X");
                    isSunk(listOfUsersShip);
                    return true;
                }
            }
        }
        System.out.println("you missed");
        markSquareAsHitted(x, y, "0");
        return false;
    }
    public Map<String,ArrayList<Coordinates>> isSunk(Map<String, ArrayList<Coordinates>> listOfUsersShip){
        for(Map.Entry<String, ArrayList<Coordinates>> ship : listOfUsersShip.entrySet()){
            int sumOfCordinates = 0;
            for(Coordinates cordinates : ship.getValue()) {
               sumOfCordinates = sumOfCordinates + cordinates.getX() + cordinates.getY(); 
            }if (sumOfCordinates == (-1 * ship.getValue().size())){ 
                System.out.println(" & sunk");
                listOfUsersShip.remove(ship.getKey(), ship.getValue()); 
                return listOfUsersShip;
            }
        } return listOfUsersShip;
    }

    public void markSquareAsHitted(int x, int y, String newSymbol) {
        Square symbol = new Square();
        symbol.setSymbol(newSymbol);
        ocean.get(y).set(x, symbol);
    }

    }

    


