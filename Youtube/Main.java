import java.util.*;

import classes.Helper;
import classes.MathmaticalOperations;

class Main {
    public static void main(String args[]) {

        Helper help = new Helper();
        MathmaticalOperations math = new MathmaticalOperations();
        int a, b;
        Scanner sc = new Scanner(System.in);

        // help.print("Enter first Number : ");
        // a = sc.nextInt();

        // help.print("Enter second Number : ");
        // b = sc.nextInt();

        // help.print("Sum is : " + math.sum(a, b));
        // help.print("Sub is : " + math.sub(a, b));
        // help.print("Mul is : " + math.multify(a, b));
        // help.print("Div is : " + math.div(a, b));

        // if (math.isPrime(21)) {
        // help.print("Not!");
        // } else {
        // help.print("Yes!");
        // }

        math.isPerfect(21);
    }
}
