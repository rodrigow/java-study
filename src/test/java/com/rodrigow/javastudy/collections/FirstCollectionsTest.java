package com.rodrigow.javastudy.collections;

import com.rodrigow.javastudy.collections.model.Car;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

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
}
