<%-- 
    Document   : videos
    Created on : 14-giu-2018, 14.09.40
    Author     : haseeb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <body>
        
        <%
             response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
        if(session.getAttribute("uname")==null)
            {
                response.sendRedirect("login.jsp");
            }
       
            
            %>
            
            <iframe width="500" height="500" src="https://www.youtube.com/watch?v=b1hT2yYo80k" allowfullscreen="">
                
            </iframe>
          <form action="logut" method="get">
                <input type="submit" value="Logout">
            </form>
    </body>
</html>
