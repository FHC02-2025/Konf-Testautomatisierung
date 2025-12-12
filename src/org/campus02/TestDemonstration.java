package org.campus02;

import org.junit.jupiter.api.*;

public class TestDemonstration {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Ich werde nur einmal aufgerufen");
        System.out.println("BeforeAll -> Nur zu Beginn der Testausführung");
    }

    @BeforeEach
    void setup() {
        System.out.println("Setup:");
        System.out.println("Werde vor jedem Test aufgerufen");
    }

    @Test
    void testTheMethod() {
        System.out.println("Exercise: Funktion ausgeführt");
        System.out.println("Verify: Überprüfen des Ergebnisses");
    }

    @Test
    void testOtherMethod() {
        System.out.println("Exercise: Funktion ausgeführt");
        System.out.println("Verify: Überprüfen des Ergebnisses");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tear Down:");
        System.out.println("Werde nach jedem Test ausgeführt");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Ich werde nur einmal aufgerufen");
        System.out.println("Wenn als letztes zum Abschluss aufgerufen");
    }
}
