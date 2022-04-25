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

        int lb = 1;
        int ub = 200;
        for(int i = lb;i<=ub;i++){
            if(isStrong(i)){
                System.out.println(i);
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

