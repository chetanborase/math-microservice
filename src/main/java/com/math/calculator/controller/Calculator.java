package com.math.calculator.controller;

import com.math.calculator.dto.ErrorResponse;
import com.math.calculator.dto.RQInput;
import com.math.calculator.dto.RSOutput;
import com.math.calculator.exception.DivideByZeroException;
import com.math.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math")
class Calculator {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("add")
    public RSOutput add(@Valid @RequestBody RQInput request) {
        return calculatorService.addition(request);
    }

    @PostMapping("sub")
    public RSOutput sub(@Valid @RequestBody RQInput request) {
        return calculatorService.subtraction(request);
    }

    @PostMapping("multiply")
    public RSOutput multiply(@Valid @RequestBody RQInput request) {
        return calculatorService.multiplication(request);
    }

    @PostMapping("divide")
    public RSOutput divide(@Valid @RequestBody RQInput request) throws DivideByZeroException {
        return calculatorService.division(request);
    }

    @ExceptionHandler(value = DivideByZeroException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleDivideByZero(DivideByZeroException e) {
        ErrorResponse response = new ErrorResponse();
        response.setMessage(e.getMessage());
        return response;
    }

}