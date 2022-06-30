package entity;

import java.util.Date;
public class Decentralization {
    private static String name;
    private static String user_id;
    private int isAdmin;
    private Date create_date;

    public Decentralization() {
    }

    public Decentralization(String name,String user_id, int isAdmin, Date create_date) {
        this.name = name;
        this.user_id=user_id;
        this.isAdmin = isAdmin;
        this.create_date = create_date;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public static String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id =user_id;
    }

    public int isAdmin() {
        return  this.isAdmin;
    }

    public void setisAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Date getCreate_date() {
        return this.create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", user_id='" + user_id + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
