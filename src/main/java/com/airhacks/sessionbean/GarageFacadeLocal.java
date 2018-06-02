/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sessionbean;

import com.purhcasing.entities.Garage;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kyawkyawlwin
 */
@Local
public interface GarageFacadeLocal {

    void create(Garage garage);

    void edit(Garage garage);

    void remove(Garage garage);

    Garage find(Object id);

    List<Garage> findAll();

    List<Garage> findRange(int[] range);

    int count();
    
}
