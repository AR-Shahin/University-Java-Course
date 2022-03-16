
import java.util.Scanner;

import classes.MathematicalOperations;
import classes.Hepler.Helper;

public class Main {
    public static Scanner sc;

    public static void main(String[] args) {
        Main self = new Main();
        Helper help = new Helper();
        sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();
        double arr[] = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i + 1) + " : ");
            arr[i] = sc.nextDouble();
        }
        // printValues(arr);
        MathematicalOperations math = new MathematicalOperations(arr);
        help.print("Sum of Array : " + math.addition());
        help.print("Multiplication of Array : " + math.multiplication());
        help.print("Maximum Value of Array : " + math.getMaxValue());
        help.print("Minimum Value, of Array : " + math.getMinValue());
        math.powerOfEachElements(3);
    }

    void inputArrayValues(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("Value " + (i + 1) + " : ");
            sc.nextDouble();
        }
    }

    static void printValues(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
