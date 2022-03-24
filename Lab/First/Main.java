
import java.util.Scanner;

import classes.MathematicalOperations;
import classes.Hepler.Helper;

public class Main {
    public static void main(String[] args) {
        MathematicalOperations math = new MathematicalOperations();
        Helper help = new Helper();
        Scanner sc = new Scanner(System.in);
        help.print("Enter numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        help.print("Sum is : " + math.add(num1, num2));
        help.print("Sub is : " + math.sub(num1, num2));
        help.print("Mul is : " + math.mul(num1, num2));
        help.print("div is : " + math.div(num1, num2));
        math.isPerfect(num1);
        math.isPrime(num1);
    }
}
