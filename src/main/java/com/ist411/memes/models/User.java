package com.ist411.memes.models;


import javax.persistence.*;

@Entity
@Table(name="User", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fName;
    private String lName;
    private String password;
    private String email;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "id="+id+", email="+email;
    }
}
