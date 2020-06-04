/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojat1;

import java.util.Scanner;
/**
 *
 * @author myria
 */
public class HojaT1 {
    String eleccion;
    static int  contadorA,contadorB, contadorC =0;
    
    public static void crearSeccionNueva(){
            System.out.println("Ya no hay cupo. Por favor cree otra sección");
            System.out.println("1. Crear otra sección");
            System.out.println("2. Salir del sistema");
            Scanner seccionNueva = new Scanner(System.in); 
            String crearSeccion = seccionNueva.nextLine();
            Integer numeroElejido = Integer.parseInt(crearSeccion);
            
            if (numeroElejido ==1){
                System.out.println("Sección C creada exitosamente"); 
                System.out.println("Exitosamente asignado a la sección C");
                contadorC++;
            }
    }

    
    public static void cupoSeccion(int numeroElejidoo){
        
        if (numeroElejidoo ==1 && contadorA<=15 ){
            contadorA++;
            System.out.println("Exitosamente asignado a la seccion A!");
        }else if(numeroElejidoo ==2 && contadorA<=15){
            contadorB++;
            System.out.println("Exitosamente asignado a la seccion B!");
        }else {
            crearSeccionNueva();

        }
    }
    
    public static void main(String[] args) {
        Scanner seccion = new Scanner(System.in); 
        System.out.println("Bienvenido, actualmente hay dos secciones. Ingrese el número de la sección que desea");
        System.out.println("1. Sección A");
        System.out.println("2. Sección B");
       
        String eleccion = seccion.nextLine();
        Integer numeroElejido = Integer.parseInt(eleccion);
        System.out.println(numeroElejido);
        
        
        cupoSeccion(numeroElejido);
       
        
// Create a Scanner object
    
    }
    
}
