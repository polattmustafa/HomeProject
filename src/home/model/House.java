package home.model;

public class House extends Home {

    private int gardenArea;

    public House(double area, String address, int age, int roomsNumber, double price, int gardenArea, int hallsNumber) {
        super(area, address, age, roomsNumber, price, hallsNumber);
        this.gardenArea = gardenArea;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }
}
