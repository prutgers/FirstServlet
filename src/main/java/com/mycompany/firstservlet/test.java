/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstservlet;

import java.util.List;

/**
 *
 * @author Gebruiker
 */
public class test {
    public static void main(String[]args){
        UserDao dao = new UserDao();
        List<User> list = dao.getAllUsers();
        for(User u : list){
            System.out.println( "user: " + u.getFirstName());
        }
    }    
    

}
