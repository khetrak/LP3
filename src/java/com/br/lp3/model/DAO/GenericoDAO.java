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
public interface GenericoDAO <T>
{
    //CRUD
    public void Insert(T t);
    public List<T> read();
    public boolean update(T t);
    public boolean remove(T t);
    
}
