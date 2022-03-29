package math;

public class MathematicalOperation {
    private int num1;
    private int num2;

    private int num3;

    public MathematicalOperation(int a, int b){
        this.num1 = a;
        this.num2 = b;

    }
    public void setNum3(int n){
        this.num3 = n;
    }
    public static int test = 10;

    public int add(){
        return this.num1 + this.num2;
    }

    public int sub(){
        return this.num1 - this.num2;
    }

    public int multify(){
        return this.num1 * this.num2;
    }

    public int div(){
        try{
            return this.num1 / this.num2;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        finally {
            System.out.println("Finally Block");
        }

    }



}
