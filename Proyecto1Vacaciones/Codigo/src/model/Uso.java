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
public class Uso {
    private  String usage ;
    private float porcentaje;

    public Uso() {
        this.usage="";
        this.porcentaje= 0;
        
        
    }

    /**
     * @return the usage
     */
    public String getUsage() {
        return usage;
    }

    /**
     * @param usage the usage to set
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * @return the porcentaje
     */
    public float
         getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(float
            porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
    
}
