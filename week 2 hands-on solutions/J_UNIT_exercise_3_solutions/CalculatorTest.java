package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        int result = calc.add(2, 3);
        System.out.println("Add result: " + result);  // 👈 Output shown in Console
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(3, 2);
        System.out.println("Subtract result: " + result);  // 👈 Output shown in Console
        assertEquals(1, result);
    }
}
