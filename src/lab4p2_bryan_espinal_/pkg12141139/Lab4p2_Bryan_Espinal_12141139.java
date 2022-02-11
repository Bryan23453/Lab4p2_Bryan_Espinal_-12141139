/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_bryan_espinal_.pkg12141139;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author bryan
 */
public class Lab4p2_Bryan_Espinal_12141139 {
    static ArrayList <Familias> familia = new ArrayList();
    static Scanner lea=new Scanner(System.in);
    public static void main(String[] args) {
        familia.add(new Familias("Montesco"));
        supergranjero h =new supergranjero("Romeo","Montesco",20,1000);
        familia.get(0).setAldeanos(h);
        Herrero q =new Herrero("paco","Montesco",20,500);
        familia.get(0).setAldeanos(q);
        agronomo agro =new agronomo("ciel","Montesco",20,500);
        familia.get(0).setAldeanos(agro);
        boolean a=true;
        while(a==true){
            System.out.println("0. Salir"
                    + "\n1. Crear Familia"
                    + "\n2. Crear Aldeano"
                    + "\n3. Imprimir Familias"
                    + "\n4. Pelear");
            System.out.print("Ingrese Opcion: ");
            int op =lea.nextInt();
            switch(op){
                case 0:{
                a=false;
                }
                break;
                case 1:{
                    System.out.println("Ingrese Nombre de la familia");
                    String nom=lea.nextLine();
                    nom=lea.nextLine();
                    familia.add(new Familias(nom));
                }
                break;
                case 2:{
                    int pos,passs=0;
                    System.out.print("Ingrese Nombre: ");
                    String nom=lea.nextLine();
                    nom=lea.nextLine();
                    String ape="";
                    for (int i = 0; i < familia.size(); i++) {
                        if (i==0) {
                            System.out.print("Ingrese Apellido: ");
                            ape=lea.nextLine();
                        }
                        if (ape.equals(familia.get(i).getApellido()) ) {
                            pos=i;
                            i=familia.size();
                            System.out.print("Ingrese Edad: ");
                            int edad=lea.nextInt();
                            System.out.print("Ingrese Puntos De Vida: ");
                            int vida=lea.nextInt();
                            System.out.println("1. Normales"
                                    + "\n2. Pacifista"
                                    + "\n3. Herrero"
                                    + "\n4. Agrónomo"
                                    + "\n5. Explosivo");
                            System.out.print("Ingrese Ocupacion: ");
                            int opss=lea.nextInt();
                            switch (opss){
                            case 1:{
                                familia.get(pos).setAldeanos(new normales(nom, ape, edad, vida));
                            }
                            break;
                            case 2:{
                                familia.get(pos).setAldeanos(new pacifista(nom, ape, edad, vida));
                            }
                            break;
                            case 3:{
                                familia.get(pos).setAldeanos(new Herrero(nom, ape, edad, vida+vida/2));
                            }
                            break;
                            case 4:{
                                familia.get(pos).setAldeanos(new agronomo(nom, ape, edad, vida));
                            }
                            break;
                            case 5:{
                                familia.get(pos).setAldeanos(new explosivo(nom, ape, edad, vida));
                            }
                            break;
                            }
                        }else{
                            passs++;
                        }
                        if (passs==familia.size()) {
                            System.out.println();
                            System.out.println("No se encontro Esa Familia");
                            System.out.println();
                        }
                        
                    }
                    
                    
                }
                break;
                case 3:{
                for (int i = 0; i < familia.size(); i++) {
                    int nume = i + 1;
                    System.out.println("Familia " + nume + ":" + familia.get(i));
                    }
                    System.out.println();
                }
                break;
                case 4:{
                
                }
                break;
                default:{
                    System.out.println("Opcion invalida");
                }
                break;
            }
        }
            
    }
    
}
