package com.adilenver.run;

import com.adilenver.houseTypes.House;
import com.adilenver.houseTypes.SummerHouse;
import com.adilenver.houseTypes.Villa;
import com.adilenver.service.ServiceClass;

import java.util.Arrays;


public class Run {

    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House(100000, 120, 3, 2);
        houses[1] = new Villa(200000, 180, 4, 3);
        houses[2] = new SummerHouse(150000, 150, 3, 2);

        ServiceClass service = new ServiceClass(houses);

        System.out.println("Total price of Houses: " + service.getTotalPriceOfHouses());
        System.out.println("Total price of Villas: " + service.getTotalPriceOfVillas());
        System.out.println("Total price of Summer Houses: " + service.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all Houses: " + service.getTotalPriceOfAllHouses());

        System.out.println("Average area of  houses: " + service.getAverageAreaOfHouses());
        System.out.println("Average area of  villas: " + service.getAverageAreaOfVillas());
        System.out.println("Average area of  summerHouses: " + service.getAverageAreaOfSummerHouses());
        System.out.println("Total area of all houses: " + service.getTotalAreaOfAllHouses());

        House[] filteredHouses = service.filterHousesByRoomsAndHalls(4, 2);
        System.out.println("Filtered houses: " + Arrays.toString(filteredHouses));


    }
}

