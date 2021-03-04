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
class Mascota {
    private String nomMasco;
    private int EdadMasco;
    
    public String getNomMasco(){
        return nomMasco;
    }
    
    public void setNumMasco (String nomMasco){
        this.nomMasco = nomMasco;
    }
    
    public int setEdadMasco(){
        return EdadMasco;
    }
    
    public void setEdadMasco (int EdadMasco){
        this.EdadMasco = EdadMasco;
    }
    
      public Mascota (String nomMasco, int EdadMasco){
         super();
         this.nomMasco = nomMasco;
         this.EdadMasco = EdadMasco;
    }
    
    
}
