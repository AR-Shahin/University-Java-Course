package shahin.ar;


import dhaka.DCircle;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        DCircle dc = new DCircle();

        double area = dc.myCalculate(2.00);

//        System.out.println(area);

//        OneCalculate oc = new OneCalculate();
//
//        oc.calculation(2);
        int a , b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        MyTriangle mt = new MyTriangle(a,b,c);

        System.out.println(mt.myArea());
    }



}

