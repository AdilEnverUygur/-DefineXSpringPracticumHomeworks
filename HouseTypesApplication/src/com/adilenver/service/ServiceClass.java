package com.adilenver.service;

import com.adilenver.houseTypes.House;
import com.adilenver.houseTypes.SummerHouse;
import com.adilenver.houseTypes.Villa;

import java.util.ArrayList;

public class ServiceClass {
    private House[] houses;

    //Constructor
    public ServiceClass(House[] houses){
        this.houses = houses;
    }

    //1.method that returns the total prices of houses
    public int getTotalPriceOfHouses(){
        int total = 0;
        for (House house : houses){
            if (house instanceof House){
                total += house.getPrice();
            }
        }
        return total;
    }

    //2.method that returns the total prices of villas
    public int getTotalPriceOfVillas(){
        int total = 0;
        for (House house : houses){
            if (house instanceof Villa){
                total += house.getPrice();
            }
        }
        return total;
    }

    //3.method that returns the total prices of SummerHouses
    public int getTotalPriceOfSummerHouses(){
        int total = 0;
        for (House house : houses){
            if (house instanceof SummerHouse){
                total += house.getPrice();
            }
        }
        return total;
    }

    //4.method that returns the total prices of All type houses
    public int getTotalPriceOfAllHouses(){
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    //5.method that returns the average square meter of houses
    public double getAverageAreaOfHouses(){
        double totalArea = 0;
        int houseCount = 0;
        for (House house : houses){
            if (house instanceof House) {
                totalArea += house.getArea();
                houseCount++;
            }
        }
        return totalArea / houseCount;
    }

    //6.method that returns the average square meter of Villas
    public double getAverageAreaOfVillas(){
        double totalArea = 0;
        int villaCount = 0;
        for (House house : houses){
            if (house instanceof Villa){
                totalArea += house.getArea();
                villaCount++;
            }
        }
        return  totalArea / villaCount;
    }

    //7.method that returns the average square meter of SummerHouses
    public double getAverageAreaOfSummerHouses(){
        double totalArea = 0;
        int summerHouseCount = 0;
        for (House house : houses){
            if (house instanceof SummerHouse){
                totalArea += house.getArea();
                summerHouseCount++;
            }
        }
        return  totalArea / summerHouseCount;
    }

    //8.Method to return the average square meter of all types of houses
    public double getTotalAreaOfAllHouses(){
        return getAverageAreaOfHouses() + getAverageAreaOfVillas() + getAverageAreaOfSummerHouses();
    }

    //9.method that filters all types of houses according to the number of rooms and halls and returns
    public House[] filterHousesByRoomsAndHalls(int minRooms, int minHalls) {
        ArrayList<House> filteredHouses = new ArrayList<House>();
        for (House house : houses) {
            if (house.getRooms() >= minRooms && house.getHalls() >= minHalls) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses.toArray(new House[filteredHouses.size()]);
    }





}
