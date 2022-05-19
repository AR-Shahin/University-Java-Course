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
    public String email;
    protected String age;
    protected String blood;
    public String password;
    protected String phone;
    public ResultSet allDonor() throws SQLException {
        ResultSet data;

        query = "SELECT * FROM `"+ table +"` WHERE `role` = 'donor' ORDER BY id DESC";
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

        while (data.next()){
            print(data.getMetaData());
        }

        return "";
    }

    public String authenticate() throws SQLException {
        String user = "NOT_EXIST";
        query = "SELECT * FROM `"+ table +"` WHERE email = '"+ email +"' AND password = '" + password +"' LIMIT 1";
        statement = con.prepareStatement(query);
        data = statement.executeQuery();

        if(data.next()){
            user = data.getString(2) + ";" + data.getString(3) + ";" + data.getString(5)+ ";" + data.getString(6) + ";" + data.getString(7) + ";" + data.getString(8) + ";" + data.getString(9);
        }
        return user;

    }
}
