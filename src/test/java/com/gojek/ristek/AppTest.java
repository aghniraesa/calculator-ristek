/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.gojek.ristek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void additionTest() {
        App classUnderTest = new App();
        assertEquals(7, classUnderTest.addition(2, 5));
    }

    @Test
    void subtractionTest() {
        App classUnderTest = new App();
        assertEquals(3, classUnderTest.subtraction(5, 2));
    }

    @Test
    void multiplyTest() {
        App classUnderTest = new App();
        assertEquals(12, classUnderTest.multiply(6, 2));
    }

    @Test
    void divideTest() {
        App classUnderTest = new App();
        assertEquals(2, classUnderTest.divide(6, 3));
    }
}
