package thread;

public class ThreadOne extends Thread{
    Thread t;
    public ThreadOne(String name){
        t = new Thread(this,name);
        t.start();
    }

    @Override
    public void run(){
        for (int i = 1;i<=100;i++){
            System.out.println( t + " " + i);
        }
    }
}
