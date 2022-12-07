package com.kodilla.testing.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();
    @Test
    void testAdding() {
        //When
        int result = calculator.add(5,5);
        //Then
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult,result);
    }

    void testSubtracting(){
        //When
        int result = calculator.subtract(5,5);
        //Then
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult,result);
    }
}
