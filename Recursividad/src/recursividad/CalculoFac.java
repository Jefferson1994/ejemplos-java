/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;
/**
 *
 * @author SALAS
 */
public class CalculoFac {
    
    public double factorial(double numero){
        if(numero<=1){
            return 1;
        }else{
            return numero * factorial(numero-1);
        }
    }
    
    public int mostrarfac(int r){
        
        for(int con=0;con<=r;con++){
            System.out.printf("%d = %.0f\n",con,factorial(con));
        }
    return 0;
    }
    
    
}
