/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login.com.dao.LoginDao;

/**
 *
 * @author haseeb
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException 
    {
        String name=req.getParameter("uname");
        String pass=req.getParameter("password");
       LoginDao dao=new LoginDao();
       if(dao.checkDetail(name, pass))
        {
            ;
            HttpSession session=req.getSession();
            session.setAttribute("uname", name);
            res.sendRedirect("welcome.jsp");
        }
        else 
       {
           
         
           res.sendRedirect("login.jsp");
       }
    }
   
}
