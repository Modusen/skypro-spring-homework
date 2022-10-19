package pro.sky.skyprospringhomework;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }


    @GetMapping(path = "/calculator/sum")
    public String getSumCalculator(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.getSumCalculator(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String getMinusCalculator(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.getMinusCalculator(a, b);
    }

    @GetMapping(path = "/calculator/multiply")
    public String getMultiplyCalculator(@RequestParam(value = "num1", required = false) Integer a, @RequestParam(value = "num2", required = false) Integer b) {
        return calculatorService.getMultiplyCalculator(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String getDivideCalculator(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calculatorService.getDivideCalculator(a, b);
    }

    @ExceptionHandler
    public String handleMissingParams(MissingServletRequestParameterException ex) {
        String name = ex.getParameterName();
        return name + " - параметр пропущен! Введите параметр!";
    }
}
