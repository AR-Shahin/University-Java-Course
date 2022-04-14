package ocp.right;

public class Triangle implements ShapeInterface{

    public double base;
    public double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return 0.5 * this.base * this.height;
    }
}
