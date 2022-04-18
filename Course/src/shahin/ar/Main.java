package shahin.ar;


import dhaka.DCircle;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        int n = 4;

        for(int row = 1; row <=n; row++){
            for(int col = 1; col <=n; col++){
                if(row==1|| row == n|| col==1|| col == n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
            }
            }
            System.out.print("\n");
        }
    }



}

