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
public class Usuario {    
    private String Nombres;
    private String Apellidos;
    private float DPI;
    private int Telefono;
    private int Rol;
    
    
    public Usuario(){
        this.Nombres = "";
        this.Apellidos = "";
        this.DPI = 0;
        this.Telefono = 0;
        this.Rol = 0;
    }
               
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public float getDPI() {
        return DPI;
    }

     public void setDPI(float DPI) {
        this.DPI = DPI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getRol() {
        return Rol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }
            
}
