package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    private int id;
    private String title;
    private String question;
    private String answer;
    private String id_question_type;
    private String data_create;
    private String user_create;

    private String user_feedback;
    private String status;


//    @ManyToOne
//    @JoinColumn(name = "question_type_id", nullable = false)
//    private QuestionType questionType;

//    @ManyToOne
//    @JoinColumn(name = "user_create", nullable = false)
//    private User user;
     public Question() {
    }

    public String getId_question_type() {
        return id_question_type;
    }

    public void setId_question_type(String id_question_type) {
        this.id_question_type = id_question_type;
    }

    public String getUser_create() {
        return user_create;
    }

    public void setUser_create(String user_create) {
        this.user_create = user_create;
    }

//    public QuestionType getQuestionType() {
//        return questionType;
//    }
//
//    public void setQuestionType(QuestionType questionType) {
//        this.questionType = questionType;
//    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public String getData_create() {
        return data_create;
    }

    public void setData_create(String data_create) {
        this.data_create = data_create;
    }

    public String getUser_feedback() {
        return user_feedback;
    }

    public void setUser_feedback(String user_feedback) {
        this.user_feedback = user_feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
