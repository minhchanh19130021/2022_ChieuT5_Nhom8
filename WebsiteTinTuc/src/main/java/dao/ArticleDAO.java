package dao;

import context.DBContext;
import entity.Article;
import entity.Type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArticleDAO {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Article getArticleTechnology() {
        Article aTech = null;
        String query = "SELECT * FROM article WHERE type_name ='Cong Nghe' ORDER BY article.create_date DESC LIMIT 1";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                aTech = new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aTech;
    }

    public Article getArticleWorld() {
        Article aWorld = null;
        String query = "SELECT * FROM article WHERE type_name ='The Gioi' ORDER BY article.create_date DESC LIMIT 1";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                aWorld = new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aWorld;
    }

    public Article getArticleSport() {
        Article aSport = null;
        String query = "SELECT * FROM article WHERE type_name ='The Thao' ORDER BY article.create_date DESC LIMIT 1";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                aSport = new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aSport;
    }

    public List<Article> getArticleEducation() {
        List<Article> listE = new ArrayList<Article>();
        String query = "SELECT * FROM article WHERE type_name ='Giao Duc' ";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listE.add(new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listE;
    }
    public List<Article> getArticleBusiness() {
        List<Article> listB = new ArrayList<Article>();
        String query = "SELECT * FROM article WHERE type_name ='Kinh Doanh' ";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listB.add(new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listB;
    }


    public List<Type> getTypes() {
        List<Type> listT = new ArrayList<Type>();
        String query = "Select * from type";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                listT.add(new Type(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDate(3)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listT;
    }

    public List<Article> searchByTitle(String txtTitle) {
        List<Article> listS = new ArrayList<Article>();
        String query = "SELECT * FROM article WHERE title LIKE ?";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + txtTitle + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                listS.add(new Article(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listS;
    }

    public static void main(String[] args) {
        ArticleDAO articleDAO = new ArticleDAO();
        List<Article> listT = articleDAO.searchByTitle("2");
        for (Article t : listT) {
            System.out.println(t);
        }
    }
}
