class Main {
    public static void main(String[] args) {

        Ocean user1Ocean = new Ocean();
        user1Ocean.addShip(new Ship(1, 1, 1, 5));
        user1Ocean.addShip(new Ship(1, 1, 1, 5));
        user1Ocean.addShip(new Ship(1, 1, 1, 5));
        user1Ocean.addShip(new Ship(1, 1, 1, 5));
        user1Ocean.addShip(new Ship(1, 1, 1, 5));

        User user1 = new User(user1Ocean);
        Ocean player2Ocean = new Ocean();
        player2Ocean.addShip(new Ship());
        player2Ocean.addShip(new Ship());
        player2Ocean.addShip(new Ship());
        player2Ocean.addShip(new Ship());
        player2Ocean.addShip(new Ship());

        User user2 = new User(player2Ocean);




    }
}