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
public class Incidentes {
    private int Codigo;
    private String RolAsegurado;
    private String RolTercero;
    private float DPIAsegurado;
    private float DPITercero;
    private float CostoReal;
    private float PagoRequerido;
    private String Estado;
    private String Pago; 
    private boolean isTerceroAsegurado;
    

    public Incidentes() {
        this.Codigo = 0;
        this.RolAsegurado = "";
        this.RolTercero = "";
        this.DPIAsegurado = 0;
        this.DPITercero = 0;
        this.CostoReal = 0;
        this.PagoRequerido = 0;
        this.Estado = "";
        this.Pago = "";
        this.isTerceroAsegurado=true;
    }

    @Override
    public String toString() {
        return "Incidentes{" + "Codigo=" + Codigo + ", RolAsegurado=" + RolAsegurado + ", RolTercero=" + RolTercero + ", DPIAsegurado=" + DPIAsegurado + ", DPITercero=" + DPITercero + ", CostoReal=" + CostoReal + ", PagoRequerido=" + PagoRequerido + ", Estado=" + Estado + ", Pago=" + Pago + '}';
    }
        
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getRolAsegurado() {
        return RolAsegurado;
    }

    public void setRolAsegurado(String RolAsegurado) {
        this.RolAsegurado = RolAsegurado;
    }

    public String getRolTercero() {
        return RolTercero;
    }

    public void setRolTercero(String RolTercero) {
        this.RolTercero = RolTercero;
    }

    public float getDPIAsegurado() {
        return DPIAsegurado;
    }

    public void setDPIAsegurado(float DPIAsegurado) {
        this.DPIAsegurado = DPIAsegurado;
    }

    public float getDPITercero() {
        return DPITercero;
    }

    public void setDPITercero(float DPITercero) {
        this.DPITercero = DPITercero;
    }

    public float getCostoReal() {
        return CostoReal;
    }

    public void setCostoReal(float CostoReal) {
        this.CostoReal = CostoReal;
    }

    public float getPagoRequerido() {
        return PagoRequerido;
    }

    public void setPagoRequerido(float PagoRequerido) {
        this.PagoRequerido = PagoRequerido;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    /**
     * @return the isTerceroAsegurado
     */
    public boolean isIsTerceroAsegurado() {
        return isTerceroAsegurado;
    }

    /**
     * @param isTerceroAsegurado the isTerceroAsegurado to set
     */
    public void setIsTerceroAsegurado(boolean isTerceroAsegurado) {
        this.isTerceroAsegurado = isTerceroAsegurado;
    }

    public int getIsTerceroAsegurado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
