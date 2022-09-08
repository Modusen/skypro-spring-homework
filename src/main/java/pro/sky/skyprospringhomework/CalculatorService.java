package pro.sky.skyprospringhomework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello() {
        return "<i><b>Hey there!</i></b>";
    }

    public String helloCalculator() {
        return "<i><b>Добро пожаловать в калькулятор!</i></b>";
    }

    public String getSumCalculator(Integer a, Integer b) {
        if (a == null && b == null) {
            return "Ошибка. Чего-то не хватает.";
        }
        return a + " + " + b + " = " + (a + b);
    }


    public String getMinusCalculator(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String getMultiplyCalculator(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String getDivideCalculator(int a, int b) {
        if (b == 0) {
            return "Деление на 0 невозможно!";
        } else if (a % b == 0) {
            return a + " / " + b + " = " + (a / b);
        }
        return a + " / " + b + " = " + (a * 1.0 / b);
    }
}
