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
public class Ejer4
{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Inicio del Programa");
        System.out.println("Introducir dos números enteros por favor:");
        
        int numero1;
        int numero2;
        int resultado;
        Scanner entradaEscaner = new Scanner (System.in);
        
        numero1 = entradaEscaner.nextInt();
        numero2 = entradaEscaner.nextInt();
        resultado = numero1 + numero2;
        System.out.println("La sumatoria de los numeros ingresadas por teclado es:" + resultado);
    }
    
}
