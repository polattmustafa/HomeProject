package home.service;

import home.model.Home;
import home.model.House;
import home.model.Summerhouse;
import home.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HomeService {

    HomeManagement homeManagement = new HomeManagement();

    public double housesTotalPrice(List<House> houseList) {
        return houseList.stream()
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double villaTotalPrice(List<Villa> villaList) {
        return villaList.stream()
                .mapToDouble(Villa::getPrice)
                .sum();
    }

    public double summerhouseTotalPrice(List<Summerhouse> summerhouseList) {
        return summerhouseList.stream()
                .mapToDouble(Summerhouse::getPrice)
                .sum();
    }

    public double getTotalHomePrice(List<House> houseList, List<Villa> villaList, List<Summerhouse> summerhouseList) {

        double totalPrice = 0;
        for (House house : houseList) {
            totalPrice += house.getPrice();
        }
        for (Villa villa : villaList) {
            totalPrice += villa.getPrice();
        }
        for (Summerhouse summerhouse : summerhouseList) {
            totalPrice += summerhouse.getPrice();
        }
        return totalPrice;
    }

    public double getAverageHouseArea(List<House> houseList) {
        double totalArea = houseList.stream()
                .mapToDouble(House::getArea)
                .sum();

        return totalArea / houseList.size();
    }

    public double getAverageVillaArea(List<Villa> villaList) {
        double totalArea = villaList.stream()
                .mapToDouble(Villa::getArea)
                .sum();

        return totalArea / villaList.size();
    }

    public double getAverageSummerhouseArea(List<Summerhouse> summerhouseList) {
        double totalArea = summerhouseList.stream()
                .mapToDouble(Summerhouse::getArea)
                .sum();

        return totalArea / summerhouseList.size();
    }

    public double getAverageHomeArea(List<House> houseList, List<Villa> villaList, List<Summerhouse> summerhouseList) {
        double totalArea = 0;
        int totalHomeNumber = houseList.size() + villaList.size() + summerhouseList.size();
        for (House house : houseList) {
            totalArea += house.getArea();
        }
        for (Villa villa : villaList) {
            totalArea += villa.getArea();
        }
        for (Summerhouse summerhouse : summerhouseList) {
            totalArea += summerhouse.getArea();
        }
        return totalArea / totalHomeNumber;
    }

    public List<Home> getHomeByRoomsAndHallsNumber(int roomsNumber, int hallsNumber) {
        List<Home> filteredList = new ArrayList<>();
        for (House house : homeManagement.getHouseList()) {
            if (house.getRoomsNumber() == roomsNumber && house.getHallsNumber() == hallsNumber) {
                filteredList.add(house);
            }
        }
        for (Villa villa : homeManagement.getVillaList()) {
            if (villa.getRoomsNumber() == roomsNumber && villa.getHallsNumber() == hallsNumber) {
                filteredList.add(villa);
            }
        }
        for (Summerhouse summerhouse : homeManagement.getSummerhouseList()) {
            if (summerhouse.getRoomsNumber() == roomsNumber && summerhouse.getHallsNumber() == hallsNumber) {
                filteredList.add(summerhouse);
            }
        }
        return filteredList;
    }

}
