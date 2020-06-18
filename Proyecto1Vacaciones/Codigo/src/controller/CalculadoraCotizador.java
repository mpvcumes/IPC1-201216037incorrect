/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author myria
 */
public class CalculadoraCotizador {
    private float valorVehiculo;
    private float porcentajeMarca;
    private float porcentajeLinea ;
    private float porcentajeUso;
    private float porDepreciacion;
    private float valEstablecido;
    private int contadorDeducibleMas;
    private int contadorDeducibleMenos;

    public CalculadoraCotizador() {
    }
    
    
    
    
    public CalculadoraCotizador(float valorVehiculo, float porcentajeMarca, float porcentajeLinea, float porcentajeUso) {
        this.valorVehiculo = valorVehiculo;
        this.porcentajeMarca = porcentajeMarca;
        this.porcentajeLinea = porcentajeLinea;
        this.porcentajeUso = porcentajeUso;
    }

    public CalculadoraCotizador(float valorVehiculo, float porcentajeMarca, float porcentajeLinea, float porcentajeUso, int contadorDeducibleMenos, int contadorDeducibleMas) {
        this.valorVehiculo = valorVehiculo;
        this.porcentajeMarca = porcentajeMarca;
        this.porcentajeLinea = porcentajeLinea;
        this.porcentajeUso = porcentajeUso;
        this.contadorDeducibleMenos= contadorDeducibleMenos;
        this.contadorDeducibleMas= contadorDeducibleMas;

    }
        


    public CalculadoraCotizador(float valEstablecido,float porDepreciacion ) {
        this.porDepreciacion= porDepreciacion;
        this.valEstablecido= valEstablecido;
    }
    
    
    
    public float valorReal (){
        float valorReal= valEstablecido- (porDepreciacion*valEstablecido)  ;
        return valorReal;
        
    }
   

    public float deducible(){
       float deducible=this.valorVehiculo*0.07f;
       return deducible;
    }
    
    public float primaTotal(){
        float primaT = valorVehiculo*(porcentajeTotalRiesgo() + (0.1f)); 
        return primaT;
        
    }
    
    public float prima(){
        float prima = primaTotal()/12; 
        return prima;
    }
    
    public float porcentajeTotalRiesgo(){
      float total = this.porcentajeMarca+ this.porcentajeLinea+this.porcentajeUso;
      return total;
    }
    
    public float masDeducible(){
       float masDeducible=deducible();
       for (int i=0; i<contadorDeducibleMas; i++){
            masDeducible= masDeducible+(masDeducible*.10f);
       }
       return masDeducible;
       
    }
    public float menosDeducible(){
       float menosDeducible= deducible();
       for (int i =0; i<contadorDeducibleMenos; i++){
       menosDeducible = menosDeducible-(menosDeducible*.10f);
       }
       return menosDeducible;
    }
    
    public float masDeduciblePrima(){
       float menosPrima= prima();
       for (int i=0; i<contadorDeducibleMas; i++){
            menosPrima= menosPrima-(menosPrima*.03f);
       }
       return menosPrima;
    }
    
    public float menosDeduciblePrima(){
            float masPrima= prima();
       for (int i=0; i<contadorDeducibleMenos; i++){
            masPrima= masPrima-(masPrima*.03f);
       }
       return masPrima;
    }
    /**
     * @return the valorvehiculo
     */
    public float getValorvehiculo() {
        return valorVehiculo;
    }

    /**
     * @param valorvehiculo the valorvehiculo to set
     */
    public void setValorvehiculo(float valorvehiculo) {
        this.valorVehiculo = valorvehiculo;
    }

    /**
     * @return the porcentajeMarca
     */
    public float getPorcentajeMarca() {
        return porcentajeMarca;
    }

    /**
     * @param porcentajeMarca the porcentajeMarca to set
     */
    public void setPorcentajeMarca(float porcentajeMarca) {
        this.porcentajeMarca = porcentajeMarca;
    }

    /**
     * @return the porcentajeLinea
     */
    public float getPorcentajeLinea() {
        return porcentajeLinea;
    }

    /**
     * @param porcentajeLinea the porcentajeLinea to set
     */
    public void setPorcentajeLinea(float porcentajeLinea) {
        this.porcentajeLinea = porcentajeLinea;
    }

    /**
     * @return the porentajeUso
     */
    public float getPorentajeUso() {
        return porcentajeUso;
    }

    /**
     * @param porentajeUso the porentajeUso to set
     */
    public void setPorentajeUso(float porentajeUso) {
        this.porcentajeUso = porentajeUso;
    }
    
}
