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
public class Lab4p2_Bryan_Espinal_12141139 {
    static ArrayList <Familias> familia = new ArrayList();
    
    public static void main(String[] args) {
        familia.add(new Familias("Montesco"));
        supergranjero h =new supergranjero("Romeo","Montesco",20,1000);
        familia.get(0).setAldeanos(h);
            for (int i = 0; i < familia.size(); i++) {
               int nume = i + 1;
               System.out.println("Familia " + nume + ":" + familia.get(i));
            }
    }
    
}
