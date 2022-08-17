package com.company;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<City> map =  new TreeSet<>(City.cityComparator);
City city = new City(495 ,"Москва");
City city2 = new City(86,"Пекин");
City city3 = new City(39,"Рим");
City city4 = new City(34,"Мадрид");
City city5 = new City(9714,"Дубай");
map.add(city);
map.add(city2);
map.add(city3);
map.add(city4);
map.add(city5);
        for (City set:map) {
            if (set.getCode() %2==0){
                System.out.println(set);
            }
        }
    }
}