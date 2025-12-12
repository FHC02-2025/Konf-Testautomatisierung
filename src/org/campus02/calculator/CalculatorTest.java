package org.campus02.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {


    @Test
    void add() {
        // exercise
        int result = Calculator.add(2,3);
        int expected = 5;

        // verify
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1, Calculator.subtract(3,2));
    }

    @Test
    void multiply() {
        int res = Calculator.multiply(3,2);
        Assertions.assertEquals(6, res);
    }
}