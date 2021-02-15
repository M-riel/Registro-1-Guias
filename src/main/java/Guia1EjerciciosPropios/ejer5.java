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
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("Inicio del programa");
        System.out.println("Introducir los datos del empleado:");
        
        String nombre = ""; 
        String salario = ""; 
        String descuento = "";
        
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println("Introducir el nombre del Empleado");
        nombre = entradaEscaner.nextLine ();
        
        System.out.println("Introducir el salario del empleado");
        salario = entradaEscaner.nextLine ();
        
        System.out.println("Introducir el descuento del salario del empleado");
        descuento = entradaEscaner.nextLine ();
        
        
        System.out.println("Nombre: " + nombre + ", salario: " + salario + ", descuento del salario: " + descuento);
    
    }
    
}
