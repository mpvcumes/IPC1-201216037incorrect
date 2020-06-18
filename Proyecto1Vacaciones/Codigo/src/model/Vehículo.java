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
public class Vehículo {
    private String  Tipo;
    private String Modelo;
    private String  Marca;
    private String  Linea;
    private String  Uso;
    private String  Mecanica;
    private String  Repuesto;

    public Vehículo() {
        this.Tipo = "";
        this.Modelo = "";
        this.Marca = "";
        this.Linea = "";
        this.Uso = "";
        this.Mecanica = "";
        this.Repuesto = "";
    }
    
    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Linea
     */
    public String getLinea() {
        return Linea;
    }

    /**
     * @param Linea the Linea to set
     */
    public void setLinea(String Linea) {
        this.Linea = Linea;
    }

    /**
     * @return the Uso
     */
    public String getUso() {
        return Uso;
    }

    /**
     * @param Uso the Uso to set
     */
    public void setUso(String Uso) {
        this.Uso = Uso;
    }

    /**
     * @return the Mecanica
     */
    public String getMecanica() {
        return Mecanica;
    }

    /**
     * @param Mecanica the Mecanica to set
     */
    public void setMecanica(String Mecanica) {
        this.Mecanica = Mecanica;
    }

    /**
     * @return the Repuesto
     */
    public String getRepuesto() {
        return Repuesto;
    }

    /**
     * @param Repuesto the Repuesto to set
     */
    public void setRepuesto(String Repuesto) {
        this.Repuesto = Repuesto;
    }
   

   
}
