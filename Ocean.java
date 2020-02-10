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
       for (List<Square> list : ocean) {
           for (Square square : list) {
               System.out.println(square);
           }
       }

    }



}