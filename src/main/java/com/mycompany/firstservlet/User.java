package com.mycompany.firstservlet;

import java.util.Date;

public class User {

    private int userid;
    private String name;
    private String lastName;
    
    private String email;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getFirstName() {
        return name;
    }
    public void setFirstName(String firstName) {
        this.name = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [userid=" + userid + ", name=" + name
                + ", lastName=" + lastName + ", email="
                + email + "]";
    }    
}