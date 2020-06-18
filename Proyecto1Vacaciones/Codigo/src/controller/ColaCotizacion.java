/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Cotizacion;

/**
 *
 * @author myria
 */
public class ColaCotizacion {

    Cotizacion[] nuevaCotizacion = new Cotizacion[99];
    private int contadorCotizacion= 0;
    private float DPISesion = 0;

    public void anadirCotizacion(String Nombres, String Apellidos, String TipoVehiculo, String UsoVehiculo, String Marca, String Linea, int Telefono, int Modelo, int Rol, int Estado, float DPI, float ValorVehiculo, float Prima, float Deducible, float PosiblePrima, float PosibleDeducible){
       if (contadorCotizacion<99) { 
            if ( !dpiExiste(DPI)){
                this.nuevaCotizacion[contadorCotizacion] = new Cotizacion();
                this.nuevaCotizacion[contadorCotizacion].setNombres(Nombres);
                this.nuevaCotizacion[contadorCotizacion].setApellidos(Apellidos);
                this.nuevaCotizacion[contadorCotizacion].setDPI(DPI);
                this.nuevaCotizacion[contadorCotizacion].setTelefono(Telefono);
                this.nuevaCotizacion[contadorCotizacion].setTipoVehiculo(TipoVehiculo);
                this.nuevaCotizacion[contadorCotizacion].setUsoVehiculo(UsoVehiculo);
                this.nuevaCotizacion[contadorCotizacion].setMarca(Marca);
                this.nuevaCotizacion[contadorCotizacion].setLinea(Linea);
                this.nuevaCotizacion[contadorCotizacion].setModelo(Modelo);
                this.nuevaCotizacion[contadorCotizacion].setValorVehiculo(ValorVehiculo);
                this.nuevaCotizacion[contadorCotizacion].setPrima(Prima);
                this.nuevaCotizacion[contadorCotizacion].setPosiblePrima(PosiblePrima);
                this.nuevaCotizacion[contadorCotizacion].setDeducible(Deducible);
                this.nuevaCotizacion[contadorCotizacion].setPosibleDeducible(PosibleDeducible);
                this.nuevaCotizacion[contadorCotizacion].setRol(Rol);
                this.nuevaCotizacion[contadorCotizacion].setEstado(Estado);
                contadorCotizacion++;
            }else{
                JOptionPane.showMessageDialog(null, "El DPI ingresado ya tiene una cotización, por favor espere a ser aprobado.");
            }

       }else{
           System.out.println("Base de datos llena");
       }
    }

    public boolean dpiExiste(float DPI){
        boolean existe= false;
        if (contadorCotizacion==0) {
            existe= false;
        }else{
            for (int i=0; i<contadorCotizacion; i++){
                if ( DPI == this.nuevaCotizacion[i].getDPI()){
                    existe=true;
                }
            }
        }

        return existe;
    }

    public void mostrarCotizacion(){

        for (int i=0; i<contadorCotizacion; i++){
            System.out.println(this.nuevaCotizacion[i].toString());
        }

    }
    
    public int numeroCotizaciones(){
            return contadorCotizacion;
    }
    
    public String obtieneNombre (int iExt){
        String nombre= "";
        for (int i=0; i<contadorCotizacion; i++){
           if (iExt == i){
                nombre= this.nuevaCotizacion[contadorCotizacion].getNombres();
           }
        }
        return nombre;
    }
    
    public String[][] getTable(){
        int contadorTemp = 0;
        for (int i = 0; i < contadorCotizacion; i++) {
            if(this.nuevaCotizacion[i].getEstado()==0){
            
                contadorTemp++;
            
            }
        }
        
        int subContador = 0;
        String[][] arrayTable = new String[contadorTemp][8];
        if (contadorCotizacion>0) {
            for (int i = 0; i < contadorCotizacion; i++) {
                if(this.nuevaCotizacion[i].getEstado()==0){
                    arrayTable[subContador][0] = this.nuevaCotizacion[i].getDPI()+"";
                    arrayTable[subContador][1] = this.nuevaCotizacion[i].getNombres() + " " + this.nuevaCotizacion[i].getApellidos();
                    arrayTable[subContador][2] = this.nuevaCotizacion[i].getTelefono()+"";
                    arrayTable[subContador][3] = this.nuevaCotizacion[i].getTipoVehiculo();
                    arrayTable[subContador][4] = this.nuevaCotizacion[i].getTipoVehiculo() +" "+ String.valueOf(this.nuevaCotizacion[i].getModelo())+ " "+ this.nuevaCotizacion[i].getMarca()+" "+this.nuevaCotizacion[i].getLinea()+" "+this.nuevaCotizacion[i].getUsoVehiculo();
                    arrayTable[subContador][5] = this.nuevaCotizacion[i].getValorVehiculo()+"";
                    arrayTable[subContador][6] = this.nuevaCotizacion[i].getPrima()+"";
                    arrayTable[subContador][7] = this.nuevaCotizacion[i].getDeducible()+"";
                    subContador++;
                }
            }
        }else{
            System.out.println("No existe información de tipo los Vehiculos");
        }
        
        return arrayTable;
    }
    
