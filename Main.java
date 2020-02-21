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
        
        // Scanner scan = new Scanner(System.in);
        // System.out.println("X: ");
        // Integer x = scan.nextInt();
        // System.out.println("Y: ");
        // Integer y = scan.nextInt();
        ArrayList<ArrayList<Integer>> usersInput = new ArrayList<>();
        usersInput = user1.userInput();
        user1Ocean.isHit(usersInput.get(usersInput.size()-1).get(0), usersInput.get(usersInput.size()-1).get(1), user1.getListOfUsersShip());
        user1Ocean.display();
        user1.displayShips();
            System.out.println("-------------------------------");


        // System.out.println("X: ");
        // Integer x2 = scan.nextInt();
        // System.out.println("Y: ");
        // Integer y2 = scan.nextInt();    
        
                // user2Ocean.isHit(user2.userInput().get(0), user2.userInput().get(1), user2.getListOfUsersShip());
                // user2Ocean.display();
                // user2.displayShips();
        }

       

        }
         


    }
