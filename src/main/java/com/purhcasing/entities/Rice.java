/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purhcasing.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Meaple
 */
@Entity
public class Rice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String loc;
    
    private String name ;
    @ManyToOne
    private Seller seller;
    @OneToMany(mappedBy="rice")
    private List<SellerCredit> sellerCredit=new ArrayList<>();
    private double price;
    private int quantity;
    @OneToMany(mappedBy="rice")
    private List<GarageRice> garageRiceList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<SellerCredit> getSellerCredit() {
        return sellerCredit;
    }

    public void setSellerCredit(List<SellerCredit> sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

   
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<GarageRice> getGarageRiceList() {
        return garageRiceList;
    }

    public void setGarageRiceList(List<GarageRice> garageRiceList) {
        this.garageRiceList = garageRiceList;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rice)) {
            return false;
        }
        Rice other = (Rice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.purhcasing.entities.Rice[ id=" + id + " ]";
    }
    
}
