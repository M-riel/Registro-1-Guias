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
public class Veterinaria {
    
    private String direccion;
    private String NombreDeVet;
    
    private Mascota mascota;
    
      public Veterinaria (String direccion, String NombreDeVet){
         super();
         this.direccion = direccion;
         this.NombreDeVet = NombreDeVet;
    }

    Veterinaria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String setdireccion (){
        return direccion;
    }
    
    public void getdireccion (String direccion){
        this.direccion = direccion;
    }
    
    public String setNombreDeVet (){
        return NombreDeVet;
    }
    public void getNombreDeVet (String NombreDeVet){
        this.NombreDeVet = NombreDeVet;
    }

    void setNombreDeVet(Mascota L2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getdireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setdireccion(Mascota li) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
           
}
