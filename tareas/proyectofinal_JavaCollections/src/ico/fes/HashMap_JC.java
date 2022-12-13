/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.util.HashMap;

/**
 *
 * @author Luis Fernando
 */

public class HashMap_JC {
    public static boolean exist;
    public static void main(String[] args) {
        //Creamos un HashMap_JC
        HashMap<Integer, String> hash = new HashMap<>();
        
        //Agregamos elementos
        hash.put(32, "Luis");
        hash.put(69, "Eduardo");
        hash.put(19, "Jaime");
        hash.put(45, "Ilikey");
        
        //Mostramos los elementos en orden de las keys
        System.out.println(hash.values());

        //Obtenemos el tamaño del HashMap
        System.out.println("El tamaño del HashMap es: " + hash.size());

        //Vemos si existe un elemento en el HashMap
        exist = hash.containsValue("Luis");
        System.out.println("¿Existe Luis en el HashMap?: " + exist);
        
        //Eliminamos el elemento dependiendo de la llave
        System.out.println("Elminamos el elemento de la key 19");
        hash.remove(19);
        
        //Observamos si aun existe Jaime en el HashMap
        exist = hash.containsValue("Jaime");
        System.out.println("Existe Jaime en el HashMap?: " + exist);
        
        //Revisamos cual sigue siendo el tamaño del HashMap
        System.out.println("El tamaño del HashMap es: " + hash.size());

        //Se imprimen los valores del HashMap
        System.out.println(hash.values());
    }
}
