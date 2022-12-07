package com.kodilla.testing.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {
    @Test
    void testAdding() {
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.add(5,5);
        int expectedResult = 10;
        //Then
        Assertions.assertEquals(expectedResult,result);
    }

    void testSubtracting(){
        //Given
        Calculator calculator = new Calculator();
        //When
        int result = calculator.subtract(5,5);
        int expectedResult = 0;
        //Then
        Assertions.assertEquals(expectedResult,result);
    }
}
