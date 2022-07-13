package com.math.calculator.controller;

import com.math.calculator.dto.RQInput;
import com.math.calculator.dto.RSOutput;
import com.math.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math")
class Calculator {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping
    public RSOutput calculate(@Valid @RequestBody RQInput request) {
        return calculatorService.doBasicOperation(request);
    }
}