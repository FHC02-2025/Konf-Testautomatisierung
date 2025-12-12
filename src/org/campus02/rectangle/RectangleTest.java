package org.campus02.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle r;

    @BeforeEach
    void setUp() {
        r = new Rectangle(2, 4);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals(2, r.getA());
        Assertions.assertEquals(4, r.getB());
    }

    @Test
    void berechneUmfang() {
        int umfang = r.berechneUmfang();
        Assertions.assertEquals(12, umfang);
    }

    @Test
    void berechneFlaeche() {
        Assertions.assertEquals(8, r.berechneFlaeche());
    }
}