
//import com.mysql.jdbc.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/zadanie_java?autoReconnect=true&useSSL=false","root","password");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
}
}
