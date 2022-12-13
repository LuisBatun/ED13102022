/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.util.LinkedHashMap;

/**
 *
 * @author Luis Fernando
 */
public class LinkedHashMap_JC {
    public static boolean exist;
    public static void main(String[] args) {
        //Creamos el LinkedHashMap
        LinkedHashMap<Integer, String> linkhash = new LinkedHashMap<>();
        
        //Agregamos los elementos
        linkhash.put(32, "Adi");
        linkhash.put(87, "Nestor");
        linkhash.put(13, "Evelyn");
        linkhash.put(45, "Alejandra");
        
        //Mostramos los elementos en orden de las keys
        System.out.println(linkhash.values());

        //Obtenemos el tamaño del LinkedHashMap
        System.out.println("El tamaño del HashMap es: " + linkhash.size());

        //Vemos si existe un elemento en el LinkedHashMap
        exist = linkhash.containsValue("Josue");
        System.out.println("¿Existe Josue en el LinkedHashMap?: " + exist);
        
        //Vemos si existe un elemento en el LinkedHashMap
        exist = linkhash.containsValue("Evelyn");
        System.out.println("¿Existe Evelyn en el LinkedHashMap?: " + exist);
        
        //Eliminamos el elemento dependiendo de la llave
        System.out.println("Elminamos el elemento de la key 13");
        linkhash.remove(13);
        
        //Observamos si aun existe Jaime en el LinkedHashMap
        exist = linkhash.containsValue("Evelyn");
        System.out.println("¿Existe Evelyn en el HashMap?: " + exist);
        
        //Revisamos cual sigue siendo el tamaño del LinkedHashMap
        System.out.println("El tamaño del HashMap es: " + linkhash.size());

        //Se imprimen los valores del LinkedHashMap en el orden que se añadieron
        System.out.println(linkhash.values());
    }
}
