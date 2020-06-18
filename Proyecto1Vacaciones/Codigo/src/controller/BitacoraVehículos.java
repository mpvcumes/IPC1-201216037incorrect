/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Vehículo;
import model.Usuario;
import model.Tipo;
import model.Marca;
import model.Linea;
import model.Repuesto;
import model.Modelo;
import model.Mecanica;
import model.Uso;


/**
 *
 * @author myria
 */
public class BitacoraVehículos {
    Tipo[] historialTipo = new Tipo[99];
    Linea[] historialLinea = new Linea[99];
    Marca[] historialMarca= new Marca[99];
    Repuesto[] historialRepuesto = new Repuesto[99];
    Uso[] historialUso = new Uso[99];
    Modelo[] historialModelo = new Modelo[99];
    Mecanica[] historialMecanica =new Mecanica[99];
    
            
    private int contadorTipo= 0;   
    private int contadorModelo= 0;
    private int contadorMarca= 0;
    private int contadorLinea= 0;
    private int contadorUso= 0;
    private int contadorMecanica= 0;
    private int contadorRepuesto= 0;
    
    public void anadirTipo(String Nombre, float Valor){ //
        if (contadorTipo<99) {
            boolean validacion = buscarTipo(Nombre);
            if(validacion){
                this.historialTipo[contadorTipo] = new Tipo();
                this.historialTipo[contadorTipo].setNombre(Nombre);
                this.historialTipo[contadorTipo].setValor(Valor);
                contadorTipo++;
            }else{
                System.out.println("Ya existe el tipo de Vehiculo "+ Nombre);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarTipo(String Nombre){//Este método valida si el tipo de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorTipo==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorTipo; i++) {                                            
                if (Nombre.equals(this.historialTipo[i].getNombre())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarTipo(){
        if (contadorTipo==0) {
            System.out.println("No existe información de los Vehiculos");
        }else{
            for (int i = 0; i < contadorTipo; i++) {            
                
                System.out.println("Nombre: " + this.historialTipo[i].getNombre() + " Valor: " + this.historialTipo[i].getValor() );
            
            }
        }
    }
    
    public String[] getTipo(){
        String[] arrayTipo = new String[contadorTipo];
        if (contadorTipo>0) {
            for (int i = 0; i < contadorTipo; i++) {
                arrayTipo[i] = this.historialTipo[i].getNombre();
            }
        }else{
            System.out.println("No existe información de tipo los Vehiculos");
        }
        
        return arrayTipo;
    }
    
    public float getValorTipo(String Nombre){
        float resultado = 0;
        
        if (contadorTipo==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorTipo; i++) {                                            
                if (Nombre.equals(this.historialTipo[i].getNombre())) {
                    resultado = this.historialTipo[i].getValor();
                }
            }
        }
        
        return resultado;
    }
    

    public void anadirModelo(int anio, float depreciacion){ //
        if (contadorModelo<99) {
            boolean validacion = buscarModelo(anio);
            if(validacion){
                this.historialModelo[contadorModelo] = new Modelo();
                this.historialModelo[contadorModelo].setAnio(anio);
                this.historialModelo[contadorModelo].setDepreciacion(depreciacion);
                contadorModelo++;
            }else{
                System.out.println("Ya existe el modelo de vehículo "+ anio);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    
    
    public boolean buscarModelo(int anio){//Este método valida si el Modelo de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorModelo==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorModelo; i++) {                                            
                if (anio == this.historialModelo[i].getAnio()) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarModelo(){
        if (contadorModelo==0) {
            System.out.println("No existe información del modelo");
        }else{
            for (int i = 0; i < contadorModelo; i++) {            
                
                System.out.println("Año: " + this.historialModelo[i].getAnio() + " Porcentaje de depreciación: " + this.historialModelo[i].getDepreciacion() );
            
            }
        }
    }
    
    public int[] getModelo(){
        int[] arrayModelo = new int[contadorModelo];
        if (contadorModelo>0) {
            for (int i = 0; i < contadorModelo; i++) {
                arrayModelo[i] = this.historialModelo[i].getAnio();
            }
        }else{
            System.out.println("No existe información de Modelo los Vehiculos");
        }
        
        return arrayModelo;
    }
    
    public String[] getModeloString(){
        String[] arrayModelo = new String[contadorModelo];
        if (contadorModelo>0) {
            for (int i = 0; i < contadorModelo; i++) {
                arrayModelo[i] =  Integer.toString(this.historialModelo[i].getAnio()) ;
            }
        }else{
            System.out.println("No existe información de Modelo los Vehiculos");
        }
        
        return arrayModelo;
    }
    
    public float getValorModelo(String anio){
        float resultado = 0;
        
        if (contadorModelo==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorModelo; i++) {                                            
                if (anio.equals(this.historialModelo[i].getAnio())) {
                    resultado = this.historialModelo[i].getDepreciacion();
                }
            }
        }
        
        return resultado;
    }
    
     public void anadirLinea(String nombreL, float porcentaje){ //
        if (contadorLinea<99) {
            boolean validacion = buscarLinea(nombreL);
            if(validacion){
                this.historialLinea[contadorLinea] = new Linea();
                this.historialLinea[contadorLinea].setNombreL(nombreL);
                this.historialLinea[contadorLinea].setPorcentaje(porcentaje);
                contadorLinea++;
            }else{
                System.out.println("Ya existe el Linea de Vehiculo "+ nombreL);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarLinea(String nombreL){//Este método valida si el Linea de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorLinea==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorLinea; i++) {                                            
                if (nombreL.equals(this.historialLinea[i].getNombreL())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarLinea(){
        if (contadorLinea==0) {
            System.out.println("No existe información de la Línea");
        }else{
            for (int i = 0; i < contadorLinea; i++) {            
                
                System.out.println("nombreL: " + this.historialLinea[i].getNombreL() + " porcentaje: " + this.historialLinea[i].getPorcentaje() );
            
            }
        }
    }
    
    public String[] getLinea(){
        String[] arrayLinea = new String[contadorLinea];
        if (contadorLinea>0) {
            for (int i = 0; i < contadorLinea; i++) {
                arrayLinea[i] = this.historialLinea[i].getNombreL();
            }
        }else{
            System.out.println("No existe información de Linea los Vehiculos");
        }
        
        return arrayLinea;
    }
    
    public float getPorcentajeLinea(String nombreL){
        float resultado = 0;
        
        if (contadorLinea==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorLinea; i++) {                                            
                if (nombreL.equals(this.historialLinea[i].getNombreL())) {
                    resultado = this.historialLinea[i].getPorcentaje();
                }
            }
        }
        
        return resultado;
    } 
    
    
      public void anadirMarca(String nombre, float porcentaje){ //
        if (contadorMarca<99) {
            boolean validacion = buscarMarca(nombre);
            if(validacion){
                this.historialMarca[contadorMarca] = new Marca();
                this.historialMarca[contadorMarca].setNombre(nombre);
                this.historialMarca[contadorMarca].setPorcentaje(porcentaje);
                contadorMarca++;
            }else{
                System.out.println("Ya existe el Marca de Vehiculo "+ nombre);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarMarca(String nombre){//Este método valida si el Marca de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorMarca==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorMarca ; i++) {                                            
                if (nombre.equals(this.historialMarca[i].getNombre())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarMarca(){
        if (contadorMarca==0) {
            System.out.println("No existe información de los Vehiculos");
        }else{
            for (int i = 0; i < contadorMarca; i++) {            
                
                System.out.println("Marca: " + this.historialMarca[i].getNombre() + " porcentaje: " + this.historialMarca[i].getPorcentaje() );
            
            }
        }
    }
    
    public String[] getMarca(){
        String[] arrayMarca = new String[contadorMarca];
        if (contadorMarca>0) {
            for (int i = 0; i < contadorMarca; i++) {
                arrayMarca[i] = this.historialMarca[i].getNombre();
            }
        }else{
            System.out.println("No existe información de Marca los Vehiculos");
        }
        
        return arrayMarca;
    }
    
    public float getPorcentajeMarca(String Nombre){
        float resultado = 0;
        
        if (contadorMarca==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorMarca; i++) {                                            
                if (Nombre.equals(this.historialMarca[i].getNombre())) {
                    resultado = this.historialMarca[i].getPorcentaje();
                }
            }
        }
        
        return resultado;
    }
    
    public void anadirUso(String usage, float porcentaje){ //
        if (contadorUso<99) {
            boolean validacion = buscarUso(porcentaje);
            if(validacion){
                this.historialUso[contadorUso] = new Uso();
                this.historialUso[contadorUso].setUsage(usage);
                this.historialUso[contadorUso].setPorcentaje(porcentaje);
                contadorUso++;
            }else{
                System.out.println("Ya existe el Uso de Vehiculo "+ porcentaje);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarUso(float porcentaje){//Este método valida si el Uso de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorUso==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorUso; i++) {                                            
                if (porcentaje == (this.historialUso[i].getPorcentaje())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarUso(){
        if (contadorUso==0) {
            System.out.println("No existe información de los Vehiculos");
        }else{
            for (int i = 0; i < contadorUso; i++) {            
                
                System.out.println("Uso: " + this.historialUso[i].getUsage() + " Porcentaje: " + this.historialUso[i].getPorcentaje() );
            
            }
        }
    }
    
    public String[] getUso(){
        String[] arrayUso = new String[contadorUso];
        if (contadorUso>0) {
            for (int i = 0; i < contadorUso; i++) {
                arrayUso[i] = this.historialUso[i].getUsage();
            }
        }else{
            System.out.println("No existe información de Uso de los Vehiculos");
        }
        
        return arrayUso;
    }
    
    public float getPorcentajeUso(String porcentaje){
        float resultado = 0;
        
        if (contadorUso==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorUso; i++) {                                            
                if (porcentaje.equals(this.historialUso[i].getPorcentaje())) {
                    resultado = this.historialUso[i].getPorcentaje();
                }
            }
        }
        
        return resultado;
    }
    
        public void anadirMecanica(String actividad, float precio){ //
        if (contadorMecanica<99) {
            boolean validacion = buscarMecanica(precio);
            if(validacion){
                this.historialMecanica[contadorMecanica] = new Mecanica();
                this.historialMecanica[contadorMecanica].setActividad(actividad);
                this.historialMecanica[contadorMecanica].setPrecio(precio);
                contadorMecanica++;
            }else{
                System.out.println("Ya existe el Mecanica de Vehiculo "+ precio);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarMecanica(float precio){//Este método valida si el Mecanica de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorMecanica==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorMecanica; i++) {                                            
                if (precio == (this.historialMecanica[i].getPrecio())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarMecanica(){
        if (contadorMecanica==0) {
            System.out.println("No existe información los trabajos de mecanica del vehiculo");
        }else{
            for (int i = 0; i < contadorMecanica; i++) {            
                
                System.out.println("Mecanica: " + this.historialMecanica[i].getActividad() + " Precio: " + this.historialMecanica[i].getPrecio() );
            
            }
        }
    }
    
    public String[] getMecanica(){
        String[] arrayMecanica = new String[contadorMecanica];
        if (contadorMecanica>0) {
            for (int i = 0; i < contadorMecanica; i++) {
                arrayMecanica[i] = this.historialMecanica[i].getActividad();
            }
        }else{
            System.out.println("No existe información de Mecanica de los Vehiculos");
        }
        
        return arrayMecanica;
    }
    
    public float getPrecioMecanica(String actividad){
        float resultado = 0;
        
        if (contadorMecanica==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorMecanica; i++) {                                            
                if (actividad.equals(this.historialMecanica[i].getActividad())) {
                    resultado = this.historialMecanica[i].getPrecio();
                }
            }
        }
        
        return resultado;
    }
    
    
        public void anadirRepuesto(String nombreR, float precio){ //
        if (contadorRepuesto<99) {
            boolean validacion = buscarRepuesto(precio);
            if(validacion){
                this.historialRepuesto[contadorRepuesto] = new Repuesto();
                this.historialRepuesto[contadorRepuesto].setNombreR(nombreR);
                this.historialRepuesto[contadorRepuesto].setPrecio(precio);
                contadorRepuesto++;
            }else{
                System.out.println("Ya existe el Repuesto de Vehiculo "+ precio);
            }
        }else{
            System.out.println("Base de datos llena");
        }
    }
    
    public boolean buscarRepuesto(float precio){//Este método valida si el Repuesto de auto ya fue ingresado antes para no duplicarlo
        boolean resultado = true;
        if (contadorRepuesto==0) {
            resultado = true;
        }else{
            for (int i = 0; i < contadorRepuesto; i++) {                                            
                if (precio == (this.historialRepuesto[i].getPrecio())) {
                    resultado = false;
                }
            }
        }                
        return resultado;
    }
    
    public void mostrarRepuesto(){
        if (contadorRepuesto==0) {
            System.out.println("No existe información los trabajos de Repuesto del vehiculo");
        }else{
            for (int i = 0; i < contadorRepuesto; i++) {            
                
                System.out.println("Repuesto: " + this.historialRepuesto[i].getNombreR() + " Precio: " + this.historialRepuesto[i].getPrecio() );
            
            }
        }
    }
    
    public String[] getRepuesto(){
        String[] arrayRepuesto = new String[contadorRepuesto];
        if (contadorRepuesto>0) {
            for (int i = 0; i < contadorRepuesto; i++) {
                arrayRepuesto[i] = this.historialRepuesto[i].getNombreR();
            }
        }else{
            System.out.println("No existe información de Repuesto de los Vehiculos");
        }
        
        return arrayRepuesto;
    }
    
    public float getPrecioRepuesto(String nombreR){
        float resultado = 0;
        
        if (contadorRepuesto==0) {
            resultado = 0;
        }else{
            for (int i = 0; i < contadorRepuesto; i++) {                                            
                if (nombreR.equals(this.historialRepuesto[i].getNombreR())) {
                    resultado = this.historialRepuesto[i].getPrecio();
                }
            }
        }
        
        return resultado;
    }  
}
