package shahin.ar;

import math.MathematicalOperation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base,height;
        double area;
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = 0.5 * base * height;


        System.out.println("Area : " + area);


    }
}

 class Person{
    int x;
    static int y = 100;
}