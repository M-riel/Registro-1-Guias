package Guia1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariela Q
 */
public class ExecFac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ettablecerDescPieza
        Factura pedido1 = new Factura ();
        String desc1;
        pedido1.establecerDescPieza("Taladro black and decker de medio caballo de potencia para banco");
        desc1 = pedido1.obtenerDescPieza();
        System.out.println("La descripción de la pieza es:" + desc1);
        
        //Uso de metodo establecerQtyArticulo cantidad de articulo
        
        int cantidad;
        pedido1.establecerQtyArticulo(850);
        cantidad = pedido1.obtenerQtyArticulo();
        System.out.println("La cantidad de articulo es " + cantidad);
        
        //Uo de metodo establecerNumDePieza
        
        String numPieza;
        pedido1.establecerNumDePieza("LA1542SE");
        numPieza = pedido1.obtenerNumDePieza();
        System.out.println("El numero de la pieza es " + numPieza );
        
        //Uso de establecerVlrticulo valer del articulo
        
        double valorArt;
        pedido1.establecerVlArticulo(125);
        valorArt = pedido1.obtenerVlrArticulo();
        System.out.println("El valor del articulo es " + valorArt);
       
        
    }
    
}
