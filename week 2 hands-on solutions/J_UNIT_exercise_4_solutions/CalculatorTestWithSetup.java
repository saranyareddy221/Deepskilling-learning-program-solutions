package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTestWithSetup {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up before test...");
        calc = new Calculator(); // ✅ Setup (Arrange)
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calc = null; // ✅ Teardown
    }

    @Test
    public void testAddition() {
        // Arrange done in setUp()

        // Act
        int result = calc.add(4, 6);

        // Assert
        assertEquals(10, result);
        System.out.println("Addition test passed");
    }

    @Test
    public void testMultiplication() {
        // Act
        int result = calc.multiply(3, 5);

        // Assert
        assertEquals(15, result);
        System.out.println("Multiplication test passed");
    }
}
