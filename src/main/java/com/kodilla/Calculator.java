package com.kodilla;

public class Calculator {
    public void addAB(int a, int b) {
         int  c=a+b;
        System.out.println("a+b= " +c) ;
    }
    public void subtractAB(int a, int b) {
        int  c=a-b;
        System.out.println("a-b= " +c) ;
    }
    public static void main(String args[]) {
        System.out.println("KALKULATOR");
        Calculator calculatorPlus = new Calculator();
        calculatorPlus.addAB(1,4);
        calculatorPlus.subtractAB(7,4);
        Calculator calculatorMinus = new Calculator();
        calculatorMinus.subtractAB(1,4);
           }
}
