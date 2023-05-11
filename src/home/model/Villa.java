package home.model;

public class Villa extends Home {
    private int poolSize;

    public Villa(double area, String address, int age, int roomsNumber, double price, int poolSize, int hallsNumber) {
        super(area, address, age, roomsNumber, price, hallsNumber);
        this.poolSize = poolSize;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }
}
