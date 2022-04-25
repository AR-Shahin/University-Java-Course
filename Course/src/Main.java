import dhaka.DCircle;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        int n = 100;

//        String result = "";
//
//        result = isPrime(n) ? "Strong" : "Not Strong!";
//
//        System.out.println(result);

//        int lb = 1;
//        int ub = 200;
//        int sum = 0;
//        for(int i = lb;i<=ub;i++){
//            if(isStrong(i)){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
        fibo(5);
    }

    public static void fibo(int n){
        int first = 0;
        int second = 1;
        if(n ==1){
            System.out.println(first);
        }
        if(n ==2){
            System.out.println(first);
            System.out.println(second);
        }
        else{
            System.out.println(first);
            System.out.println(second);
            for(int i = 3;i<=n;i++){
                int next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
        }

    }
    public static int fact(int n){
        int sum = 1;

        for(int i =1;i<=n;i++){
            sum *= i;
        }

        return sum;
    }
    public static boolean isStrong(int n ){

        int sum = 0;
        int temp = n;
        while (n != 0){
            int rem = n % 10;
            sum += fact(rem);
            n = n / 10;
        }

        if (sum == temp){
            return true;
        }else{
            return false;
        }
    }


}

