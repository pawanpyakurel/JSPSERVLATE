package com.neosphere.jspservlate;

import com.neosphere.jspservlate.util.CommonConstant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Jiwan on 12/17/2018.
 */
@WebServlet(name = "loginServlet",urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(CommonConstant.BASE_PATH + "login.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user_name");
        String password = request.getParameter("password");

        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            /**
             * Storing username value in session
             */
            HttpSession session = request.getSession(true);
            session.setAttribute("UserName", username);

            response.sendRedirect("welcome");
        } else {
            response.sendRedirect("login");
        }

    }
}
