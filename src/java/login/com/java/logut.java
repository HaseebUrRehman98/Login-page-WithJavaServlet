/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.com.java;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author haseeb
 */
@WebServlet(name = "logut", urlPatterns = {"/logut"})
public class logut extends HttpServlet {
    
  protected  void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
  {
      HttpSession session=req.getSession();
      session.removeAttribute("uname");
      session.invalidate();
      res.sendRedirect("login.jsp");
  }
 
}
