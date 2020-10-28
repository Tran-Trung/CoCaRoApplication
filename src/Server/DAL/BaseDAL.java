package Server.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAL {
    private static String url = "jdbc:sqlserver://localhost;databaseName=DB_QL_CoCaRo";
    private static String user = "sa";
    private static String password = "123456";
    private static BaseDAL instance;
    
    private BaseDAL(){}
    private static BaseDAL getInstance(){
        if(instance == null){
            instance = new BaseDAL();
        }
        return instance;
    }
}
