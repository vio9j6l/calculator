package com.company;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {
    /**
     * Addition Test
     */
    @org.junit.Test
    public void additionUnitTestTrue() {
        try {
            assertTrue(Main.addition(5, 5) == 10);
            //throw new Exception("Enter Numbers Again");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void additionUnitTestFalse() {
        try {
            assertFalse(Main.addition(5, 5) == 7);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
    /**
     * Subtraction Test
     */
    @org.junit.Test
    public void subtractionUnitTestTrue() {
        try {
            assertTrue(Main.subtraction(10, 5) == 5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void subtractionUnitTestFalse() {
        try {
            assertFalse(Main.subtraction(10, 5) == 10);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     * Multiplication Test
     */
    @org.junit.Test
    public void multiplicationUnitTestTrue() {
        try {
            assertEquals(Main.multiplication(5, 5), 25);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void multiplicationUnitTestFalse() {
        try {
            assertNotEquals(10, Main.multiplication(5, 5));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    /**
     * Division Test
     */
    @org.junit.Test
    public void divisionUnitTestTrue() {
        try {
            assertTrue(Main.division(25, 5) == 5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void divisionUnitTestFalse() {
        try {
            assertFalse(Main.division(25, 5) == 10);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
