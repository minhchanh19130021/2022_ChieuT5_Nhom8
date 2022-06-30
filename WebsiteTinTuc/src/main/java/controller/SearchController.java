package controller;

import dao.ArticleDAO;
import entity.Article;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchController", value = "/Search")
public class SearchController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String txtTitle = request.getParameter("txtTitle");
        ArticleDAO articleDAO = new ArticleDAO();
        List<Article> listS = articleDAO.searchByTitle(txtTitle);
        List<Article> listB = articleDAO.getArticleBusiness();

        request.setAttribute("txtTitle", txtTitle);
        request.setAttribute("listS", listS);
        request.setAttribute("listB", listB);

        request.getRequestDispatcher("SearchPageSearchPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
