package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<City>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Halifax","NC"));
        assertEquals(listSize+1, list.getCount());
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Halifax","NC");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(listSize-1, list.getCount());
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Halifax","NC");
        list.addCity(city);
        boolean result = list.hasCity(city);
        assertEquals(result, true);
        list.deleteCity(city);
        result = list.hasCity(city);
        assertEquals(result, false);
    }
}
