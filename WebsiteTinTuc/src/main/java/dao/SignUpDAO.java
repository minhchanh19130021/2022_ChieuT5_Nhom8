package dao;
import context.DBContext;
import entity.Article;
import entity.Decentralization;
import entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class SignUpDAO {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public boolean checkAccountExist(String user_name){
        String query ="select * from user where user_name = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,user_name);
            rs = ps.executeQuery();
            while(rs.next()){
                return true;
//                return new User(rs.getString(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getString(4),
//                        rs.getString(5),
//                        rs.getString(6),
//                        rs.getString(7),
//                        rs.getDate(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       return false;
    }

    public void signup(String user_name, String pass, String first_name, String last_name, String phone, String email){
        int b= (int) (Math.random()*999999);
        String a = user_name+"_"+b;
        String query;
        query = "insert into user(id\n" +
                ",user_name,pass,first_name,last_name,phone,email,create_date) values(?,?,?,?,?,?,?,current_date )";
//        String query ="insert into user(id,user_name,pass,first_name,last_name,phone,email,create_date) values ('"+a+"','"+user_name+"','"+pass+"','"+first_name+"','"+last_name+"','"+phone+"','"+email+"')";


//                "insert into user(id\n" +
//                ",user_name,pass,first_name,last_name,phone,email,create_date)\n"
//                + "values(123,?,?,?,?,?,?,25/03/2001 )";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,a);
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
    public void decentralization(String name){

        String b = User.getId();
        String query;
        query="insert into decentralization(name,user_id,isAdmin,create_date)\n"
                + "values(?,?,0,current_date )";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,b);
            ps.executeUpdate();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}


