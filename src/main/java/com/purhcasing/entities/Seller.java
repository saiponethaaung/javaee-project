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
import javax.persistence.OneToMany;

/**
 *
 * @author Meaple
 */
@Entity
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private boolean is_marchant;
    @OneToMany(mappedBy="seller")
    private List<Rice> riceList = new ArrayList<>();   
    @OneToMany(mappedBy="seller")
    private List<SellerCredit> sellerCreditList = new ArrayList<>();
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIs_marchant() {
        return is_marchant;
    }

    public void setIs_marchant(boolean is_marchant) {
        this.is_marchant = is_marchant;
    }

    public List<Rice> getRiceList() {
        return riceList;
    }

    public void setRiceList(List<Rice> riceList) {
        this.riceList = riceList;
    }

    public List<SellerCredit> getSellerCreditList() {
        return sellerCreditList;
    }

    public void setSellerCreditList(List<SellerCredit> sellerCreditList) {
        this.sellerCreditList = sellerCreditList;
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
        if (!(object instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.purhcasing.entities.Seller[ id=" + id + " ]";
    }
    
}
