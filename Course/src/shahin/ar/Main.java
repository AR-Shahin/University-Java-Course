package shahin.ar;

import math.MathematicalOperation;

import java.util.Scanner;

public class Main {

//    static {
//        System.out.println("Static Block!");
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a ,b;
        a = sc.nextInt();
        b = sc.nextInt();


        MathematicalOperation math1 = new MathematicalOperation(a,b);

        System.out.println(math1.add());
        System.out.println(math1.sub());
        System.out.println(math1.multify());
        System.out.println(math1.div());


//        System.out.println("Main Block!");
//       System.out.println(temp);

//        Person p1 = new Person();
//        Person p2 = new Person();
//
//        p1.x = 10;
//        p2.x = 20;
//
//        p1.y = 1000;
//
//        System.out.println(Person.y);
//        System.out.println(p2.y);

    }
}

 class Person{
    int x;
    static int y = 100;
}