/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_bryan_espinal_.pkg12141139;

/**
 *
 * @author bryan
 */
public class Herrero extends Aldeanos {

    public Herrero() {
    }

    public Herrero(String nombre, String apellidos, int edad, int puntos_vid) {
        super(nombre, apellidos, edad, puntos_vid);
    }

    
    
    public int ataque(){
    return 0;
    }

    @Override
    public String toString() {
        return " Herrero " + super.toString();
    }
    
    
}
