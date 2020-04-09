package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calcurator6z2.Calculator6z2;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Moduł 6.2 Wprowadzenie to testowania oprogramowania");
        Calculator6z2 calculator = new Calculator6z2();
        int addResult = calculator.addAB(1,4);
         if (addResult==5) {
           System.out.println("test a+b OK");
            } else {
           System.out.println("Error!");
         }
        int subResult = calculator.subtractAB(9,4);
        if (subResult==5) {
            System.out.println("test a-b OK");
        } else {
            System.out.println("Error!");
        }

    }
}