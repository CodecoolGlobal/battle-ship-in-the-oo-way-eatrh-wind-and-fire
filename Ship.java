import java.util.ArrayList;
import java.util.List;

class Ship {
    private String shipName;
    private Boolean horizontal;
    private Integer lenght;
    private Integer startingX;
    private Integer startingY;
    private List<Coordinates> coordinates;

    public Ship(String shipName, Boolean horizontal, Integer length, Integer startingX, Integer startingY) {
        this.shipName = shipName;
        this.horizontal = horizontal;
        this.lenght = length;
        this.startingX = startingX;
        this.startingY = startingY;
        this.coordinates = new ArrayList<>();
        calculateCoordinates(horizontal, length, startingX, startingY);
    }

    private void calculateCoordinates(Boolean horizontal,
                                      Integer lenght,
                                      Integer startingX,
                                      Integer startingY) {
        if (horizontal) {
            for (int i = 0; i < lenght; i++) {
                coordinates.add(new Coordinates(startingX, startingY));
                startingX++;
            }
        } else {
            for (int i = 0; i < lenght; i++) {
                coordinates.add(new Coordinates(startingX, startingY));
                startingY++;
            }
        }
    }

    public boolean containsCoordinate(int x, int y) {
        for (Coordinates coordinates : coordinates) {
            if (coordinates.getX() == x && coordinates.getY() == y) {
                return true;
            }
        }

        return false;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipName='" + shipName + '\'' +
                ", horizontal=" + horizontal +
                ", lenght=" + lenght +
                ", startingX=" + startingX +
                ", startingY=" + startingY +
                ", coordinates=" + coordinates +
                '}';
    }
}