package Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MYSQLOperation extends Helper{

    protected Connection con;
    protected PreparedStatement statement;
    protected ResultSet resultSet;

    public void print(Object obj){
        System.out.println(obj);
    }
    private String url = "jdbc:mysql://localhost:3306/java_cal";
    private String driver = "com.mysql.cj.jdbc.Driver";
    public void connect(){
        try {
            Class.forName(driver);
            this.con = DriverManager.getConnection(url,"main","1234");
//            System.out.println("Connected with Database!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void search(String query){
        try {
            statement = con.prepareStatement(query);
            this.resultSet = statement.executeQuery();
        } catch (SQLException e) {
            print(e.getMessage());
        }
    }

    public void insert(String query) throws SQLException {
        statement = con.prepareStatement(query);
//        preparedStmt.setString (1, s.first_name);
//        preparedStmt.setString (2, s.last_name);
//        preparedStmt.setDate   (3, s.date_created);
//        preparedStmt.setBoolean(4, s.is_admin);
//        preparedStmt.setInt    (5, s.num_points);
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
            print(e.getMessage());
        }
    }
}
