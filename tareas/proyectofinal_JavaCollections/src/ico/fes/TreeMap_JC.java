/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.util.TreeMap;

/**
 *
 * @author Luis Fernando
 */
public class TreeMap_JC {
    public static void main(String[] args) {
        int key;
        //Creamos un TreeMap
        TreeMap<Integer, String> tree = new TreeMap<>();
        
        //Agregamos elementos al TreeMap
        tree.put(1, "Uno");
        tree.put(2, "Dos");
        tree.put(3, "Tres");
        tree.put(4, "Cuatro");
        tree.put(5, "Cinco");
        tree.put(6, "Seis");
        tree.put(7, "Siete");
        tree.put(8, "Ocho");
        
        //Los mostramos
        System.out.println(tree.values());
        
        //Vemos si existe un elemento respecto a la key
        System.out.println("¿Existe un elemento en la key 5?: " + tree.containsKey(5));
        
        //Obtenemos el elemento en la key dada
        String value = tree.get(5);
        System.out.println("El elemento en la key 5 es: " + value);
        
        //Devuelve la ultima key
        key = tree.lastKey();
        System.out.println("La ultima key es: " + key);
        
        //Los elementos con sus key son
        System.out.println("Elementos con su key: " + tree.size());   
    }
}
