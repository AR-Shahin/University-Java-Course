import java.util.*;

public class First {

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        First self = new First();
        Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // sayHello(name);
        int size = 5;
        int arr[] = { 10, 20, 30, 40 };
        String names[] = { "Shahin", "Omi" };
        int data[] = new int[size];
        // for (int i = 0; i < size; i++) {
        // data[i] = sc.nextInt();
        // }
        // for (int i : data) {
        // System.out.println(i);
        // }
        try {
            System.out.println(arr[1] / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// public class Helper {

// }
