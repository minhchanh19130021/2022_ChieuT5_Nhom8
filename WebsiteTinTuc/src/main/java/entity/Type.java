package entity;

import java.util.Date;

public class Type {
    private String id;
    private String name;
    private Date create_date;

    public Type() {
    }

    public Type(String id, String name, Date create_date) {
        this.id = id;
        this.name = name;
        this.create_date = create_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
