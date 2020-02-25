import java.util.ArrayList;


class Main {
    public static void main(String[] args) {
        boolean continueLoop = true;
        
        Ocean user1Ocean = new Ocean();
        User user1 = new User();
        user1.createAndaddShipToList();
        
        System.out.println("-------------------------------");
        
        // Ocean user2Ocean = new Ocean();
        // User user2 = new User();
        // user2.createAndaddShipToList();

        while(continueLoop){
        System.out.println("Player 1 ");
        user1Ocean.display();
        ArrayList<Coordinates> usersInput = new ArrayList<>();
        usersInput = user1.userInput();
        user1Ocean.isHit(usersInput.get(usersInput.size()-1).getX(), usersInput.get(usersInput.size()-1).getY(), user1.getListOfUsersShip());
        user1Ocean.display();
        user1.displayShips();
           
        System.out.println("-------------------------------");
        // System.out.println("Player 2 ");
        // user2Ocean.display();
        // ArrayList<Coordinates> usersInput2 = new ArrayList<>();
        // usersInput2 = user2.userInput();
        // user2Ocean.isHit(usersInput2.get(usersInput2.size()-1).getX(), usersInput2.get(usersInput2.size()-1).getY(), user2.getListOfUsersShip());
        // user2Ocean.display();
        // user2.displayShips();
        }

       

        }
         


    }
