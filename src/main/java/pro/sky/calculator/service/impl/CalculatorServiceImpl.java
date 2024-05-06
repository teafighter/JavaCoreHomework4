package pro.sky.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer addition(Integer num1, Integer num2) {
        return num1 + num2;
    }
    @Override
    public Integer subtraction(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiplication(Integer num1, Integer num2) {
        return num1 * num2;
    }
    @Override
    public Integer division(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
