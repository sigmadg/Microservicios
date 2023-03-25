package com.example.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private OperationRepository operationRepository;

    @GetMapping("/sum")
    public double sum(@RequestParam double a, @RequestParam double b) {
        double result = a + b;
        saveOperation("sum", a, b, result);
        return result;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        double result = a - b;
        saveOperation("subtract", a, b, result);
        return result;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        double result = a * b;
        saveOperation("multiply", a, b, result);
        return result;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        double result = a / b;
        saveOperation("divide", a, b, result);
        return result;
    }

    private void saveOperation(String operation, double a, double b, double result) {
        Operation op = new Operation();
        op.setId(operation + "_" + System.currentTimeMillis());
        op.setOperation(operation);
        op.setValueA(a);
        op.setValueB(b);
        op.setResult(result);
        operationRepository.save(op);
    }
}