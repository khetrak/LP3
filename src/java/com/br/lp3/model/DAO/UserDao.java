/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.DAO;

import com.br.lp3.model.JB.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31165737
 */
public class UserDao  implements GenericoDAO<User>
{
   private PreparedStatement ps;
   private Connection conn;

    @Override
    public void Insert(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> read() 
    {
        String query = "SETECT * FROM USUSARIO";
        List<User> usuarios = new ArrayList<>();
       try {
           ps = conn.prepareStatement(query);
           ResultSet rs = ps.executeQuery();
           while(rs.next())
           {
               String nome = rs.getString("username");
               String senha = rs.getString("password");
               int id = rs.getInt("is_usuario");
               User user = new User(nome,senha);
               usuarios.add(user);
           }
           rs.close();
           ps.close();
       } catch (SQLException ex) {
           Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
       }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return usuarios;
    }

    @Override
    public boolean update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}
