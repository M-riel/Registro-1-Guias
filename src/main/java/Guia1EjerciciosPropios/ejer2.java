/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1EjerciciosPropios;
import java.util.Scanner;

/**
 *
 * @author Mariela Q
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Inicio del Programa");
        System.out.println ("Encontrar el volumen de un cilindro");
               
        int numero1;
        int numero2;
        int radio;
        int volumen;
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println ("Introduzca el diametro en metros:");
        numero1 = entradaEscaner.nextInt();
        System.out.println ("Introduzca la altura en metros:");
        numero2 = entradaEscaner.nextInt();
        
        radio = numero1 / 2;
        volumen = 3*(radio*radio)*numero2; 
        
        
        System.out.println("el volumen del cilindro es de:" + volumen);
    }
    
}
