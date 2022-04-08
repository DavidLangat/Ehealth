package hospitalproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dave
 */
import java.sql.*;
import java.sql.DriverManager;
public class Test1 {
    public static void main(String[] args){
        Connection conn;
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            System.out.println("Connected");
            Statement stmt = (Statement) conn.createStatement();
            String name = "James";
            String pass = "Brown";
            String email = "Me";
            String insert = "INSERT INTO `login`(`name1`, `password`, `email`) VALUES ('"+name+"','"+pass+"','"+email+"')";
            stmt.executeUpdate(insert);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
