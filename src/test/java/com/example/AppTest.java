package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddPositiveNumbers() {
        App app = new App();
        int result = app.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testAddWithZero() {
        App app = new App();
        int result = app.add(0, 7);
        assertEquals(7, result, "0 + 7 should equal 7");
    }

    @Test
    void testAddNegativeNumbers() {
        App app = new App();
        int result = app.add(-4, -6);
        assertEquals(-10, result, "-4 + -6 should equal -10");
    }
}

