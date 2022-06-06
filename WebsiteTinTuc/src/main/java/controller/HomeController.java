package controller;

import dao.HomeDAO;
import entity.Article;
import entity.Type;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", value = "")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HomeDAO homeDAO = new HomeDAO();
        Article aTech = homeDAO.getArticleTechnology();
        Article aWorld = homeDAO.getArticleWorld();
        Article aSport = homeDAO.getArticleSport();
        List<Article> listE = homeDAO.getArticleEducation();
        List<Type> listT = homeDAO.getTypes();

        request.setAttribute("aTech", aTech);
        request.setAttribute("aWorld", aWorld);
        request.setAttribute("aSport", aSport);
        request.setAttribute("listE", listE);
        request.setAttribute("listT", listT);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
