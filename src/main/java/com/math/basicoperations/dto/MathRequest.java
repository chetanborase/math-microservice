package com.math.basicoperations.dto;

import javax.validation.constraints.NotNull;

public class MathRequest {
    @NotNull(message = "this field  must not be null")
    private Double num1;
    @NotNull(message = "this field  must not be null")
    private Double num2;

    public MathRequest(@NotNull Double num1, @NotNull Double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }
}
