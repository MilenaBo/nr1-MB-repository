package com.kodilla;

class Calculator {
    public void ndwAB(int a, int b) {
        System.out.println("KALKULATOR  NDW ("+a+","+b+")");
        int c=b;
        int nwd=b;
        while (c!=0) {

            c=a%b;
            if (c==0) {nwd=b;}
            else {a=b; b=c;}
        }

        System.out.println("NWD = " +nwd) ;
    }

    public static void main(String args[]) {

        Calculator calculatorNDW = new Calculator();
        calculatorNDW.ndwAB(159,18);

        Calculator calculatorNDW2 = new Calculator();
        calculatorNDW2.ndwAB(1359,27);

    }
}
