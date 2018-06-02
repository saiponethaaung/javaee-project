/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.sessionbean;

import com.purhcasing.entities.Seller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kyawkyawlwin
 */
@Stateless
public class SellerFacade extends AbstractFacade<Seller> implements SellerFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_java-ee-student-project_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SellerFacade() {
        super(Seller.class);
    }
    
}
