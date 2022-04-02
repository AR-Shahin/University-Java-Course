package shahin.ar;

import math.MathematicalOperation;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id,evn = 0,odd = 0;

       id = sc.nextInt();

        while (id != 0){ // 12345
            int rem = id % 10; // 5

            if(rem % 2 == 0){ // 5 % 2 ==
                evn ++;
            }else {
                odd++;
            }
            id = id / 10; // 12345 / 10
        }

        if(evn > odd){
            System.out.println("Even Win");
        }
        if(evn < odd){
            System.out.println("ODD Win");
        }
        if(evn == odd){
            System.out.println("Tie");
        }
    }
}

 class Person{
    int x;
    static int y = 100;
}