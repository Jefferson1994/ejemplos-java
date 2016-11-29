/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.gfj
 */
package Escritura3;

import java.io.FileNotFoundException;

/**
 *
 * @author SALAS
 */
public class Ejecutor {
     public static void main( String args[] ) throws FileNotFoundException
   {
       
       Calificaiones a = new Calificaiones();
       a.abrir_archivo();
       a.agregar_informacion();
       a.cerrar_archivo();
   }
    
    
}
