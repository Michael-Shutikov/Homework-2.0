package org.example;

public class Factorial {
    private static int result = 1;

    public int getFactorial(int number) {
        if (number < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println(number + " — недопустимое значение.");
                return 0;
            }
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println(number + "! = " + result + ".");
            return result;
        }
    }
}