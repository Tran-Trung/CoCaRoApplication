package Server.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=DB_QL_CoCaRo";
            String user = "sa";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            /*
            String query = "Select * From NGUOICHOI";
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("TAIKHOAN"));
            }*/
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return connection;    
    }
    /*public static void coloseConnection(Connection con) {
        if(con != null){
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Không thể ngắt kết nối...");
            }
        }
    }*/
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(getConnection());
    }
}
