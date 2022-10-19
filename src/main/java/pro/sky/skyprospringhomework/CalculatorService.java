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
        if (a == null || b == null) {
            return "Упс, ошибочка. Чего-то не хватает.";
        }
        return a + " + " + b + " = " + (a + b);
    }


    public String getMinusCalculator(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Упс, ошибочка. Чего-то не хватает.";
        }
        return a + " - " + b + " = " + (a - b);
    }

    public String getMultiplyCalculator(Integer a, Integer b) {
        if (a == null || b == null) {
            return "Упс, ошибочка. Чего-то не хватает.";
        }
        return a + " * " + b + " = " + (a * b);
    }

    public String getDivideCalculator(int a, int b) {
//        try {
            if (b == 0) {
                throw new MyIllegalArgumentException();
            } else if (a % b == 0) {
                return a + " / " + b + " = " + (a / b);
            }
//        }
//        catch (MyIllegalArgumentException e) {
//            return "Divide by 0 is restricted!";
//        }
        return a + " / " + b + " = " + (a * 1.0 / b);
    }
}
