/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;
import java.util.HashSet;
/**
 *
 * @author Mariela Q
 */
public class HashSetExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
HashSet<String> hset = new HashSet<>();         
         //Agregar los elementos al HashSet
         hset.add("Adidas");
         hset.add("Vana");
         hset.add("Orange");
         hset.add("Zegna");
         
         //Agregamos dos elementos dublicados
         hset.add("Adidas");
         hset.add("Reef");
         
         //Agregams elementos nulos
         hset.add(null);
         hset.add(null);
         
         //Creamos tres objetos HashSet
         
         //Obejto 1 - mas marcas de ropa
         hset.add("Gucci");
         hset.add("Prada");
         hset.add("Orange"); //Repetimos
         hset.add("Nike");
         hset.add("Forever21");
         hset.add("VictoriaSecret");
         hset.add("Vans");
         hset.add("Firenze");
         hset.add("Chanel");
         hset.add("Armani");
         hset.add("Versace");
         hset.add("Fendi");
         hset.add("Dior");
         hset.add("Marc Jacobs");
         hset.add("Mango");
         hset.add("Valentino");
         
         //Objeto 2 - Restaurantes
         hset.add("McDOnalds");
         hset.add("ChinaWok");
         hset.add("Wendy´s");
         hset.add("BurguerKing");
         hset.add("PizzaHut");
         hset.add("PolloReal");
         hset.add("PolloCampero");
         hset.add("PapaJhons");
         hset.add("CrepeLovers");
         hset.add("OliveGarden");
         hset.add("GoGreen");
         hset.add("Mocafé");
         hset.add("CoffeCup");
         hset.add("Starbucks");
         hset.add("KFC");
         hset.add("BufaloWings");
         
         //Objeto 3 - Tipos de Zapatos
         hset.add("Botín");
         hset.add("Bailarinas");
         hset.add("De Tacón");
         hset.add("Deportivo");
         hset.add("Botas");
         hset.add("Botas de Agua");
         hset.add("Mocasín");
         hset.add("Pantufla");
         hset.add("Náutico");
         hset.add("Zapato de plataforma");
         hset.add("Manoletina");
         hset.add("Huarache");
         hset.add("Babucha");
         hset.add("Albarca");
         hset.add("Alpargata");
         hset.add("Sandalia");
         
         
         //Mostramos por consola el resultado
         System.out.println(hset);
    }
    
}
