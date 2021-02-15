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
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println ("Inicio del Programa");
         System.out.println ("El precio medio de un producto, calculado a partir del precio del mismo en tres establecimientos distintos");
         
        int num1;
        int num2;
        int num3;
        
        int res;
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("Introduzca el precio del producto en el establecimiento número 1, dolares:");
        num1 = entradaEscaner.nextInt();
        System.out.println("Introduzca el precio del producto en el establecimiento número 2, dolares:");
        num2 = entradaEscaner.nextInt();
        System.out.println("Introduzca el precio del producto en el establecimiento número 3, dolares:");
        num3 = entradaEscaner.nextInt();
        
        res= (num1 + num2 + num3)/3 ;
        
        System.out.println("El precio medio del producto es: " + res + " dolares");
    }
    
}
