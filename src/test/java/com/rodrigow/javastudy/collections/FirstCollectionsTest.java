package com.rodrigow.javastudy.collections;

import org.junit.jupiter.api.Test;

import java.util.Collection;

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

}
