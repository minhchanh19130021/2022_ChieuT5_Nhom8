package controller;

import dao.ArticleDAO;
import entity.Article;
import entity.Type;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeController", value = "/Home")
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ArticleDAO articleDAO = new ArticleDAO();
        Article aTech = articleDAO.getArticleTechnology();
        Article aWorld = articleDAO.getArticleWorld();
        Article aSport = articleDAO.getArticleSport();
        List<Article> listE = articleDAO.getArticleEducation();
        List<Type> listT = articleDAO.getTypes();

        request.setAttribute("aTech", aTech);
        request.setAttribute("aWorld", aWorld);
        request.setAttribute("aSport", aSport);
        request.setAttribute("listE", listE);
        request.setAttribute("listT", listT);
        request.getRequestDispatcher("HomePage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
