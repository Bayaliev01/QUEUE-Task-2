package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<City> map = new TreeSet<>(City.cityComparator);
        Set<City> list = new HashSet<>();
        City city = new City(495, "Москва");
        City city2 = new City(86, "Пекин");
        City city3 = new City(39, "Рим");
        City city4 = new City(34, "Мадрид");
        City city5 = new City(9714, "Дубай");
        list.add(city);
        list.add(city2);
        list.add(city3);
        list.add(city4);
        list.add(city5);
        for (City i : list) {
            if (i.getCode() % 2 != 1) {
                map.add(i);
            }
        }
        System.out.println(map);
    }
}