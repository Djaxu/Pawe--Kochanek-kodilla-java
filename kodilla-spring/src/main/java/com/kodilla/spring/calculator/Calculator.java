package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    @Autowired
    private Display display;

    /*public Calculator(Display display) {
        this.display = display;
    }*/
    public Double add(double a, double b){
        display.displayValue(a+b);
        return a+b;
    }
    public Double sub(double a, double b){
        display.displayValue( a-b);
        return a-b;
    }
    public Double mul(double a, double b){
        display.displayValue(a*b);
        return a*b;
    }
    public Double div(double a, double b){
        display.displayValue(a/b);
        return a/b;
    }

}
