package classes;

import classes.Hepler.Helper;

public class MathematicalOperations {
    Helper help = new Helper();

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public void isPrime(int num1) {
        boolean prime = true;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            help.print("Prime number!");
        } else {
            help.print("Not Prime number!");
        }
    }

    public void isPerfect(int num1) {
        int sum = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum += i;
            }
        }
        if (sum == num1) {
            help.print("Perfect number!");
        } else {
            help.print("Not Perfect number!");
        }
    }
}
