package blackbox.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void checkAdditionFunction() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void checkSubtractionFunction() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subtract(2,4));
    }

    @Test
    public void checkModSubtraction1Function() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.modSubtract(2,4));
    }

    @Test
    public void checkModSubtraction2Function() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.modSubtract(4,2));
    }

    @Test
    public void checkMultiplicationFunction() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.multiply(2,4));
    }

    @Test
    public void checkDivisionFunction() {
        Calculator calculator = new Calculator();
        try {
            assertEquals(6, calculator.divide(24,4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkDivideByZero() throws Exception {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(24,0);
        } catch (Exception e) {
            assertEquals("Trying to divide by zero", e.getMessage());
        }
    }
}