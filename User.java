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
            int startingX = 0;
            int startingY = 0;
            boolean continueAsk = true;
            while(continueAsk){
                System.out.println("Please provide startingX: ");
                startingX = scan.nextInt();
                
                System.out.println("Please provide startingY: ");
                startingY = scan.nextInt();
            
                Boolean existingCordinates =  checkForDublleCordinates(listOfUsersShip, startingX, startingY);
                if(!existingCordinates){
                    continueAsk = false;
                }else{
                    System.out.println("wrong coordinates! Please Try again!");
                   
                }
        }
            System.out.println("if ship should be horizontal please provide with 'true'");
            Boolean horizontal = scan.nextBoolean();
            
            
            Ship ship = new Ship(row.getKey(),horizontal, row.getValue(), startingX, startingY);
            listOfUsersShip.put(row.getKey(),ship.getShip());
        }
    
        return listOfUsersShip;
    }

    public boolean checkForDublleCordinates(Map<String, ArrayList<ArrayList<Integer>>> listOfUsersShip, int startingX, int startingY){
        if(startingX > 10 || startingX < 0 || startingY > 10 || startingY < 0){
            System.out.println("coordinates out of range");
            return true;
        }else{
        ArrayList<Integer> cordinatesToCheck = new ArrayList<>();
        cordinatesToCheck.add(startingX);
        cordinatesToCheck.add(startingY);
        for(Map.Entry<String, ArrayList<ArrayList<Integer>>> entry : listOfUsersShip.entrySet() ){
            ArrayList<ArrayList<Integer>> existingShip = entry.getValue();
            if (existingShip.contains(cordinatesToCheck)) {
                return true;
            }
        }

        return false;
    }
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
        Boolean continueAsk = true;
        ArrayList<Integer> inputs = new ArrayList<>();
        while(continueAsk){
            System.out.println("X: ");
            Integer x = scan.nextInt();
        
            System.out.println("Y: ");
            Integer y = scan.nextInt();

            
            inputs.add(x);
            inputs.add(y);
            if(allUsersInputs.contains(inputs) || x > 10 || x < 0 || y > 10 || y < 0){
                System.out.println("Wrong coordinates! Please Try again!");
                inputs.clear();
            }else{
                continueAsk = false;
            }
    }
        allUsersInputs.add(inputs);
        System.out.println(allUsersInputs);
        return allUsersInputs;
    }

}
