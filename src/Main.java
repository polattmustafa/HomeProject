import home.model.House;
import home.model.Summerhouse;
import home.model.Villa;
import home.service.HomeManagement;
import home.service.HomeService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        HomeManagement homeManagement = new HomeManagement();
        List<House> houseList = homeManagement.getHouseList();
        List<Villa> villaList = homeManagement.getVillaList();
        List<Summerhouse> summerhouseList = homeManagement.getSummerhouseList();

        HomeService homeService = new HomeService();

        // Houses price lists
        System.out.printf("Total price of houses : %s%n", homeService.housesTotalPrice(houseList));
        System.out.printf("Total price of villas : %s%n", homeService.villaTotalPrice(villaList));
        System.out.printf("Total price of summerhouses : %s%n", homeService.summerhouseTotalPrice(summerhouseList));
        System.out.printf("Total price of all homes : %s%n", homeService.getTotalHomePrice(houseList, villaList, summerhouseList));

        // Houses average areas
        System.out.printf("Average area of houses : %s%n", homeService.getAverageHouseArea(houseList));
        System.out.printf("Average area of villas : %s%n", homeService.getAverageVillaArea(villaList));
        System.out.printf("Average area of summerhouses : %s%n", homeService.getAverageSummerhouseArea(summerhouseList));
        System.out.printf("Average area of all homes : %s%n", homeService.getAverageHomeArea(houseList, villaList, summerhouseList));

        // Filter by rooms and halls number
        System.out.printf("Filtered by rooms and halls number %s%n", homeService.getHomeByRoomsAndHallsNumber(5,2));

    }
}