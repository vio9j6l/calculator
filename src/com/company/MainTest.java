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
}
