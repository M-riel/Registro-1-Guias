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
public class DueñodeMascota {
    private String Nombre;
    private int NumeroDeTelefono;
    private Mascota mascota;
    
    private Mascota getMascota(){
        return mascota;
    }
    
    private void setMascota (Mascota mascota){
        this.mascota = mascota;
    }
    
    public String getNombre (){
        return Nombre;
    }
    public void setNombre (String Nombre){
        this.Nombre = Nombre;
    }
    
    public int getNumeroDeTelefono(){
    return NumeroDeTelefono;
}
    public void setNumeroDeTelefono (int NumeroDeTelefono){
        this.NumeroDeTelefono = NumeroDeTelefono;
    }
   
   public DueñodeMascota (String Nombre, int NumeroDetelefono){
         super();
         this.Nombre = Nombre;
         this.NumeroDeTelefono = NumeroDetelefono;
    }

    void setNombre(Mascota li) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
