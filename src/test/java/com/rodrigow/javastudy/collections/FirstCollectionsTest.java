package com.rodrigow.javastudy.collections;

import com.rodrigow.javastudy.collections.model.Car;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstCollectionsTest {

    @Test
    public void shouldCreateTheFirstCollection() {
        FirstCollections firstCollections = new FirstCollections();
        Collection<String> col = firstCollections.createACollectionWith2StringsAnaAndRodrigo();

        assertEquals(2, col.size());
        assertTrue(col.contains("Ana"));
        assertTrue(col.contains("Rodrigo"));
    }

    @Test
    public void shouldCreateCarList() {
        FirstCollections firstCollections = new FirstCollections();
        List<Car> cars = firstCollections.createACarList();

        assertEquals(2, cars.size());

        Car fit = cars.get(0);
        assertEquals("Honda", fit.getBrand());
        assertEquals("Fit", fit.getModel());

        Car voyage = cars.get(1);
        assertEquals("Volkswagen", voyage.getBrand());
        assertEquals("Voyage", voyage.getModel());
    }

    @Test
    public void shouldCreateCarSet() {
        FirstCollections firstCollections = new FirstCollections();
        Set<Car> cars = firstCollections.createACarSet();

        assertEquals(2, cars.size());

        assertTrue(cars.contains(Car.fit()));
        assertTrue(cars.contains(Car.voyage()));
    }

    @Test
    public void shouldCreateACollectionWithoutDuplicatedCars() {
        ArrayList<Car> duplicatedCars = new ArrayList<Car>();
        duplicatedCars.add(Car.fit());
        duplicatedCars.add(Car.fit());
        duplicatedCars.add(Car.voyage());
        duplicatedCars.add(Car.voyage());
        duplicatedCars.add(Car.fit());

        FirstCollections firstCollections = new FirstCollections();
        Collection<Car> cars = firstCollections.removeDuplicatedCars(duplicatedCars);

        assertEquals(2, cars.size());
        assertTrue(cars.contains(Car.fit()));
        assertTrue(cars.contains(Car.voyage()));
    }
}
