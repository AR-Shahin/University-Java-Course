package classes;

import java.util.Collections;

import classes.Hepler.Helper;

public class MathematicalOperations {
    private double arr[];

    public MathematicalOperations(double arr[]) {
        this.arr = arr;
    }

    Helper help = new Helper();

    public double addition() {
        double sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            sum += this.arr[i];
        }
        return sum;
    }

    public double multiplication() {
        double sum = 1;
        for (int i = 0; i < this.arr.length; i++) {
            sum *= this.arr[i];
        }
        return sum;
    }

    public double getMaxValue() {
        double max = this.arr[0];

        for (int i = 0; i < this.arr.length; i++) {
            if (max < this.arr[i]) {
                max = this.arr[i];
            }
        }

        return max;
    }

    public double getMinValue() {
        double min = this.arr[0];

        for (int i = 0; i < this.arr.length; i++) {
            if (min > this.arr[i]) {
                min = this.arr[i];
            }
        }

        return min;
    }

    public void powerOfEachElements(double n) {
        double temp[] = new double[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = Math.pow(this.arr[i], n);
        }
        help.print("\nPower of Each Elements!");
        help.print("------------------");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        help.print("\n");

    }
}
