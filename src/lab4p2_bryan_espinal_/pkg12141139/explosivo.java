/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_bryan_espinal_.pkg12141139;

import java.util.Random;

/**
 *
 * @author bryan
 */
public  class explosivo extends Aldeanos{
    public double ataque(Aldeanos persona){
        Random r=new Random();
        int ran=1+r.nextInt(100);
        if (ran<=15) {
            return 0;
        }else{
            if (persona instanceof Herrero) {
                return 250+250*0.05;
            }
            if (persona instanceof agronomo) {
                return 250+250*0.10;
            }else{
                return 250;
            }
        }
        
    }

    public explosivo(String nombre, String apellidos, int edad, int puntos_vid) {
        super(nombre, apellidos, edad, puntos_vid);
    }

    @Override
    public String toString() {
        return " explosivo" + super.toString();
    }
    
}
