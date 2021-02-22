package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    private int id;
    private String userName;

//    @OneToMany(mappedBy = "user")
//    private List<Question> questionList;
    public User() {
    }

//    public List<Question> getQuestionList() {
//        return questionList;
//    }
//
//    public void setQuestionList(List<Question> questionList) {
//        this.questionList = questionList;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
