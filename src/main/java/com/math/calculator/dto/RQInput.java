package com.math.calculator.dto;

import javax.validation.constraints.NotNull;

public class RQInput {
    @NotNull(message = "this field must not be null")
    private Double firstNumber;
    @NotNull(message = "this field must not be null")
    private Double secondNumber;

    public RQInput(Double firstNumber, Double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(Double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public Double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(Double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
