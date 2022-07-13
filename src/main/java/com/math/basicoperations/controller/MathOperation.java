package com.math.basicoperations.controller;

import com.math.basicoperations.dto.MathRequest;
import com.math.basicoperations.dto.MathResponse;
import com.math.basicoperations.service.BasicMathOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController("")
@RequestMapping("/math")
class MathOperation {

    private final BasicMathOperation basicOperation;

    public MathOperation(BasicMathOperation basicOperation) {
        this.basicOperation = basicOperation;
    }

    @PostMapping
    public MathResponse doOperation(@Valid @RequestBody MathRequest request) {
        return basicOperation.doBasicOperation(request);
    }
}