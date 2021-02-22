/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

/**
 *
 * @author Mariela Q
 */
public class Factura {
    
    private String numDePieza; //numero de pieza
    private String descPieza; //descuenta de pieza
    private int cantArticulo; //Cantidad del articulo
    private double priceArticulo; //Valor del articulo
    
    
    //Método establecer número de la pieza
    public void establecerNumDePieza (  String pNumDePieza )
    {
     numDePieza = pNumDePieza;
    }
    
    //Método para obtener el número de la pieza
    public String obtenerNumDePieza()
    {
     return numDePieza;
    }      
    
    //Método para establecer la descripción de la  pieza
    public void establecerDescPieza (String pDescPieza)
    {
     descPieza = pDescPieza;
    }
    
    //Método para obtener  la descripción de la pieza
    public String obtenerDescPieza()
    {
      return descPieza;
    }
    
    //Método para establecer la cantidad del articulo
    public void establecerQtyArticulo ( int pQtyArticulo)
    {
     cantArticulo = pQtyArticulo;
    }
    
    //Método para obtener la cantidad de articulo
    public int obtenerQtyArticulo()
    {
     return cantArticulo;
    }
    
    //Método para establecer valor del articulo
    public void establecerVlArticulo (double pVlrArticulo)
    {
     priceArticulo = pVlrArticulo;
    }      
    
    //Método para obtener el valor dela articulo
    public double obtenerVlrArticulo()
    {
     return priceArticulo;
    }        
}
