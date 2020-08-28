package com.xmliu.spboot.entity;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Person {

    String id;
    String userName;
    String password;

    String role;
//    Set<Role> role;

//    public Person(String id, String userName, String password, Set<Role> roles) {
//        this.id = id;
//        this.userName = userName;
//        this.password = password;
//        this.roles = roles;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

//    public Set<Role> getRoles() {
//        return role;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.role = roles;
//    }
}
