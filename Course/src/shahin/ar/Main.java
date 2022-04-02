package shahin.ar;

import math.MathematicalOperation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        double avg;
        a = sc.nextInt();
        b = sc.nextInt();

        avg = (a+b) / 2.0;

        System.out.println("Average : " + avg);


    }
}

 class Person{
    int x;
    static int y = 100;
}