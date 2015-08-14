/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 31165737
 */
public class connectionFactory 
{
    private static final String DB = "testeDB";
    private static final String USER = "lucas";
    private static final String PS = "123";
    
    public static Connection getConnection() throws SQLException,ClassNotFoundException
    {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection(
                "jdbc:derby://localhost"+DB+";"
                + "create=true;"
                + "user="+USER+";"
                + "password="+PS);
    }
}
