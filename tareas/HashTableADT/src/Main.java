/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Fernando
 */
public class Main {
    public static void main(String[] args) {
        HashTableADT<Integer, String> hash = new HashTableADT<>(13);
        System.out.println("Añadimos [236, José], [526, A], [313, B], [29, C], [187, D]");
        hash.add(236, "José");
        hash.add(526, "A");
        hash.add(313, "B");
        hash.add(29, "C");
        hash.add(187, "D");
        hash.add(435, "E");
        
        System.out.println("Aplicamos la key 236");
        System.out.println(hash.valueOf(236));
        System.out.println("Aplicamos la key 29");
        System.out.println(hash.valueOf(29));
        System.out.println("Aplicamos la key 435");
        System.out.println(hash.valueOf(435));
        
        System.out.println("Removemos el contenido de la key 236");
        hash.remove(236);
        System.out.println(hash.valueOf(236));
        
        System.out.println("Añadimos de nuevo algo con la key 236, llamado Luis");
        hash.add(236, "Luis");
        System.out.println(hash.valueOf(236));
    }
    
}
