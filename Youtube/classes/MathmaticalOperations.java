package classes;

public class MathmaticalOperations {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multify(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        int res = 0;
        try {
            res = a / b;
        } catch (Exception e) {
            System.out.println("Second Num zero dewa jabe na !");
        }

        return res;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public void isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }

}
