package com.example.demo.repository;

import com.example.demo.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserRole {
    @Id

    @ManyToOne
    @JoinColumn(name = "user_name", nullable = false)
    private User user;

    @OneToMany(mappedBy = "userRole")
    private List<User> userList;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;


    public UserRole() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
