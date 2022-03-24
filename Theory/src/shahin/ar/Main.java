package shahin.ar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c,d,e,f;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
//         b = sc.nextInt();
//         c = sc.nextInt();
//        d = sc.nextInt();
//         e = sc.nextInt();
//        f = sc.nextInt();
//        NorthAverage nt = new NorthAverage(a,b,c,d,e,f);
//        System.out.println(nt.sixAverage());

        int m = 3;
        double p = 0;
        for(float i = 1;i<= m;i++){
            p += i % 2 != 0 ? (i/(2*i +1)) : -(i/(2*i + 1));
        }

        System.out.println(p);

        int max,min,evn = 0,odd = 0,pos = 0,neg = 0;
        int arr[] = {1,2,-3,4,-5};
        max = arr[0];
        min = arr[0];
        for(int i =0;i<5;i++){
            if(arr[i]>=0){
                pos ++;
            }else{
                neg++;
            }
            if(arr[i]%2 == 0){
                evn ++;
            }else{
                odd++;
            }

            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
        System.out.println("odd " + odd);
        System.out.println("ev " + evn);
        System.out.println("pos " + pos);
        System.out.println("neg " + neg);
    }
}
