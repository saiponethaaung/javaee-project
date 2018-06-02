/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sessionbean;

import com.purhcasing.entities.SellerCredit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kyawkyawlwin
 */
@Local
public interface SellerCreditFacadeLocal {

    void create(SellerCredit sellerCredit);

    void edit(SellerCredit sellerCredit);

    void remove(SellerCredit sellerCredit);

    SellerCredit find(Object id);

    List<SellerCredit> findAll();

    List<SellerCredit> findRange(int[] range);

    int count();
    
}
