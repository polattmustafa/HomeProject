package home.model;

public class Summerhouse extends Home {
    private int seaDistance;

    public Summerhouse(double area, String address, int age, int roomsNumber, double price, int seaDistance, int hallsNumber) {
        super(area, address, age, roomsNumber, price, hallsNumber);
        this.seaDistance = seaDistance;
    }

    public int getSeaDistance() {
        return seaDistance;
    }

    public void setSeaDistance(int seaDistance) {
        this.seaDistance = seaDistance;
    }
}
