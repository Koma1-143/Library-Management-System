package project;
import java.sql.*;

/**
 *
 * @author Drag11
 */
public class connectionProvider {
    public static Connection getCon()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","14022003");
           return con;
       
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
           
       }
    }
    
}
