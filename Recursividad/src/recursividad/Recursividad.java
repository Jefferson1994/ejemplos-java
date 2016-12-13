/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculoFac a = new CalculoFac();
       int q;
       Scanner Escaner = new Scanner (System.in); 
       System.out.println("ingrese numero de factorial");
       q= Escaner.nextInt();
       a.mostrarfac(q);
    }
    
}
