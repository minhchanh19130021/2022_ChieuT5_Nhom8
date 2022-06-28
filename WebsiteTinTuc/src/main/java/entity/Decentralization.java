package entity;

import java.util.Date;
public class Decentralization {
    private int id;
    private String name;
    private String user_id;
    private int isAdmin;
    private Date create_date;

    public Decentralization() {
    }

    public Decentralization(int id, String name,String user_id, int isAdmin, Date create_date) {
        this.id = id;
        this.name = name;
        this.user_id=user_id;
        this.isAdmin = isAdmin;
        this.create_date = create_date;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = User.getUser_name();
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = User.getId();
    }

    public int isAdmin() {
        return  this.isAdmin;
    }

    public void setUser_id(int isAdmin) {
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", user_id='" + user_id + '\'' +
                ", isAdmin='" + isAdmin + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
