/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.com.dao;
import  java.sql.*;
import javax.security.auth.message.callback.PrivateKeyCallback;

/**
 *
 * @author haseeb
 */
public class LoginDao {
   private String name="";
   private String pass="";
   private String url="";
 public boolean checkDetail(String uname,String password)
    {
        try{
       String query="Select * FROM login where name=? and password=?";
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection(url,name,pass);
       PreparedStatement ps=con.prepareStatement(query);
       ps.setString(1, uname);
       ps.setString(2, password);
       ResultSet set=ps.executeQuery();
       if(set.next())
       {
           return true;
       }
      }
        catch(Exception e)
        {
            System.out.println(e);
        }
     return false;  
    }
}
