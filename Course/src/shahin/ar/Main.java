package shahin.ar;

import math.MathematicalOperation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MathematicalOperation math1 = new MathematicalOperation();
        MathematicalOperation math2 = new MathematicalOperation();

        math1.num1 = 100;
        math1.num2 = 50;

        math2.num1 = 10;
        math2.num2 = 100;

       int temp =  math1.add(10,10);


       System.out.println(temp);


    }
}
