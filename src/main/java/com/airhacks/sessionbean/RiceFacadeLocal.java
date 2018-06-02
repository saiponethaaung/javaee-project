/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sessionbean;

import com.purhcasing.entities.Rice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kyawkyawlwin
 */
@Local
public interface RiceFacadeLocal {

    void create(Rice rice);

    void edit(Rice rice);

    void remove(Rice rice);

    Rice find(Object id);

    List<Rice> findAll();

    List<Rice> findRange(int[] range);

    int count();
    
}
