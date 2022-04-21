package org.example.homework_5.task_3;

public class HouseList {
    public static void main(String[] args) {

        House[] houses = new House[3];
        houses[0] = new CityHouse(34, 118, true);
        houses[1] = new TownHouse(2, 6, false);
        houses[2] = new CityHouse(24, 81, true);
        houses[3] = new CityHouse(16, 44, true);
    }
}
