/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

/**
 *
 * @author Mariela Q
 */
public class Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Serpiente serpiente = new Serpiente ("Nagin","Escamitas", 8, "Greendy");
        Liebre liebre = new Liebre ("Pelusa", "Especial", 7,"Siames");
        
        System.out.println("...............................................");
        serpiente.mostrar();
        System.out.println("...............................................");
        liebre.mostrar();
        System.out.println("...............................................");
        
    }
    
}