package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bc1 = new BadCalc();
        System.out.println("Multi Result: " + bc1.mult(10,5));

        try{
        System.out.println("Div Result: " + bc1.div(10,0));
        } catch (ArithmeticException ae){
            System.out.println("Calc error caught");
        }
    }

    }
