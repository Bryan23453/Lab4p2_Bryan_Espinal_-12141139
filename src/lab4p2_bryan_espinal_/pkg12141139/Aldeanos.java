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
public abstract class Aldeanos {
    String nombre;
    String apellidos;
    int edad;
    int puntos_vid;
    
    public Aldeanos() {
    }

    public Aldeanos(String nombre, String apellidos, int edad, int puntos_vid) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.puntos_vid = puntos_vid;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntos_vid() {
        return puntos_vid;
    }

    public void setPuntos_vid(int puntos_vid) {
        this.puntos_vid = puntos_vid;
    }
    
    @Override
    public String toString() {
        return "Aldeanos{" + "nombre=" + nombre + ", apellido=" + apellidos + '}';
    }
    
    public abstract int ataque();
    
    
}
