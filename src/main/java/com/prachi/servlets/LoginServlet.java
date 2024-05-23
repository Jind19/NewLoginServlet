package com.prachi.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {

    private LoginService service = new LoginService();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("WEB-INF/views/login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");

        boolean isValidUser = service.isUserValid(userName,userPass);
        if (isValidUser){
            request.getSession().setAttribute("userName", userName);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/welcome.jsp");
            requestDispatcher.forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Credentials");

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/login.jsp");
            requestDispatcher.forward(request, response);
        }

    }
}
