package pro.sky.skyprospringhomework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametrizedTest {
    private static final int num1 = 15;
    private static final int num2 = 4;
    private static final int num3 = -8;
    private static final int num4 = 16;
    private CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldGenerateCorrectSumString(Integer first, Integer second) {
        String out = calculatorService.getSumCalculator(first, second);
        String correct = first + " + " + second + " = " + (first + second);
        assertEquals(out, correct);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldGenerateCorrectMinusString(Integer first, Integer second) {
        String out = calculatorService.getMinusCalculator(first, second);
        String correct = first + " - " + second + " = " + (first - second);
        assertEquals(out, correct);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldGenerateCorrectMultiplyString(Integer first, Integer second) {
        String out = calculatorService.getMultiplyCalculator(first, second);
        String correct = first + " * " + second + " = " + (first * second);
        assertEquals(out, correct);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldGenerateCorrectDivideString(Integer first, Integer second) {
        String out = calculatorService.getDivideCalculator(first, second);
        String correct = first + " / " + second + " = " + (first * 1.0 / second);
        assertEquals(out, correct);
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }
}
