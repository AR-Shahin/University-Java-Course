package com.example.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperation {
	private Connection con;
	private PreparedStatement stmpt;
	private ResultSet resultSet;
	public void connect()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			this.con=DriverManager.getConnection("jdbc:sqlite:lib/FirstProject.db");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void search(String query){
		//="Select * From User Where userId=2019 and pass"
		try {
			stmpt=con.prepareStatement(query);
			this.resultSet=stmpt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//disconnectDb();
	}
	public ResultSet returnResult()
	{
		return this.resultSet;
	}
	public void disconnectDb()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