    public String[][] getTableNoAsegurados(){
                int contadorTemp = 0;
        for (int i = 0; i < contadorCotizacion; i++) {
            if(this.nuevaCotizacion[i].getRol()==3){
            
                contadorTemp++;
            
            }
        }
        
        int subContador = 0;
        String[][] arrayTable = new String[contadorTemp][8];
        if (contadorCotizacion>0) {
            for (int i = 0; i < contadorCotizacion; i++) {
                if(this.nuevaCotizacion[i].getRol()==3 ){
                    arrayTable[subContador][0] = this.nuevaCotizacion[i].getDPI()+"";
                    arrayTable[subContador][1] = this.nuevaCotizacion[i].getNombres() + " " + this.nuevaCotizacion[i].getApellidos();
                    arrayTable[subContador][2] = this.nuevaCotizacion[i].getTelefono()+"";
                    subContador++;
                }
            }
        }else{
            System.out.println("No existe información de personas no aseguradas");
        }
        
        return arrayTable;
       }
    
    public String[][] getTableAsegurados(){
        int contadorTemp = 0;
        for (int i = 0; i < contadorCotizacion; i++) {
            if(this.nuevaCotizacion[i].getRol()==2){   
                System.out.println("hola");
                contadorTemp++;            
            }
        }
        
        int subContador = 0;
        String[][] arrayTable = new String[contadorTemp][8];
        if (contadorCotizacion>0) {
            for (int i = 0; i < contadorCotizacion; i++) {
                if(this.nuevaCotizacion[i].getRol()==2 ){
                    arrayTable[subContador][0] = this.nuevaCotizacion[i].getDPI()+"";
                    arrayTable[subContador][1] = this.nuevaCotizacion[i].getNombres() + " " + this.nuevaCotizacion[i].getApellidos();
                    arrayTable[subContador][2] = this.nuevaCotizacion[i].getTelefono()+"";
                    arrayTable[subContador][3] = "INFORMACION EN PROCESO";
                    arrayTable[subContador][4] = "INFORMACION EN PROCESO ";

                    subContador++;
                }
            }
        }else{
            System.out.println("No existe información de personas no aseguradas");
        }

        return arrayTable;
    }
    
    public boolean updateEstado(float DPI){
        boolean resultado = false;
         for (int i = 0; i < contadorCotizacion; i++) {
             if(DPI == this.nuevaCotizacion[i].getDPI()){
                 
                 this.nuevaCotizacion[i].setEstado(1);
                 this.nuevaCotizacion[i].setRol(2);
                 
                 resultado = true;
             
             }                          
         }            
         
         return resultado;
    }
    
    public boolean updateEstadoRechazo(float DPI){
        boolean resultado = false;
         for (int i = 0; i < contadorCotizacion; i++) {
             if(DPI == this.nuevaCotizacion[i].getDPI()){
                 
                 this.nuevaCotizacion[i].setEstado(2);
                 
                 resultado = true;
             
             }                          
         }            
         
         return resultado;
    }

    public String[][] validarIngreso(float DPI){
            
        String resultado = "false";
        String Rol = "0";
        /* Array */
        String[][] returnArray = new String[1][2];
        for (int i = 0; i < contadorCotizacion; i++) {            
            
            if ( DPI == this.nuevaCotizacion[i].getDPI()) {
                System.out.println("Si es igual");
                if (this.nuevaCotizacion[i].getEstado()==1 && this.nuevaCotizacion[i].getRol()==2) {
                    System.out.println("Esta asegurado");
                    resultado = "true"; 
                    Rol = "2";
                }else if(this.nuevaCotizacion[i].getEstado()==1 && this.nuevaCotizacion[i].getRol()==3) {
                    System.out.println("Existe pero no asegurado");
                    resultado = "true";                
                    Rol = "3";
                }
            }
            
        }
        
        returnArray[0][0] = resultado;
        returnArray[0][1] = Rol;
        
        System.out.println(returnArray[0][0]);
        System.out.println(returnArray[0][1]);
        
        return returnArray;
        
    }

