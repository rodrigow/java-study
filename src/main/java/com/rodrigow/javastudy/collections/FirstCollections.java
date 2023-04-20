package com.rodrigow.javastudy.collections;

import com.rodrigow.javastudy.collections.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class FirstCollections {
    public Collection<String> createACollectionWith2StringsAnaAndRodrigo() {

        Collection<String> firstCollection = new ArrayList<String>();
        // ArrayList<String> ou List<String> pq herda = tips abaixo

        firstCollection.add("Ana");
        firstCollection.add("Rodrigo");

        // tips -> https://www.geeksforgeeks.org/how-to-learn-java-collections-a-complete-guide/

        return firstCollection;
    }

    public List<Car> createACarList() {

        List<Car> cars = new ArrayList<>();

        cars.add(Car.fit());
        cars.add(Car.voyage());

        return cars;
    }

    public Set<Car> createACarSet() {
        return null;
    }

    public Collection<Car> removeDuplicatedCars(ArrayList<Car> duplicatedCars) {
        return null;
    }
}
