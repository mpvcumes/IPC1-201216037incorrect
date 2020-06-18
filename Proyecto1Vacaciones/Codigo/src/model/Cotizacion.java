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
public class Cotizacion {
    
    private String Nombres;
    private String Apellidos;
    private String TipoVehiculo;
    private String UsoVehiculo;
    private String Marca;
    private String Linea;
    private int Telefono;
    private int Modelo;
    private int Rol;
    private int Estado;
    private float DPI;
    private float ValorVehiculo;
    private float Prima;
    private float Deducible;
    private float PosiblePrima;
    private float PosibleDeducible;      
       
    public Cotizacion() {
        this.Nombres = "";
        this.Apellidos = "";
        this.TipoVehiculo = "";
        this.UsoVehiculo = "";
        this.Marca = "";
        this.Linea = "";
        this.Telefono = 0;
        this.Modelo = 0;
        this.Rol = 0;
        this.Estado = 0;
        this.DPI = 0;
        this.ValorVehiculo = 0;
        this.Prima = 0;
        this.Deducible = 0;
        this.PosiblePrima = 0;
        this.PosibleDeducible = 0;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", TipoVehiculo=" + TipoVehiculo + ", UsoVehiculo=" + UsoVehiculo + ", Marca=" + Marca + ", Linea=" + Linea + ", Telefono=" + Telefono + ", Modelo=" + Modelo + ", Rol=" + Rol + ", Estado=" + Estado + ", DPI=" + DPI + ", ValorVehiculo=" + ValorVehiculo + ", Prima=" + Prima + ", Deducible=" + Deducible + ", PosiblePrima=" + PosiblePrima + ", PosibleDeducible=" + PosibleDeducible + '}';
    }        
    
    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the TipoVehiculo
     */
    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    /**
     * @param TipoVehiculo the TipoVehiculo to set
     */
    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    /**
     * @return the UsoVehiculo
     */
    public String getUsoVehiculo() {
        return UsoVehiculo;
    }

    /**
     * @param UsoVehiculo the UsoVehiculo to set
     */
    public void setUsoVehiculo(String UsoVehiculo) {
        this.UsoVehiculo = UsoVehiculo;
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
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Modelo
     */
    public int getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Rol
     */
    public int getRol() {
        return Rol;
    }

    /**
     * @param Rol the Rol to set
     */
    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    /**
     * @return the Estado
     */
    public int getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the DPI
     */
    public float getDPI() {
        return DPI;
    }

    /**
     * @param DPI the DPI to set
     */
    public void setDPI(float DPI) {
        this.DPI = DPI;
    }

    /**
     * @return the ValorVehiculo
     */
    public float getValorVehiculo() {
        return ValorVehiculo;
    }

    /**
     * @param ValorVehiculo the ValorVehiculo to set
     */
    public void setValorVehiculo(float ValorVehiculo) {
        this.ValorVehiculo = ValorVehiculo;
    }

    /**
     * @return the Prima
     */
    public float getPrima() {
        return Prima;
    }

    /**
     * @param Prima the Prima to set
     */
    public void setPrima(float Prima) {
        this.Prima = Prima;
    }

    /**
     * @return the Deducible
     */
    public float getDeducible() {
        return Deducible;
    }

    /**
     * @param Deducible the Deducible to set
     */
    public void setDeducible(float Deducible) {
        this.Deducible = Deducible;
    }

    /**
     * @return the PosiblePrima
     */
    public float getPosiblePrima() {
        return PosiblePrima;
    }

    /**
     * @param PosiblePrima the PosiblePrima to set
     */
    public void setPosiblePrima(float PosiblePrima) {
        this.PosiblePrima = PosiblePrima;
    }

    /**
     * @return the PosibleDeducible
     */
    public float getPosibleDeducible() {
        return PosibleDeducible;
    }

    /**
     * @param PosibleDeducible the PosibleDeducible to set
     */
    public void setPosibleDeducible(float PosibleDeducible) {
        this.PosibleDeducible = PosibleDeducible;
    }
    
    
    
}
