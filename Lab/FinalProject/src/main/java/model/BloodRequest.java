package model;

import database.MySQLDBOperation;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BloodRequest extends MySQLDBOperation {
    public int id;
    public int user_id;
    public String blood;
    public boolean status;
    private String table = "blood_request",query;
    public BloodRequest(){
        this.connect();
    }
    public boolean store() throws SQLException {
        query = "INSERT INTO `"+ this.table +"` (`user_id`, `blood`, `status`) VALUES (? ,? ,?)";
        statement = con.prepareStatement(query);
        statement.setInt(1,this.user_id);
        statement.setString(2,this.blood);
        statement.setBoolean(3,true);

        if(!statement.execute()){
            return true;
        }else {
            return false;
        }
    }

    public ResultSet getUserBloodRequests(int user_id){
        ResultSet data;

        query = "SELECT * FROM `"+ this.table +"` WHERE `user_id` = " + user_id + " ORDER BY id DESC";
        try {
            statement = con.prepareStatement(query);
            data = statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

    public ResultSet getUserBloodRequests(String blood){
        ResultSet data;

        query = "SELECT * FROM `"+ this.table +"` WHERE `blood` = '" + blood + "' ORDER BY id DESC";
        try {
            statement = con.prepareStatement(query);
            data = statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return data;
    }
    public ResultSet all(){
        ResultSet data;

        query = "SELECT * FROM `"+ this.table + "` ORDER BY id DESC";
        try {
            statement = con.prepareStatement(query);
            data = statement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return data;
    }
}
