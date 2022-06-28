package dao;
import context.DBContext;
import entity.Article;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SignUpDAO {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public User checkAccountExist(String user_name){
        String query ="select * from user\n"
                + "where user_name = ?\n";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,user_name);
            rs = ps.executeQuery();
            while(rs.next()){
                return new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void signup(String user_name, String pass, String first_name, String last_name, String phone, String email){
        String query ="insert into user\n"
                + "values(id,?,?,?,?,?,?,current_date )";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(2,user_name);
            ps.setString(3,pass);
            ps.setString(4,first_name);
            ps.setString(5,last_name);
            ps.setString(6,phone);
            ps.setString(7,email);
            ps.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void decentralization(String name,String user_id){
        String query ="insert into decentralization\n"
                + "values(?,?,?,0,current_date )";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(2,name);
            ps.setString(3,user_id);
            rs = ps.executeQuery();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SignUpDAO signUpDAO = new SignUpDAO();

    }
}


