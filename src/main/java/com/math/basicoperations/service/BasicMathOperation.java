package com.math.basicoperations.service;

import com.math.basicoperations.dto.MathRequest;
import com.math.basicoperations.dto.MathResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public
class BasicMathOperation{
    public MathResponse doBasicOperation(MathRequest data){
        MathResponse result = new MathResponse();

        result.setAddition(data.getNum1() + data.getNum2());
        result.setSubtraction(data.getNum1() - data.getNum2());
        result.setMultiplication(data.getNum1() * data.getNum2());
        result.setDivision(data.getNum1() / data.getNum2());

        return result;
    }
}