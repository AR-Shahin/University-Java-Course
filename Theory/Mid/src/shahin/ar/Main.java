package shahin.ar;

public class Main {

    public static void main(String[] args) {
        Main.calculate(2);
        System.out.println(myY(3));
        System.out.println(myFun(3));
    }

    public static void calculate(int z){
        double m = 0;
        m = Math.sqrt((7*z) + (6 * (Math.pow(((double)z),2.0))));

        System.out.println(m);
    }

    public static double myY(int n){

        double y = 0;
        for (double i = 1;i<=n;i++){
            y += i % 2 == 0 ? -(i/((7*i) - 6)): (i/((7*i) - 6)) ;
        }
        return y;
    }

    public static double abc(int n){
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum  *= 4;
        }
        return sum -1;
    }
    public static double myFun(int n){
        double sum = 0;
        int temp = 2;
        for (int i = 1; i <=n; i++) {
            sum += i % 2 == 0? -(temp/abc(i)) : (temp/abc(i));
            temp += 3;
        }
        return sum;
    }
}
