import model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User u1 = new User("Ars",101);
        User u2 = new User("Omi",102);

        users.add(u1);
        users.add(u2);

        for(User user : users){
            System.out.println(user.name);
        }
        System.out.println("Hello world!");
    }
}