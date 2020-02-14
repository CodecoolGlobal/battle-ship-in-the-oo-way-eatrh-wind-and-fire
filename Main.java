import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        boolean q = true;
        Ocean user1Ocean = new Ocean();
        user1Ocean.display();
        while(q = true){
        Ship ship = new Ship("Maniek", false, 5, 2, 2);
        Scanner scX = new Scanner(System.in);
        Scanner scY = new Scanner(System.in);

        System.out.println("X: ");
        Integer x = scX.nextInt();
        System.out.println("Y: ");
        Integer y = scY.nextInt();
        user1Ocean.hit(ship, x, y);
        user1Ocean.display();

        }
                // Ocean user1Ocean = new Ocean();
        // user1Ocean.addShip(new Ship("Maniek", true, 5, 1, 1));
        // user1Ocean.display();
                // Ship ship = new Ship("Maniek", true, 3, 2, 2);
        // Ship shiper = new Ship("Maniek", true, 4, 2, 1);

        // ship.display();
        // ship.hit(3, 2);     // checks if user hit ship and return output message
            //  user1Ocean.hit(ship, 5, 2); 
            //  user1Ocean.display();        // check if user hit ship and return updated ocean board
            //  user1Ocean.hit(ship, 4, 2);
        // user1Ocean.markSquareAsHitted(0, 7);
        // user1Ocean.markSquareAsHitted(0, 0);
        // user1Ocean.markSquareAsHitted(4, 5);

   

            //  user1Ocean.display();

     
        // shiper.display();
        // shiper.hit(4, 4);

        // user1Ocean.addShip(new Ship(1, 1, 1, 5));
        // user1Ocean.addShip(new Ship(1, 1, 1, 5));
        // user1Ocean.addShip(new Ship(1, 1, 1, 5));
        // user1Ocean.addShip(new Ship(1, 1, 1, 5));

        // User user1 = new User(user1Ocean);
        // Ocean player2Ocean = new Ocean();
        // player2Ocean.addShip(new Ship());
        // player2Ocean.addShip(new Ship());
        // player2Ocean.addShip(new Ship());
        // player2Ocean.addShip(new Ship());
        // player2Ocean.addShip(new Ship());

        // User user2 = new User(player2Ocean);




    }
}