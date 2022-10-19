package pro.sky.skyprospringhomework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    Integer a = 2;
    Integer b = 3;
    Integer c = -8;
    Integer d = 16;

    Integer e = 0;


    @Test
    public void getSumCalculator() {
        int expected = a + b;
        int expected1 = c + d;

        int actual = 2 + 3;
        int actual1 = -8 + 16;

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    public void getMinusCalculator() {
        int expected = a - b;
        int expected1 = c - d;

        int actual = 2 - 3;
        int actual1 = -8 - 16;

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    public void getMultiplyCalculator() {
        int expected = a * b;
        int expected1 = c * d;

        int actual = 2 * 3;
        int actual1 = -8 * 16;

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    public void getDivideCalculatorTest() {
        String expected = calculatorService.getDivideCalculator(a, b);
        String expected1 = calculatorService.getDivideCalculator(c, d);

        String actual = 2 + " / " + 3 + " = " + (2 * 1.0 / 3);
        String actual1 = -8 + " / " + 16 + " = " + (-8 * 1.0 / 16);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }
    @Test
    public void getDivideByZeroCalculatorTest() {
        assertThrows(MyIllegalArgumentException.class, () ->{
            calculatorService.getDivideCalculator(a, e);
        });


    }

}
