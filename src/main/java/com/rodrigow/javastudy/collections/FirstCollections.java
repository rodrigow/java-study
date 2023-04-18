package com.rodrigow.javastudy.collections;

import com.rodrigow.javastudy.collections.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
        return null;
    }
}
