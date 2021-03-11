package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<com.example.demo.model.User> users;

    public Role() {
    }

    public Role(String name, Set<com.example.demo.model.User> users) {
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<com.example.demo.model.User> getUsers() {
        return users;
    }

    public void setUsers(Set<com.example.demo.model.User> users) {
        this.users = users;
    }
}
