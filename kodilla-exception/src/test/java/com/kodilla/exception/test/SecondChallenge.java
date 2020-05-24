package com.kodilla.exception.test;

    public class SecondChallenge {
        public String probablyIWillThrowException(double x, double y) throws Exception {
            if(x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
            return "Done!";
        }

        public static void main(String[] args) {
            SecondChallenge secondChallenge = new SecondChallenge();
            String result;
            try {
                result= secondChallenge.probablyIWillThrowException(2,1.5);
            } catch (Exception e) {
                System.out.println("eeeeeeeeeerror: " + e);
            }    finally {
                System.out.println(" I'm always working.");
            }
        }
    }

