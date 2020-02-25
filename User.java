import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;


public class User {


    private Map<String, Integer> listOfShips;
    private Map<String, ArrayList<Coordinates>> listOfUsersShip;
    public ArrayList<Coordinates> allUsersInputs;
   
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
    
    public Map<String, ArrayList<Coordinates>> createAndaddShipToList(){
        // int startingX = 1;
        // int startingY = 1;
        
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
            // startingX++;
            // startingY++;
        }
    
        return listOfUsersShip;
    }

    public boolean checkForDublleCordinates(Map<String, ArrayList<Coordinates>> listOfUsersShip, int startingX, int startingY){
        if(startingX > 10 || startingX < 0 || startingY > 10 || startingY < 0){
            System.out.println("coordinates out of range");
            return true;
        }else{
        Coordinates cordinatesToCheck = new Coordinates(startingX, startingY);
          
        for(Map.Entry<String, ArrayList<Coordinates>> entry : listOfUsersShip.entrySet() ){
            ArrayList<Coordinates> existingShip = entry.getValue();
            if (existingShip.contains(cordinatesToCheck)) {
                return true;
            }
        }

        return false;
    }
}
      

    public Map<String, ArrayList<Coordinates>> getListOfUsersShip(){
        return listOfUsersShip;
    }

    public void displayShips(){
        for(Map.Entry<String, ArrayList<Coordinates>> row : listOfUsersShip.entrySet()){
            System.out.println(row.getKey() + row.getValue());
        }
    }

    public ArrayList<Coordinates> userInput(){
        Scanner scan = new Scanner(System.in);
        Boolean continueAsk = true;
        Coordinates inputs = new Coordinates(0,0);
        while(continueAsk){
            System.out.println("X: ");
            Integer x = scan.nextInt();
        
            System.out.println("Y: ");
            Integer y = scan.nextInt();
            
            inputs = new Coordinates(x, y);
            
            Boolean CheckInputs = checkInputs(x, y, allUsersInputs);
            if(CheckInputs || x > 10 || x < 0 || y > 10 || y < 0){
                System.out.println("Wrong coordinates! Please Try again!");
            
            }else{

                continueAsk = false;
            }
    }
        allUsersInputs.add(inputs);
        for(Coordinates cordinate : allUsersInputs ){
            System.out.println(cordinate.toString());
        }
        // System.out.println(allUsersInputs + "sdadasda");
        return allUsersInputs;
    }
    public Boolean checkInputs(int x, int y, ArrayList<Coordinates> allUsersInputs){
        for (Coordinates cordinate : allUsersInputs){
            if(cordinate.getX() == x && cordinate.getY() == y){
                return true;
            
                
            }
        }return false;
    }

}
