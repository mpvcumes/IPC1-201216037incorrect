/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Usuario;

/**
 *
 * @author myria
 */
public class BitacoraAseguradora {
    
    Usuario[] historialUsuario = new Usuario[99];
    private int contadorUsuario= 0;
    
    
    
    
    public void anadirUsuario(String Nombres, String Apellidos, float DPI, int Telefono, int Rol){
                                              
        if(contadorUsuario<99) {
            /* Debe validar que no se repita el DPI */ 
            /* Integridad de los datos */
            this.historialUsuario[contadorUsuario] = new Usuario();
            this.historialUsuario[contadorUsuario].setNombres(Nombres);
            this.historialUsuario[contadorUsuario].setApellidos(Apellidos);
            this.historialUsuario[contadorUsuario].setDPI(DPI);
            this.historialUsuario[contadorUsuario].setTelefono(Telefono);
            this.historialUsuario[contadorUsuario].setRol(Rol);
          
            this.contadorUsuario++; 
        }else{
            System.out.println("Bitacora de usuario llena");
        }
    
    }
    
    public boolean validarIngreso(float DPI){
            
        boolean resultado = false;
        int Rol = 0;
        /* Array */
        
        for (int i = 0; i < contadorUsuario; i++) {            
            
            if ( DPI == this.historialUsuario[i].getDPI()) {
            } else {
                resultado = true;                
            }
            
        }
        
        return resultado;
        
    }
    
    
    public void MostrarUsuario(){
        if (contadorUsuario==0) {
            System.out.println("No existen usuarios");
        }else{
            for (int i = 0; i < contadorUsuario; i++) {            
                
                System.out.print("Nombre" + this.historialUsuario[i].getNombres() + " Apellido"  );
            
            }
        }
        
    }
    
    
    /* Metodo donde se reciba el DPI */     
    
    
}
