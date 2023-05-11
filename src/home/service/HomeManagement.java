package home.service;

import home.model.House;
import home.model.Summerhouse;
import home.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HomeManagement {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<Summerhouse> summerhouseList;


    public HomeManagement() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerhouseList = new ArrayList<>();

        House house1 = new House(120, "Denizciler", 20, 3, 500000, 100, 1);
        House house2 = new House(100, "Belen", 8, 2, 400000, 70, 1);
        House house3 = new House(120, "Hassa", 2, 1, 300000, 50, 1);

        Villa villa1 = new Villa(300, "Iskenderun", 10, 5, 2000000, 1, 2);
        Villa villa2 = new Villa(320, "Antalya", 6, 6, 2000000, 2, 2);
        Villa villa3 = new Villa(370, "Istanbul", 3, 6, 2000000, 1, 3);

        Summerhouse summerhouse1 = new Summerhouse(200, "Arsuz", 12, 4, 1500000, 5, 2);
        Summerhouse summerhouse2 = new Summerhouse(210, "Alanya", 3, 5, 1500000, 12, 1);
        Summerhouse summerhouse3 = new Summerhouse(250, "Bodrum", 9, 3, 1500000, 3, 1);

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        summerhouseList.add(summerhouse1);
        summerhouseList.add(summerhouse2);
        summerhouseList.add(summerhouse3);

    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        this.villaList = villaList;
    }

    public List<Summerhouse> getSummerhouseList() {
        return summerhouseList;
    }

    public void setSummerhouseList(List<Summerhouse> summerhouseList) {
        this.summerhouseList = summerhouseList;
    }
}
