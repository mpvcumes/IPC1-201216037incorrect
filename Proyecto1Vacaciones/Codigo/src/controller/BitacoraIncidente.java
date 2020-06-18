/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Incidentes;
import controller.BitacoraVehículos;


/**
 *
 * @author 
 */
public class BitacoraIncidente {
    Incidentes[] HistorialIncidente = new Incidentes[99];    
    private int contadorIncidente= 0;
    BitacoraVehículos bi = new BitacoraVehículos();
    ColaCotizacion co= new ColaCotizacion();
    
    

    public void anadirIncidente(int Codigo, String RolAsegurado, String RolTercero, float DPIAsegurado, float DPITercero, float CostoReal, float PagoRequerido, String Estado, String Pago, boolean TerceroAsegurado){
        if (contadorIncidente<99) {
            
            System.out.println(contadorIncidente+Codigo);
            
                this.HistorialIncidente[contadorIncidente] = new Incidentes();
                this.HistorialIncidente[contadorIncidente].setCodigo(contadorIncidente+Codigo);
                this.HistorialIncidente[contadorIncidente].setRolAsegurado(RolAsegurado);
                this.HistorialIncidente[contadorIncidente].setRolTercero(RolTercero);
                this.HistorialIncidente[contadorIncidente].setDPIAsegurado(DPIAsegurado);
                this.HistorialIncidente[contadorIncidente].setDPITercero(DPITercero);
                this.HistorialIncidente[contadorIncidente].setCostoReal(CostoReal);
                this.HistorialIncidente[contadorIncidente].setCostoReal(establecePagoRequerido(CostoReal,DPIAsegurado, RolAsegurado ));
                this.HistorialIncidente[contadorIncidente].setEstado(Estado);
                this.HistorialIncidente[contadorIncidente].setPago(Pago);
                this.HistorialIncidente[contadorIncidente].setIsTerceroAsegurado(TerceroAsegurado);

                contadorIncidente++;
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public void mostrarIncidente(){
        if (contadorIncidente==0) {
            System.out.println("No Existen datos");
        }else{
            for (int i = 0; i < contadorIncidente; i++) {
                System.out.println(HistorialIncidente[i].toString());
            }            
        }

    }
    
    public String[][] getTableIncidentesAsegurados(float DPI){
    
        int contadorTemp = 0;
        for (int i = 0; i < contadorIncidente; i++) {
            if( this.HistorialIncidente[i].getDPIAsegurado()== DPI ||this.HistorialIncidente[i].getDPITercero()== DPI ){           
                contadorTemp++;            
            }
        }
        
        int subContador = 0;
        String[][] arrayTable = new String[contadorTemp][6];
        if (contadorIncidente>0) {
            for (int i = 0; i < contadorIncidente; i++) {
                if( this.HistorialIncidente[i].getDPIAsegurado()== DPI ){
                    arrayTable[subContador][0] = this.HistorialIncidente[i].getCodigo()+"";
                    arrayTable[subContador][1] = this.HistorialIncidente[i].getRolAsegurado();
                    arrayTable[subContador][2] = this.HistorialIncidente[i].getCostoReal()+"";
                    arrayTable[subContador][3] = this.HistorialIncidente[i].getPagoRequerido()+"";
                    arrayTable[subContador][4] = this.HistorialIncidente[i].getEstado()+"";
                    arrayTable[subContador][5] = this.HistorialIncidente[i].getPago()+"";
                    subContador++;
                }else if (this.HistorialIncidente[i].getDPITercero()== DPI){
                    arrayTable[subContador][0] = this.HistorialIncidente[i].getCodigo()+"";
                    arrayTable[subContador][1] = this.HistorialIncidente[i].getRolTercero();
                    arrayTable[subContador][2] = this.HistorialIncidente[i].getCostoReal()+"";
                    arrayTable[subContador][3] = this.HistorialIncidente[i].getPagoRequerido()+"";
                    arrayTable[subContador][4] = this.HistorialIncidente[i].getEstado()+"";
                    arrayTable[subContador][5] = this.HistorialIncidente[i].getPago()+"";
                    subContador++;                
                }
            }
        }else{
            System.out.println("No existe información de tipo los Vehiculos");
        }
        
        return arrayTable;
    
    }
    
    public float establecePagoRequerido(float costoReal, float dpiA, String rolAseg){//cuanto va a pagar el culpable
        float pago=0f;
        if (contadorIncidente==0) {
            System.out.println("No Existen datos");
        }else{
            for (int i = 0; i < contadorIncidente; i++) {
                if ( !this.HistorialIncidente[i].isIsTerceroAsegurado()   && this.HistorialIncidente[i].getRolTercero().equals("Autor")){;
                    pago= costoReal; 
                }else if(this.HistorialIncidente[i].isIsTerceroAsegurado()){
                    pago= co.valorVehiculo(dpiA)+ (0.20f*co.valorDeducible(dpiA));
                }else if(rolAseg.equals("Autor")){
                    pago=co.valorDeducible(dpiA);
                }else {
                    co.valorDeducible(dpiA);
                }
            }
        }
        return pago;
    }
    
     public String[][] getTableIncidentesAdministrador(){
        
        int subContador = 0;
        String[][] arrayTable = new String[contadorIncidente][6];
        if (contadorIncidente>0) {
            for (int i = 0; i < contadorIncidente; i++) {
                
                    arrayTable[subContador][0] = this.HistorialIncidente[i].getCodigo()+"";
                    arrayTable[subContador][1] = this.HistorialIncidente[i].getDPIAsegurado()+"";
                    arrayTable[subContador][2] = this.HistorialIncidente[i].getDPITercero()+"";                    
                    arrayTable[subContador][3] = this.HistorialIncidente[i].getEstado()+"";
                    arrayTable[subContador][4] = this.HistorialIncidente[i].getPago()+"";
                    subContador++;                
            }
        }else{
            System.out.println("No existe información de tipo los Vehiculos");
        }
        
        return arrayTable;
    
    }
     
    
    public boolean updateEstadoIncidente(int Codigo){
       boolean resultado = false;
        for (int i = 0; i < contadorIncidente; i++) {
            if(Codigo == this.HistorialIncidente[i].getCodigo()){

                this.HistorialIncidente[i].setEstado("TERMINADO");               

                resultado = true;

            }                          
        }            
         
         return resultado;
    }
    
    public boolean updateEstadoPago(int Codigo){
       boolean resultado = false;
        for (int i = 0; i < contadorIncidente; i++) {
            if(Codigo == this.HistorialIncidente[i].getCodigo()){

                this.HistorialIncidente[i].setPago("Pagado");               

                resultado = true;

            }                          
        }            
         
         return resultado;
    }
     
}


