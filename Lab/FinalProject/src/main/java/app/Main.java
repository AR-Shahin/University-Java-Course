package app;

import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{

    public static void main(String[] args) throws SQLException {
        Application app = new Application();
        app.startApp();
        User user = new User();
        user.findDonor(3);
//        user.addDonor();
//        ResultSet res = user.allDonor();
//        try {
//            while (res.next()){
//                System.out.println(res.getString(2));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}