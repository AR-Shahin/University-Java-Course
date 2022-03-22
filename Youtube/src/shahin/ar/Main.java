package shahin.ar;

import math.MathmaticalOperations;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        double inputArr[] = {1,2,-3,-4,5};
//
//        for (int i =0;i<inputArr.length;i++){
//            if(inputArr[i] % 2 == 0){
//                System.out.println("Even " + inputArr[i]);
//            }else{
//                System.out.println("Odd " + inputArr[i]);
//            }
//        }

        int m = 2;
        double sum = 0;
        for(float i = 1;i<= m;i++){
            sum += i % 2 != 0 ? (i/(4*i -1)) : -(i/(4*i -1));
        }
        System.out.println(sum);
        /*
        int n;
        double userArr[];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        userArr = new double[n];

        for(int i =0;i<n;i++){
            userArr[i] = sc.nextDouble();
        }
*/
//        MathmaticalOperations math = new MathmaticalOperations(inputArr);
//
//        System.out.println("Sum : " + math.add());
//        System.out.println("Multiply : " + math.multiply());
//        System.out.println("Max : " + math.findMax());
//        System.out.println("Min : " + math.findMin());
//        math.power(2);
    }
}
