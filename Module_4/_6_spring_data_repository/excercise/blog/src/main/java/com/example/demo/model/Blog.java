package com.example.demo.model;

import javax.persistence.*;

@Entity(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String title;
    @Column(name="content",columnDefinition = "text")
    //???
    private String content;
    @Column(name = "write_date",columnDefinition = "DATE")
    private String writeDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;
    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }
}
