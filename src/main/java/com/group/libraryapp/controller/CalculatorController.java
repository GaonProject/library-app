package com.group.libraryapp.controller;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
    @GetMapping("/add1")
    public int addTwoNumbers1(
            @RequestParam int number1,
            @RequestParam int number2
    ) {
        return number1 + number2;
    }

    @GetMapping("/add2")
    public int addTwoNumbers2(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @GetMapping("/add3")
    public int addTwoNumbers3(CalculatorAddRequest request) {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumber(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNumber1() * request.getNumber2();
    }

}
