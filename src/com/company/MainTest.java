package com.company;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void additionUnitTestTrue() {
        assertTrue(Main.addition(5, 5) == 10);
    }

    @org.junit.Test
    public void additionUnitTestFalse() {
        assertFalse(Main.addition(5, 5) == 7);
    }

    @org.junit.Test
    public void subtractionUnitTestTrue() {
        assertTrue(Main.addition(10, 5) == 5);
    }

    @org.junit.Test
    public void subtractionUnitTestFalse() {
        assertFalse(Main.addition(10, 5) == 10);
    }

    @org.junit.Test
    public void multiplicationUnitTestTrue() {
        assertTrue(Main.addition(5, 5) == 25);
    }

    @org.junit.Test
    public void multiplicationUnitTestFalse() {
        assertFalse(Main.addition(5, 5) == 10);
    }

    @org.junit.Test
    public void divisionUnitTestTrue() {
        assertTrue(Main.addition(25, 5) == 5);
    }

    @org.junit.Test
    public void divisionUnitTestFalse() {
        assertFalse(Main.addition(25, 5) == 10);
    }
}
