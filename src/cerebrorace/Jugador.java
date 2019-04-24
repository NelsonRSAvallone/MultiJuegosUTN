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
public class Jugador {
    
    
    public static int cantJugadores;
    public static Jugador[] vector = new Jugador[3];
    public static int avance;
    public static String nombre;
    
    public Jugador(){}
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    public Jugador(String nombre, int avance){
    this.nombre = nombre;
    this.avance = avance;
    }
    
    
    
    
}
