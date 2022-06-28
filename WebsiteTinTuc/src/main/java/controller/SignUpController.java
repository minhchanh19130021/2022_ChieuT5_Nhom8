package controller;

import dao.SignUpDAO;
import entity.User;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUpController", value = "/SignUp")
public class SignUpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String user_name = request.getParameter("user_name");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if(!pass.equals(re_pass)){
            request.setAttribute("mess","Mật khẩu không khớp");
            request.getRequestDispatcher("sign_up.jsp").forward(request, response);
        } else {
            SignUpDAO dao = new SignUpDAO();
            User a = dao.checkAccountExist(user_name);
            if(a==null){
                dao.signup(user_name,pass,first_name,last_name,phone,email);
                dao.decentralization(user_name, request.getRequestedSessionId());
                response.sendRedirect("/Home");
            }else{
                request.setAttribute("mess","Tài khoản đã tồn tại");
                request.getRequestDispatcher("sign_up.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
