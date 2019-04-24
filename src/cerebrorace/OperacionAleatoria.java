/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebrorace;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class OperacionAleatoria {
    
    public static int  a;
    public static int  b;
    public static int  resultado;
    public static char letra;


    public OperacionAleatoria(){}

           
    public static int Operacion(){
        a =  (int)  Math.random()*100;
        b =  (int)  Math.random()*100;
        resultado = a + b;
        return resultado;
    }
    
    public static boolean comparacion (int resultado, int respuesta){
        boolean correccion;
        if(respuesta == resultado){
           correccion = true; 
        } else{correccion = false;}
     return correccion;
    }
    public int getResultado(){
        return resultado;
    }

}