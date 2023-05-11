package home.model;

public class Home {
    private double area;
    private String address;
    private int age;
    private int roomsNumber;
    private double price;
    private int hallsNumber;

    public Home(double area, String address, int age, int roomsNumber, double price, int hallsNumber) {
        this.area = area;
        this.address = address;
        this.age = age;
        this.roomsNumber = roomsNumber;
        this.price = price;
        this.hallsNumber = hallsNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHallsNumber() {
        return hallsNumber;
    }

    public void setHallsNumber(int hallsNumber) {
        this.hallsNumber = hallsNumber;
    }
}
