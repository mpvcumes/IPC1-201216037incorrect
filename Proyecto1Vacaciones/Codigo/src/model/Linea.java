/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author myria
 */
public class Linea {
    
   private String nombreL;
   private float porcentaje;

    public Linea() {
        this.nombreL = "";
        this.porcentaje= 0;
    }

    /**
     * @return the nombreL
     */
    public String getNombreL() {
        return nombreL;
    }

    /**
     * @param nombreL the nombreL to set
     */
    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    /**
     * @return the porcentaje
     */
    public float getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }
   
   
    
}
