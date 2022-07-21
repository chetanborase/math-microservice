package com.math.calculator.service;

import com.math.calculator.dto.RQInput;
import com.math.calculator.dto.RSOutput;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    public RSOutput addition(RQInput input) {
        RSOutput result = new RSOutput();
        result.setAnswer(input.getFirstNumber() + input.getSecondNumber());
        return result;
    }

    public RSOutput subtraction(RQInput input) {
        RSOutput result = new RSOutput();
        result.setAnswer(input.getFirstNumber() - input.getSecondNumber());
        return result;
    }

    public RSOutput multiplication(RQInput input) {
        RSOutput result = new RSOutput();
        result.setAnswer(input.getFirstNumber() * input.getSecondNumber());
        return result;
    }

    public RSOutput division(RQInput input) {
        RSOutput result = new RSOutput();
        result.setAnswer(input.getFirstNumber() / input.getSecondNumber());
        return result;
    }
}