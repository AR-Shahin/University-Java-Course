package model;

import database.MySQLDBOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends MySQLDBOperation {
    public User(){
        this.connect();
    }
    ResultSet data;
    private String table = "users",query;
    public String name,email,age,blood,password,phone,type;
    public ResultSet allDonor() throws SQLException {
        ResultSet data;

        query = "SELECT * FROM `"+ table +"` WHERE `role` = 'donor' ORDER BY id DESC";
        statement = con.prepareStatement(query);
        data = statement.executeQuery();
        return data;
    }
    public ResultSet searchDonor(String blood) throws SQLException {
        ResultSet data;
        query = "SELECT * FROM `"+ table +"` WHERE `role` = 'donor' AND `blood` = '"+ blood +"' ORDER BY id DESC";
        query = "SELECT * FROM users";
        statement = con.prepareStatement(query);
        data = statement.executeQuery();
        return data;
    }
    public boolean addDonor() throws SQLException {
//        print(name+email+password+age+phone+blood+type);

        query = "INSERT INTO `users` (`name`, `email`, `password`, `age`, `phone`, `blood`, `status`, `role`) VALUES (? ,? ,?,?,?,?,?,?)";
        statement = con.prepareStatement(query);
        statement.setString(1,name);
        statement.setString(2,email);
        statement.setString(3,password);
        statement.setString(4,age);
        statement.setString(5,phone);
        statement.setString(6,blood);
        statement.setString(7,"active");
        statement.setString(8,type);
        if(!statement.execute()){
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
            user =data.getString(1) + ";" + data.getString(2) + ";" + data.getString(3) + ";" + data.getString(5)+ ";" + data.getString(6) + ";" + data.getString(7) + ";" + data.getString(8) + ";" + data.getString(9)+ ";" + data.getString(4);
        }
        return user;
    }

    public boolean changePassword(String password,int userId) throws SQLException {
        query = "UPDATE "+ this.table + " SET password='"+password+"' WHERE id='"+userId+"'";
        statement = con.prepareStatement(query);
        int res = statement.executeUpdate();

        if(res == 1){
            return true;
        }
        return false;
    }
}
