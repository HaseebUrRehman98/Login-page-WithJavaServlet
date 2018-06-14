<%-- 
    Document   : welcome
    Created on : 14-giu-2018, 14.09.32
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
            Welcome ${uname}<br>
            <a href="videos.jsp">Videos here</a>
            <form action="logut" method="get">
                <input type="submit" value="Logout">
            </form>
    </body>
</html>
