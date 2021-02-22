/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

/**
 *
 * @author Mariela Q
 */
public class MainClaseElección {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
//El nombre del animal es "Zorro"
        ClaseDeElección Animal = new ClaseDeElección("Zorro");
//Edad del animal
        Animal.setEdad(2);
        
        System.out.println("El nombre del animal es: " + Animal.getNombre());
        System.out.println(" y tiene " + Animal.getEdad() + " años de edad.");
       
    }
}

