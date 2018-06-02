/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ping.boundary;

import com.airhacks.sessionbean.GarageFacadeLocal;
import com.airhacks.sessionbean.GarageRiceFacadeLocal;
import com.airhacks.sessionbean.RiceFacadeLocal;
import com.airhacks.sessionbean.SellerCreditFacadeLocal;
import com.airhacks.sessionbean.SellerFacadeLocal;
import com.purhcasing.entities.Garage;
import com.purhcasing.entities.GarageRice;
import com.purhcasing.entities.Rice;
import com.purhcasing.entities.Seller;
import com.purhcasing.entities.SellerCredit;
import java.time.LocalDate;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author kyawkyawlwin
 */
@Path("mill")
@Stateless
public class MillFactoryPurchasingResource {
    @Inject
    private GarageFacadeLocal garageFacade;
    @Inject
    private GarageRiceFacadeLocal garageRiceFacade;
    @Inject
    private SellerFacadeLocal sellerFacade;
    @Inject
    private SellerCreditFacadeLocal sellerCreditFacade;
    @Inject
    private RiceFacadeLocal riceFacade;
    
     
    @GET
    @Path("/create")
    public Response createInitialResource(){
        
        //GARAGE
        Garage garage1=new Garage();
       
        
        garage1.setAvailable_quantity(5000);
        garage1.setName("One");
       
        
        
        
        
        Seller seller1=new Seller();
        seller1.setIs_marchant(true);
        seller1.setName("John");
       
        
        
        
        
       
        
        Rice rice1=new Rice();
        rice1.setLoc("Location 1");
        rice1.setName("Jasmine Rice");
        rice1.setPrice(600000);
        rice1.setQuantity(3000);
        rice1.setSeller(seller1);
        seller1.getRiceList().add(rice1);
        
        
        
        
         SellerCredit sellerCredit=new SellerCredit();
        sellerCredit.setAmount(50000);
        sellerCredit.setIs_paid(false);
        sellerCredit.setRice(rice1);
        sellerCredit.setSeller(seller1);
        
        rice1.getSellerCredit().add(sellerCredit);
        sellerCredit.setRice(rice1);
        
        GarageRice garageRice1=new GarageRice();
        garageRice1.setCurrentStoredTime(LocalDate.now());
        garageRice1.setGarage(garage1);
        
        garageRice1.setRice(rice1);
        rice1.getGarageRiceList().add(garageRice1);
        
        
        garage1.getGarageRiceList().add(garageRice1);
        seller1.getSellerCreditList().add(sellerCredit);
        sellerCredit.setSeller(seller1);
       
       
        garageFacade.create(garage1);
        garageRiceFacade.create(garageRice1);
        sellerFacade.create(seller1);
        sellerCreditFacade.create(sellerCredit);
        riceFacade.create(rice1);
        
        
        
        return Response.ok().entity("successfully created.").build();
    }
   
    
}
