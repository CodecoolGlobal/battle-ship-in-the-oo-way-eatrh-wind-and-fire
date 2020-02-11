import java.util.ArrayList;
import java.util.List;

class Ocean{
    private int width;
    private int height;
    public List<List<Square>> ocean;


    public Ocean(){
        this.width = 10;
        this.height = 10;
        this.ocean = new ArrayList<>();

        for(int i = height; i > 0; i--){

            ArrayList<Square> nestedList = new ArrayList<>();
            for(int x = width; x > 0; x--){
                nestedList.add(new Square());
            }
            ocean.add(nestedList);
        }
        

    }

    public void display(){
        System.out.println("  A B C D E F G H I J");
        System.out.println("  ___________________");
        System.out.println(" ");
        int i = 0;
        for (List<Square> list : ocean) {
           
            System.out.print(i + " ");
                for (Square square : list) {
                    System.out.print(square.getSquare() + " ");
                
           } System.out.println(" ");
           i = i +1;
        
        
        }

        System.out.println("  ___________________");
    
    }



}