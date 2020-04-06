package com.kodilla;
class Calculator2 {
    public void ndwAB(int a, int b) {
        System.out.println("KALKULATOR  NWD ("+a+","+b+")");
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
        Calculator2 calculatorNDW = new Calculator2();
        calculatorNDW.ndwAB(159,18);
        Calculator2 calculatorNDW2 = new Calculator2();
        calculatorNDW2.ndwAB(1359,27);
    }
}
