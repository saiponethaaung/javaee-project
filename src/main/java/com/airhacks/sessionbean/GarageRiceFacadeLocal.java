/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sessionbean;

import com.purhcasing.entities.GarageRice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kyawkyawlwin
 */
@Local
public interface GarageRiceFacadeLocal {

    void create(GarageRice garageRice);

    void edit(GarageRice garageRice);

    void remove(GarageRice garageRice);

    GarageRice find(Object id);

    List<GarageRice> findAll();

    List<GarageRice> findRange(int[] range);

    int count();
    
}
