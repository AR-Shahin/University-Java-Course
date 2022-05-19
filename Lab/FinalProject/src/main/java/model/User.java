package model;

import database.MySQLDBOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends MySQLDBOperation {
    public User(){
        this.connect();
    }
    ResultSet data;
    private String table = "users";
    private String query;
    protected String name;
    protected String email;
    protected String age;
    protected String blood;
    protected String password;
    protected String phone;
    public ResultSet allDonor() throws SQLException {
        ResultSet data;

        query = "SELECT * FROM `"+ table +"` WHERE `role` = 'donor'";
        statement = con.prepareStatement(query);
        data = statement.executeQuery();
        return data;
    }

    public boolean addDonor() throws SQLException {
        query = "INSERT INTO `users` (`name`, `email`, `password`, `age`, `phone`, `blood`, `status`, `role`) VALUES (? ,? ,?,?,?,?,?,?)";
        statement = con.prepareStatement(query);
        statement.setString(1,name);
        statement.setString(2,email);
        statement.setString(3,password);
        statement.setString(4,age);
        statement.setString(5,phone);
        statement.setString(6,blood);
        statement.setString(7,"active");
        statement.setString(8,"donor");
        if(statement.execute()){
            return true;
        }else {
            return false;
        }
    }

    public String findDonor(int id) throws SQLException {
        query = "SELECT * FROM `"+ table +"` WHERE id = "+ id +" AND role = 'donor' LIMIT 1";
        statement = con.prepareStatement(query);
        data = statement.executeQuery();

        int i = 0;
        while (data.next()){
            print(data.getMetaData());
        }

        return "";
    }
}
