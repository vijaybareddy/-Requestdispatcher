package com.example;


    import java.io.IOException;
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

   // @WebServlet("/FrontServlet/HrServlet")
    public class HrServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.getWriter().write("This is the HR Servlet");
            RequestDispatcher r= request.getRequestDispatcher("/ProjectServlet");
            r.forward(request,response);
        }
}
