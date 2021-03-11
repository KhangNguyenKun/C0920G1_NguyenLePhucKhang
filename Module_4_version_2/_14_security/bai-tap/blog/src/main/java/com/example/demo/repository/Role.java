package com.example.demo.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    private String roleId;
    private String roleName;

    @OneToMany(mappedBy = "role")
    private List<UserRole> userRoleList;

    public Role() {
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
