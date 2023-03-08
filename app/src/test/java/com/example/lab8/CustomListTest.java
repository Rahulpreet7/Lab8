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
}
