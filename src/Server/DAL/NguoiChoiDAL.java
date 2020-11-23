package Server.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import Server.DTO.NguoiChoiDTO;

public class NguoiChoiDAL {
    private Connection connection;
    private String url = "jdbc:sqlserver://localhost;databaseName=DB_QL_CoCaRo";
    private String user = "sa";
    private String password = "123456";
  
    public final String NGUOICHOI = "NGUOICHOI";
    
    private PreparedStatement pst;
    private ResultSet resultSet;
    private Statement statement;
    
    public Connection connect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connect successfull");
        } catch (SQLException ex) {
            Logger.getLogger(NguoiChoiDAL.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error connection! Lỗi kết nối nhé!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NguoiChoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    
    public ResultSet getData() {
        try {
            statement = connection.createStatement(); //tạo đối tượng Statement để tương tác với CSDL
            resultSet = statement.executeQuery("SELECT * FROM "+NGUOICHOI);
        } catch (SQLException ex) {
            Logger.getLogger(NguoiChoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }
    
    private void showData() {
        resultSet = getData();
        try {
            while(resultSet.next()) {
                System.out.printf("%-15s %-4s", resultSet.getString(1), resultSet.getString(2));
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiChoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insertUser(NguoiChoiDTO user) {
        System.out.println("Before: name = "+user.Taikhoan+" - pass = "+user.Matkhau);
        try {
            pst = connection.prepareCall("INSERT INTO "+NGUOICHOI+" VALUES ('"+u.name+"', '"+u.pass+"')");
            int kq = pst.executeUpdate();
            if(kq > 0) System.out.println("Insert successful!");
            System.out.println("After: name = "+u.name+" - pass = "+u.pass);
            return kq;
//        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
//            System.out.println("[LỖI!] primary key '"+u.name+"' đã tồn tại, ko thểm thêm bản ghi này!");
        } catch (SQLException ex) {
            Logger.getLogger(NguoiChoiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
