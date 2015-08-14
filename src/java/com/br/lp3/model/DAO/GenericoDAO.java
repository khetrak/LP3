/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp3.model.DAO;

import java.util.List;

/**
 *
 * @author 31165737
 */
public interface GenericoDAO 
{
    //CRUD
    public void Insert(Object object);
    public List<Object> read();
    public boolean update(Object object);
    public boolean remove(Object object);
    
}
