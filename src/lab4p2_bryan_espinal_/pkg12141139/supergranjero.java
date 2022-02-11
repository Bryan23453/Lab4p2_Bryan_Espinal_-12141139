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
public  class supergranjero extends Aldeanos{
    public int ataque(){
    return 1000;
    }

    public supergranjero() {
    }

    public supergranjero(String nombre, String apellidos, int edad, int puntos_vid) {
        super(nombre, apellidos, edad, puntos_vid);
    }

    @Override
    public String toString() {
        return"SuperGranjero"+ super.toString();
        
    }
    
}
