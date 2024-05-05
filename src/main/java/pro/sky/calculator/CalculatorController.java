package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимы два числа";
        }
        return num1 + " + " + num2 + " = " + CalculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимы два числа";
        }
        return num1 + " - " + num2 + " = " + CalculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимы два числа";
        }
        return num1 + " * " + num2 + " = " + CalculatorService.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(name = "num1", required = false) Integer num1, @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимы два числа";
        }
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + CalculatorService.division(num1, num2);
        } else return "На ноль делить нельзя!";
    }
}
