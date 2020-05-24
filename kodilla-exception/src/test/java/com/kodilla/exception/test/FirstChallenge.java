package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception();
        }
        return a / b;
    }
    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3, 0);
        } catch (Exception e) {
           System.out.println("eeeeeeeeeerror: " + e);
        }    finally {
            System.out.println(" I'm always working.");
        }
    }
}