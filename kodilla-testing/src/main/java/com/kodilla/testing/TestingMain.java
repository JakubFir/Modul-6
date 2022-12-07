package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       int addResult= calculator.add(5,5);
       int subtractResult = calculator.subtract(10,5);
       if(addResult == 10){
           System.out.println("Adding test ok");
       }else{
           System.out.println("Adding test error");
       }
       if(subtractResult == 5){
           System.out.println("Subtract test ok");
       }else{
           System.out.println("Subtract test error");
       }
    }
}
