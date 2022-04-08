/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalproject;
import java.sql.*;
import java.sql.DriverManager;


/**
 *
 * @author Dave
 */
public class Connectionprovider {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","");
            System.out.println("Connected");
            return conn;
        }
        catch(Exception e)
        {
            return null;
        }
        
    }
    
}
