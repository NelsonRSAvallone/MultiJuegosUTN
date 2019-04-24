/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebrorace;



/**
 *
 * @author luciano
 */
public class Reloj extends Thread implements Runnable {
    
    int contador;
    int avanceRelativo;
    boolean activo =true;
    
    
    
    public Reloj(){}
    
    public Reloj(int contador){
    this.contador = contador;
    }
    
    
    
    
    public void resetReloj(){
        contador=10;
    }
            
    public void run(){
        contador =10;
        while(contador>0 && activo == true){
            
                contador--;
                                                                      
                            System.out.println(contador);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {


                            e.printStackTrace();
                        }
                     }
        
                     avanceRelativo = contador;
                   contador=10;
                                    
            }
        
            
       
            
    }

