package com.ist411.memes.models;


import org.mindrot.jbcrypt.BCrypt;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    //private String passwordHash;
    private String email;
    private List<String> roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public void setPasswordHash(String password) {
        this.passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
    }*/

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
