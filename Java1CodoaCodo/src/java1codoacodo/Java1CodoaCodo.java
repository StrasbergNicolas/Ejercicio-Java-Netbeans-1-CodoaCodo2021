/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1codoacodo;
import java.util.Scanner;
/**
 *
 * @author niaco
 */
public class Java1CodoaCodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
   Scanner sc = new Scanner(System.in);
   System.out.println("Ingresa tu nombre");     
   String nombre = sc.nextLine();
     
   Scanner sc1 = new Scanner(System.in);
   System.out.println("Ingresa tu apellido");     
   String apellido = sc1.nextLine();
 
   Scanner sc2 = new Scanner(System.in);
   System.out.println("Ingresa tu edad");     
   String edad = sc2.nextLine();
   
   Scanner sc3 = new Scanner(System.in);
   System.out.println("Cual es tu hobbie?");     
   String hobbie = sc3.nextLine();
   
   Scanner sc4 = new Scanner(System.in);
   System.out.println("Cuál es tu editor de código preferido");     
   String ecp = sc4.nextLine();
   
    Scanner sc5 = new Scanner(System.in);
    System.out.println("Que sistema operativo utilizas?");     
    String so = sc5.nextLine();
   
   
   System.out.println("Tu nombre es " + nombre);   
   System.out.println("Tu apellido es " + apellido);   
   System.out.println("Tenés " + edad);   
   System.out.println("Tu hobbie es " + hobbie);   
   System.out.println("Tu editor de código preferido es " + ecp);   
   System.out.println("Utilizas " + so);   


    }
    
}
