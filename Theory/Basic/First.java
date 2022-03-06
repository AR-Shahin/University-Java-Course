import java.util.*;

public class First {

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        First self = new First();
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        self.sayHello(name);

    }
}

// public class Helper {

// }
