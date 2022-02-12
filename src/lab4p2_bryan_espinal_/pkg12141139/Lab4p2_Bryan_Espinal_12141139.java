/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_bryan_espinal_.pkg12141139;

import java.util.ArrayList;
import java.util.Collections;
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
        Herrero q =new Herrero("paco","Montesco",20,500,350);
        familia.get(0).setAldeanos(q);
        agronomo agro =new agronomo("ciel","Montesco",25,500);
        familia.get(0).setAldeanos(agro);
        familia.add(new Familias("Capuleto"));
        normales nor =new normales("Julieta","Capuleto",20,1);
        familia.get(1).setAldeanos(nor);
        normales nor2 =new normales("palermo","Capuleto",20,453);
        familia.get(1).setAldeanos(nor2);
        familia.add(new Familias("capiletos"));
        agronomo agroo =new agronomo("pico","capiletos",20,300);
        familia.get(2).setAldeanos(agroo);
        normales agroooo =new normales("concordia","capiletos",20,450);
        familia.get(2).setAldeanos(agroooo);
        boolean a=true;
        if ((familia.size()==2 && familia.get(1).getAldeanos().size()==1) ) {
            System.out.println(" Gano ");
            a=false;
        }
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
                    String nom="";
                    int pas=0;
                    for (int i = 0; i < familia.size(); i++) {
                        if (i==0) {
                            System.out.println("Ingrese Nombre de la familia");
                            nom=lea.nextLine();
                            nom=lea.nextLine();
                        }
                        if (nom.equals(familia.get(i).getApellido()) ) {
                            pas++;
                        }
                    }
                    if (pas==1) {
                        System.out.println("esa familia ya existe");
                    }else{
                        familia.add(new Familias(nom));
                    }
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
                                System.out.print("Ingrese daño: ");
                                int dano=lea.nextInt();
                                familia.get(pos).setAldeanos(new Herrero(nom, ape, edad, vida+vida/2,dano));
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
                    int pos=0,passs=0;
                    String nombre="";
                    boolean ae=true;
                            for (int i = 0; i < familia.size(); i++) {
                                if (i==0) {
                                    System.out.println("Ingrese nombre de la Familia con La Que Se Pelearan La Familia montesco");
                                    nombre=lea.nextLine();
                                    nombre=lea.nextLine();
                                }
                                if (nombre.equals(familia.get(i).getApellido()) ) {
                                    pos=i;
                                    i=familia.size();
                                }else{
                                    passs++;
                                }
                                if (passs==familia.size()) {
                                    System.out.println();
                                    System.out.println("No se encontro Esa Familia");
                                    System.out.println();
                                    ae=false;
                                }
                            }
                            if (familia.get(pos).Aldeanos.size()<2) {
                                System.out.println("La Familia No Cuenta Con Miempros Suficientes");
                            }else{
                                if (pos==1) {
                                   int ie=0;
                                   Familias fam1=(Familias)familia.get(0);
                                   Familias fam2 =(Familias)familia.get(pos);
                                   Collections.shuffle( fam1.getAldeanos() );
                                   Collections.shuffle( fam2.getAldeanos() );
                                    int vida1=1;
                                    int vida2=1;
                                   while(fam2.getAldeanos().size()>1 && fam1.getAldeanos().size()>1){
                                       if (fam1.getAldeanos().size()!=0 && fam2.getAldeanos().size()!=1 ) {
                                           vida1=fam1.getAldeanos().get(ie).puntos_vid;
                                           vida2=fam2.getAldeanos().get(1).puntos_vid;
                                       }
                                       while(vida1>0&&vida2>0){
                                           double ra=fam1.getAldeanos().get(ie).ataque(fam2.getAldeanos().get(1));
                                           System.out.println(fam1.getAldeanos().get(ie).getNombre()+" Ataco A "+fam2.getAldeanos().get(1).getNombre()+" Haciendole "+fam1.getAldeanos().get(ie).ataque(fam2.getAldeanos().get(1))+" pto de daño y dejandolo a "+(vida2-ra));
                                           vida2=(int) (vida2-ra);
                                           if (vida2<=0) {
                                               break;
                                           }
                                           ra=fam2.getAldeanos().get(1).ataque(fam2.getAldeanos().get(1));
                                           System.out.println(fam2.getAldeanos().get(1).getNombre()+" Ataco A "+fam1.getAldeanos().get(ie).getNombre()+" Haciendole "+fam2.getAldeanos().get(1).ataque(fam1.getAldeanos().get(ie))+" pto de daño y dejandolo a "+(vida1-ra));
                                           vida1=(int) (vida1-ra);
                                           //
                                       }
                                       if (vida1<=0) {
                                           if (fam1.getAldeanos().size()!=0) {
                                               System.out.println("A muerto "+fam1.getAldeanos().get(ie).getNombre());
                                               fam1.getAldeanos().remove(ie);
                                           }
                                       }else{
                                           if(vida2<=0){
                                               if (fam2.getAldeanos().size()!=1) {
                                                   System.out.println("A muerto "+fam2.getAldeanos().get(1).getNombre());
                                                   fam2.getAldeanos().remove(1);
                                               }
                                           }
                                       }
                                   }
                                       if(fam1.getAldeanos().size()==0){
                                           familia.remove(0);
                                           System.out.println("Fin De Juego Murio Romeo ");
                                           a=false;
                                       }

                                   }else{
                                       if (ae==true) {
                                       int ie=0;
                                       Familias fam1=(Familias)familia.get(0);
                                       Familias fam2 =(Familias)familia.get(pos);
                                       Collections.shuffle( fam1.getAldeanos() );
                                       Collections.shuffle( fam2.getAldeanos() );
                                        int vida1=1;
                                        int vida2=1;
                                       while(fam2.getAldeanos().size()>0 && fam1.getAldeanos().size()>0){
                                           if (fam1.getAldeanos().size()!=0 && fam2.getAldeanos().size()!=0 ) {
                                               vida1=fam1.getAldeanos().get(ie).puntos_vid;
                                               vida2=fam2.getAldeanos().get(ie).puntos_vid;
                                           }
                                           while(vida1>0&&vida2>0){
                                               double ra=fam1.getAldeanos().get(ie).ataque(fam2.getAldeanos().get(ie));
                                               System.out.println(fam1.getAldeanos().get(ie).getNombre()+" Ataco A "+fam2.getAldeanos().get(ie).getNombre()+" Haciendole "+fam1.getAldeanos().get(ie).ataque(fam2.getAldeanos().get(ie))+" pto de daño y dejandolo a "+(vida2-ra));
                                               vida2=(int) (vida2-ra);
                                               if (vida2<=0) {
                                                   break;
                                               }
                                               ra=fam2.getAldeanos().get(ie).ataque(fam2.getAldeanos().get(ie));
                                               System.out.println(fam2.getAldeanos().get(ie).getNombre()+" Ataco A "+fam1.getAldeanos().get(ie).getNombre()+" Haciendole "+fam2.getAldeanos().get(ie).ataque(fam1.getAldeanos().get(ie))+" pto de daño y dejandolo a "+(vida1-ra));
                                               vida1=(int) (vida1-ra);
                                               //
                                           }
                                           if (vida1<=0) {
                                               if (fam1.getAldeanos().size()!=0) {
                                                   System.out.println("A muerto "+fam1.getAldeanos().get(ie).getNombre());
                                                   fam1.getAldeanos().remove(ie);
                                               }
                                           }else{
                                               if(vida2<=0){
                                                   if (fam2.getAldeanos().size()!=0) {
                                                       System.out.println("A muerto "+fam2.getAldeanos().get(ie).getNombre());
                                                       fam2.getAldeanos().remove(ie);
                                                   }
                                               }
                                           }
                                       }
                                       if (fam2.getAldeanos().size()==0) {
                                           familia.remove(pos);
                                       }else{
                                       if(fam1.getAldeanos().size()==0){
                                           familia.remove(0);
                                           System.out.println("Fin De Juego Murio Romeo ");
                                           a=false;
                                       }
                                       }
                                   }
                               }
                            }
                           
                            
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
