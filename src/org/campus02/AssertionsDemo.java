package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsDemo {

    int a;
    String s;
    boolean b;

    @BeforeEach
    void setup() {
        a = 1;
        s = "hallo";
        b = true;
    }

    @Test
    void testAIs1() {
        // 1. methodenaufruf
        // 2. verify
        assertEquals(1, a);
    }

    @Test
    void testAIsLessThan2() {
        assertTrue(a < 2);
    }

    @Test
    void testAIsNotBiggerThan2() {
        assertFalse(a > 2);
    }

    @Test
    void testStringIsHallo() {
        assertEquals("hallo", s);
    }

}
