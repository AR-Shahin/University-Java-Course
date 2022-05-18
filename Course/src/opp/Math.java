package opp;

 public class Math {

    public String display;
    protected float test;
    private int result;

    public void setResult(int a){
        this.result = a;
    }
    public int getResult(){
        return this.result;
    }
     public void add(int num1,int num2){
        System.out.println(num1 + num2);
    }
//    public void add(double num1,double num2){
//        System.out.println(num1 + num2);
//    }
//
//    public void add(int num1,double num2){
//        System.out.println(num1 + num2);
//    }
//
//    public void add(double num1,int num2){
//        System.out.println(num1 + num2);
//    }
}
