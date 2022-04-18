import thread.ThreadOne;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program Start!");
        ThreadOne th1 = new ThreadOne("th1");
        ThreadOne th2 = new ThreadOne("th2");
        System.out.println("Program End!");

    }




}