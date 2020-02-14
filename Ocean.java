import java.util.ArrayList;
import java.util.List;

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

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    public void hit(Ship newShip, int x, int y) {
        // Ship newShip = new Ship();
        if (newShip.hit(x, y)){
            markSquareAsHitted(x, y, "X");
        }else{
            markSquareAsHitted(x, y, "O");
        }

        
    //     // Iterate over ships and find if ship hitted
    //     for (Ship ship : ships){
    //         boolean hit = ships.contains(x);
    //     }
    //     boolean hit = true;

    //     if (hit) {
    //         markSquareAsHitted();
    //     }


    //     return false;
    }

    public void markSquareAsHitted(int x, int y, String newSymbol) {
        Square symbol = new Square();
        symbol.setSymbol(newSymbol);
        ocean.get(y).set(x, symbol);
    }


}