package com.adilenver.houseTypes;

public class House {
    private int price;
    private int area;
    private int rooms;
    private int halls;

    public House(int price, int area, int rooms, int halls) {
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.halls = halls;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getHalls() {
        return halls;
    }

    public void setHalls(int halls) {
        this.halls = halls;
    }
}
