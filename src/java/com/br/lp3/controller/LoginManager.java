/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.controller;

/**
 *
 * @author 31165737
 */
public class LoginManager 
{
    private String username,password ;

    public LoginManager(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    LoginManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean authorize()
    {
        return ( "cacique".equals(username) && "123".equals(password) ) ;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
