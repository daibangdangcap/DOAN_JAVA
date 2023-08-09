package laptrinhjava_doan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TIEN THANH
 */
public class MyConnection {
    public static Connection getConnection()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qldb","root","root");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    public MyConnection(){}
}
