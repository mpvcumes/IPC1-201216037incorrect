/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;


/**
 *
 * @author myria
 */
public class Pruebas {

     public void generarSerieDeAleatorios () {


//        numAleatorio = new Random ();
        double numAleatorio;
        String cadenaCorrelativo="";

        for (int i=0; i < 5; i++) {

         numAleatorio=  Math.random()*6 ;
         cadenaCorrelativo = (cadenaCorrelativo + String.valueOf(numAleatorio));

         }

            System.out.print ("Serie generada! " + cadenaCorrelativo);

    }
                              
}
