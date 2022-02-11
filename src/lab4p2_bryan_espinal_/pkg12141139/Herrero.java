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
    int dano;
    public Herrero() {
    }

    public Herrero(String nombre, String apellidos, int edad, int puntos_vid,int dano) {
        super(nombre, apellidos, edad, puntos_vid);
        this.dano=dano;
    }

    
    
    public double ataque(Aldeanos persona){
        if (persona instanceof agronomo) {
            return dano+dano*0.1;
        }
        if (persona instanceof pacifista) {
            return dano+dano*0.05;
        }else{
            return dano;
        }
    }

    @Override
    public String toString() {
        return " Herrero " + super.toString();
    }
    
    
}
