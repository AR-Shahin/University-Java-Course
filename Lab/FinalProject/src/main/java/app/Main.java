package app;

import model.BloodRequest;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main{

    public static void main(String[] args) throws SQLException {
        Application app = new Application();
        app.startApp();

        BloodRequest b = new BloodRequest();
        b.user_id = 8;
        b.status = true;
        b.blood = "A+";
//        b.store();
//        User user = new User();
//        user.findDonor(3);
//        user.addDonor();
        ResultSet res = b.all();
//        try {
//            while (res.next()){
//                System.out.println(res.getString(2));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}