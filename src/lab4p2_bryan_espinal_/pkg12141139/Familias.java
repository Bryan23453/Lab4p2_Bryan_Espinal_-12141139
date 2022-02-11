/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_bryan_espinal_.pkg12141139;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Familias {
    ArrayList <Aldeanos> Aldeanos = new ArrayList();
    String apellido;
    public Familias() {
    }

    public Familias(String apellido) {
        this.apellido = apellido;
    }
    
    public ArrayList<Aldeanos> getAldeanos() {
        return Aldeanos;
    }

    public void setAldeanos(Aldeanos a) {
        this.Aldeanos.add(a);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString() {
        return ", apellido= " + apellido + " Aldeanos= " + Aldeanos ;
    }
    
}
