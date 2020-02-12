class Square{

    private String symbol;
    private boolean isHit;

    public Square(){
        this.symbol = "-";
        this.isHit = false;
    }

    public String getSquare(){       //display
        return symbol;
    }
    public void shoot(){
        this.isHit = true;          // setter
    }
    public boolean checkHit(){
        return this.isHit;
    }



}