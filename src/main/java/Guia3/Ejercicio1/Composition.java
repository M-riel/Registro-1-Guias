/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.Ejercicio1;

/**
 *
 * @author Mariela Q
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota li = new Mascota ("Sirius",1);
        Mascota L2 = new Mascota ("Remus",2);
        DueñodeMascota p= new DueñodeMascota ("James",11);
        p.setNombre(li);
        Veterinaria t= new Veterinaria();
        t.setNombreDeVet(L2);
        t.setdireccion(li);
        
        System.out.println(p.getNumeroDeTelefono());
        System.out.println(t.getdireccion());
        
    }
    
}
