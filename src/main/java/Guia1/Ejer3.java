/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;
import java.util.Scanner;
/**
 *
 * @author Mariela Q
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Inicio del programa");
        System.out.println("Introducir una cadena de texto por favor:");
        String entradaTeclado = ""; //se inician las variables vacias
        
        Scanner entradaEscaner = new Scanner (System.in);
        
        entradaTeclado = entradaEscaner.nextLine ();
        
        System.out.println("Lo que se escribio por teclado es \"" + entradaTeclado + "\"");
    }
    
}
