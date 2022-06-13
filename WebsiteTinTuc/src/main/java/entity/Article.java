package entity;

import java.util.Date;

public class Article {
    private String id;
    private String title;
    private String description;
    private String content;
    private String url_img;
    private String author_name;
    private String type_name;
    private Date create_date;

    public Article() {
    }

    public Article(String id, String title, String description, String content, String url_img, String author_name, String type_name, Date create_date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.url_img = url_img;
        this.author_name = author_name;
        this.type_name = type_name;
        this.create_date = create_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", url_img='" + url_img + '\'' +
                ", author_name='" + author_name + '\'' +
                ", type_name='" + type_name + '\'' +
                ", create_date=" + create_date +
                '}';
    }
}
