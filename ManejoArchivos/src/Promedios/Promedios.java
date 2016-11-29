/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promedios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Promedios {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("Calificaciones2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        int b = 0;
        double q = 0;
        double mayor=0;

        double[] prome = new double[5];
        try // lee registros del archivo, usando el objeto Scanner
        {
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                double a = 0;
                double c = 0;
                double c2;
                int e=0;
                
                

                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                //System.out.println(linea_partes);
                
                for (int i = 0; i < linea_partes.size(); i++) {
                    
                    if (i >= 2) {
                        a = a + Integer.parseInt(linea_partes.get(i));
                        c = a / 2;
                        if(c>mayor){
                            mayor=c;
                        }
                        
//                        System.out.print("valor de e :"+e);
                    }
                    
                    

                }
                System.out.printf("promedio de calificaiones de %s  es %.2f \n", linea_partes, c);
                
//                for (int m=0; m<prome.length;m++){
//                    System.out.println("prone" + prome[m]);
//                }
             

            }
            System.out.println("el promedio mayor es  "+ mayor);
            // fin de while
         }catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
            catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
            // fin de catch
        } // fin del metodo leerRegistros
        // cierra el archivo y termina la aplicación

    

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo

    public void sumar() {

    }
} // fin de la clase LeerArchivoTexto