    public Float getDPISesion(){                        
        
        return DPISesion;
        
    }
    
    public void setDPISesion(Float DPI){
    
        DPISesion = DPI;
    }
    
    public boolean getSesionAsegurado(Float DPI){
        boolean existe= false;
        if (contadorCotizacion==0) {
            existe= false;
        }else{
            for (int i=0; i<contadorCotizacion; i++){
                if ( DPI == this.nuevaCotizacion[i].getDPI() && 2 == this.nuevaCotizacion[i].getRol()){
                    existe=true;
                }
            }
        }

        return existe;
        
    }
    
    public String getInfoAsegurados(){
    
        float DPI = this.getDPISesion();
        
        String InfoAsegurado = "";
        
        for (int i=0; i<contadorCotizacion; i++){
            if ( DPI == this.nuevaCotizacion[i].getDPI()){
                 InfoAsegurado += "Nombres: " + this.nuevaCotizacion[i].getNombres()+" "+ this.nuevaCotizacion[i].getApellidos()+ "\r\n";
                 InfoAsegurado += "Telefono: " + this.nuevaCotizacion[i].getTelefono()+"\r\n";
                 InfoAsegurado += "DPI: " + this.nuevaCotizacion[i].getDPI()+"\r\n";
                 InfoAsegurado += "Tipo: Asegurado";                 
            }
        }
        
        return InfoAsegurado;
    }
    
    
    public String getPrimaPolizaAsegurado(){
    
        float DPI = this.getDPISesion();
        
        String InfoAsegurado = "";
        
        for (int i=0; i<contadorCotizacion; i++){
            if ( DPI == this.nuevaCotizacion[i].getDPI()){
                 InfoAsegurado = this.nuevaCotizacion[i].getPosiblePrima()+"";                       
            }
        }
        
        return InfoAsegurado;
    }
    
    public String getPrecioDeducibleAsegurado(){
    
        float DPI = this.getDPISesion();
        
        String InfoAsegurado = "";
        
        for (int i=0; i<contadorCotizacion; i++){
            if ( DPI == this.nuevaCotizacion[i].getDPI()){
                 InfoAsegurado = this.nuevaCotizacion[i].getPosibleDeducible()+"";                       
            }
        }
        
        return InfoAsegurado;
    }
    
    public String getMontoAsegurado(){
    
        float DPI = this.getDPISesion();
        
        String InfoAsegurado = "";
        
        for (int i=0; i<contadorCotizacion; i++){
            if ( DPI == this.nuevaCotizacion[i].getDPI()){
                 InfoAsegurado = this.nuevaCotizacion[i].getValorVehiculo() +"";                       
            }
        }
        
        return InfoAsegurado;
    }
    
        public String getInfoNoAsegurados(){
    
        float DPI = this.getDPISesion();
        
        String InfoAsegurado = "";
        
        for (int i=0; i<contadorCotizacion; i++){
            if ( DPI == this.nuevaCotizacion[i].getDPI()){
                 InfoAsegurado += "Nombres: " + this.nuevaCotizacion[i].getNombres()+" "+ this.nuevaCotizacion[i].getApellidos()+ "\r\n";
                 InfoAsegurado += "Telefono: " + this.nuevaCotizacion[i].getTelefono()+"\r\n";
                 InfoAsegurado += "DPI: " + this.nuevaCotizacion[i].getDPI()+"\r\n";
                 InfoAsegurado += "Tipo: No Asegurado";                 
            }
        }
        
        return InfoAsegurado;
    }
    
    public boolean getSesionNoAsegurado(Float DPI){
        boolean existe= false;
        if (contadorCotizacion==0) {
            existe= false;
        }else{
            for (int i=0; i<contadorCotizacion; i++){
                if ( DPI == this.nuevaCotizacion[i].getDPI() && 3 == this.nuevaCotizacion[i].getRol()){
                    existe=true;
                }
            }
        }

        return existe;
        
    }
    
    
    public float valorVehiculo(float dpi){
        float valor=0f;
        for (int i=0; i<contadorCotizacion; i++){
            if (this.nuevaCotizacion[i].getDPI()==dpi){
                   valor= this.nuevaCotizacion[i].getValorVehiculo();
            }
        }
        return valor;
    }
    
        public float valorDeducible(float dpi){
        float valor=0f;
        for (int i=0; i<contadorCotizacion; i++){
            if (this.nuevaCotizacion[i].getDPI()==dpi){
                   valor= this.nuevaCotizacion[i].getPosibleDeducible();
            }
        }
        return valor;
    }
}
