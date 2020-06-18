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
public class Modelo {
    private int anio;
    private float depreciacion;

    public Modelo() {
        this.anio=0;
        this.depreciacion=0;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the depreciacion
     */
    public float getDepreciacion() {
        return depreciacion;
    }

    /**
     * @param depreciacion the depreciacion to set
     */
    public void setDepreciacion(float depreciacion) {
        this.depreciacion = depreciacion;
    }
    
}
