package com.rodrigow.javastudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstClassTest {

    @Test
    public void shouldReturnFive() {
        FirstClass firstClass = new FirstClass();
        assertEquals(5, firstClass.getValue());
    }
}
