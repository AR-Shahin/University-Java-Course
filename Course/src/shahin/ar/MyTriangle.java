package shahin.ar;

public class MyTriangle {

    public int a,c,b;


    public double myArea(){
        double area;
        double s = this.myPerimerter();
        area = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        return area;
    }

    public double myPerimerter(){
        return (this.a + this.b + this.c);
    }
    public MyTriangle(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
