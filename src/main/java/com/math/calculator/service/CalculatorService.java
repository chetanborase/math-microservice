package com.math.calculator.service;

import com.math.calculator.dto.RQInput;
import com.math.calculator.dto.RSOutput;
import org.springframework.stereotype.Service;

@Service
public  class CalculatorService {
    public RSOutput doBasicOperation(RQInput data){
        RSOutput result = new RSOutput();
        result.setAddition(data.getFirstNumber() + data.getSecondNumber());
        result.setSubtraction(data.getFirstNumber() - data.getSecondNumber());
        result.setMultiplication(data.getFirstNumber() * data.getSecondNumber());
        result.setDivision(data.getFirstNumber() / data.getSecondNumber());

        return result;
    }
}