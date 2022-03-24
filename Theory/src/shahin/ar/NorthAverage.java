package shahin.ar;

public class NorthAverage {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    public NorthAverage(int a,int b,int c,int d,int e,int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    public int sixAverage(){
        return (this.a+ this.b + this.c+this.d+this.e+this.f) / 6;
    }
}
