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
public class Repuesto {

    private String nombreR;

    private float precio;

    public Repuesto() {
        this.nombreR = "";
        this.precio = 0;
    }

    /**
     *
     * /
     *
     **
     * @param nombreR the nombreR to set
     */
    /**
     * @return the precio
     */
    public float
            getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the nombreR
     */
    public String getNombreR() {
        return nombreR;
    }

    /**
     * @param nombreR the nombreR to set
     */
    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

}
