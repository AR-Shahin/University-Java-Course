package math;

public class MathmaticalOperations {

    public double arr[];
    public MathmaticalOperations(double arr[]) {
        this.arr = arr;
    }

    public double add(){
        double sum = 0;
        for(int i  = 0;i< this.arr.length; i++){
            sum += this.arr[i];
        }
        return sum;
    }
    public double multiply(){
        double sum = 1;
        for(int i  = 0;i< this.arr.length; i++){
            sum *= this.arr[i];
        }
        return sum;
    }

    public double findMax(){
        double max = this.arr[0];
        for(int i  = 0;i< this.arr.length; i++){
          if(max < this.arr[i]){
              max = this.arr[i];
          }
        }
        return max;
    }

    public double findMin(){
        double min = this.arr[0];
        for(int i  = 0;i< this.arr.length; i++){
            if(min > this.arr[i]){
                min = this.arr[i];
            }
        }
        return min;
    }

    public void power(double n){
        double temp[] = new double[this.arr.length];

        for (int i = 0;i<this.arr.length;i++){
            temp[i] = Math.pow(this.arr[i],n);
        }

        for (int i = 0;i<temp.length;i++){
            System.out.print(temp[i] + " ");
        }
    }
}
