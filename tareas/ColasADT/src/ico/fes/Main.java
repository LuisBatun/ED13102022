/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Luis Fernando
 */
public class Main {
    public static void main(String[] args) {
        Colas<Integer> cola = new Colas<>();
        System.out.println("¿Esta vacía?: " + cola.is_empty());
        System.out.println("Agregamos 52");
        cola.enqueue(52);
        System.out.println("Agregamos 33");
        cola.enqueue(33);
        System.out.println("Agregamos 87");
        cola.enqueue(87);
        System.out.println("¿Esta vacia?: " + cola.is_empty());
        System.out.println("Imprimimos la cola: ");
        System.out.println(cola);
        System.out.println("Tamaño: " + cola.length());
        System.out.println("Dato de enfrente: " + cola.front());
        System.out.println("Eliminamos el 52");
        cola.dequeue();
        System.out.println("Imprimimos la cola: ");
        System.out.println(cola);
    }
}
