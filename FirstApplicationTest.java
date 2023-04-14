package com.example.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplicationTest {
    Calculator cal= new Calculator();
    int a = 10;
    int b = 20;


    @Test
    void positiveTestAddition() {
        Assertions.assertEquals(a + b, cal.add(a, b));
    }

    @Test
    void testNegative() {
        int c = a - b;
        Assertions.assertNotEquals(c, cal.add(a, b));
    }

    @Test
    void testSubtract() {
        int c = a - b;
        Assertions.assertEquals(c, cal.subtract(a, b));
    }

    @Test
    void findSquareRootOf() {
        Assertions.assertEquals(5, cal.squareRootOf(25));
        Assertions.assertNotEquals(4, cal.squareRootOf(25));
    }

    @Test
    void findAreaOf() {
        Assertions.assertEquals(314.16, cal.getArea(10));
        Assertions.assertNotEquals(314, cal.getArea(10));
    }

    @Test
    void findCircumferenceOf() {
        Assertions.assertEquals(62.83, cal.getCircumference(10));
        Assertions.assertNotEquals(314, cal.getCircumference(10));
    }

    @Test
    void doMultiply() {
        int a = 2;
        int b = 2;
        Assertions.assertEquals(4, cal.multiply(a, b));
        Assertions.assertNotEquals(48, cal.multiply(a, b));
    }

    @Test
    void doDivision() {
        int a = 8;
        int b = 4;
        Assertions.assertEquals(2, cal.divide(a, b));
        Assertions.assertNotEquals(289, cal.divide(a, b));
    }
}