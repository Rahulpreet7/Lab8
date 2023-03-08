package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList cityList = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        cityList.addCity(city);
        assertEquals(1, cityList.getCount());
    }

    @Test
    void testHasCity() {
        CustomList cityList = new CustomList(null, citylist);
        City city1 = new City("Amritsar", "Punjab");
        City city2 = new City("Delhi", "Dl");
        cityList.addCity(city1);
        assertTrue(cityList.hasCity(city1));
        assertFalse(cityList.hasCity(city2));
    }

    @Test
    void testdeleteCity() throws Exception {
        CustomList cityList = new CustomList(null, citylist);
        City city3 = new City("Amritsar","Punjab");
        cityList.addCity(city3);
        assertTrue(cityList.hasCity(city3));
        cityList.deleteCity(city3);
        assertFalse(cityList.hasCity(city3));
    }

    @Test
    void testcountCities() throws Exception {
        CustomList cityList = new CustomList(null, citylist);
        City city5 = new City("Yellowknife", "Northwest Territories");
        cityList.addCity(city5);
        assertEquals(2,cityList.countCities());
        cityList.deleteCity(city5);
        assertEquals(1,cityList.countCities());
    }
}
