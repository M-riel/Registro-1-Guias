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
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Inicio del Programa");
                
        int numero1;
        int numero2;
        int resultado;
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("Introducir el valor de tu salario neto en el mes:");
        numero1 = entradaEscaner.nextInt();
        System.out.println("Introducir el valor de los descuentos a tu salario en el mes:");
        numero2 = entradaEscaner.nextInt();
        resultado = numero1 - numero2;
        
        System.out.println("Contando los descuentos, tu salario es:" + resultado);
    }
    
}
