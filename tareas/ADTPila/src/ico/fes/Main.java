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
    public static void main(String[] args) throws Exception{
        Stack<Integer> pila = new Stack<>();
        System.out.println("¿Esta vacía?: " + pila.isEmpty());
        System.out.println("Tamaño: " + pila.length());
        System.out.println("Metemos 4,53,36" );
        pila.push(4);
        pila.push(53);
        pila.push(36);
        System.out.println(pila);
        System.out.println("Aplicando peek (para ver el ultimo dato sin sacarlo): " + pila.peek());
        System.out.println(pila);
        System.out.println("Aplicando pop (para sacar el ultimo dato): " + pila.pop());
        System.out.println(pila);
        System.out.println("Aplicando pop (para sacar el siguiente dato): " + pila.pop());
        System.out.println(pila);
        System.out.println("Metemos un 89 y 75: ");
        pila.push(89);
        pila.push(75);
        System.out.println(pila);
    }
}
