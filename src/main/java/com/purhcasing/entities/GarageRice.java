/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purhcasing.entities;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Meaple
 */
@Entity
public class GarageRice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate currentStoredTime;
   
    @ManyToOne
    private Garage garage=new Garage();
    @ManyToOne
    private Rice rice = new Rice();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCurrentStoredTime() {
        return currentStoredTime;
    }

    public void setCurrentStoredTime(LocalDate currentStoredTime) {
        this.currentStoredTime = currentStoredTime;
    }

  

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Rice getRice() {
        return rice;
    }

    public void setRice(Rice rice) {
        this.rice = rice;
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
        if (!(object instanceof GarageRice)) {
            return false;
        }
        GarageRice other = (GarageRice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.purhcasing.entities.GarageRice[ id=" + id + " ]";
    }
    
}
