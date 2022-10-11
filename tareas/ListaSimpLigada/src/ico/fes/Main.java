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
        LinkedList<Integer> listaLigada = new LinkedList<>();
        System.out.println(listaLigada);
        
        System.out.println("Lista vacía?");
        System.out.println(listaLigada.estaVacia());
        System.out.println("");
        
        System.out.println("Tamaño:");
        System.out.println(listaLigada.getTamanio());
        System.out.println("");
        
        System.out.println("Agregando numeros:");
        System.out.println("Al inicio:");
        listaLigada.agregarInicio(34);
        System.out.println(listaLigada);
        System.out.println("Agregar 65 después del 34:");
        listaLigada.agregarDespues(34, 65);
        System.out.println(listaLigada);
        System.out.println("Agregar al final");
        listaLigada.agregarFinal(56);
        System.out.println(listaLigada);
        System.out.println("Agregar 12 después del 56:");
        listaLigada.agregarDespues(56, 12);
        System.out.println(listaLigada);
        
        System.out.println("Eliminar posición 1 (65): ");
        listaLigada.eliminar(1);
        System.out.println(listaLigada);
        System.out.println("Eliminar al inicio (34): ");
        listaLigada.eliminarPrimero();
        System.out.println(listaLigada);
        System.out.println("Eliminar al ultimo (12): ");
        listaLigada.eliminarUltimo();
        System.out.println(listaLigada);
        System.out.println("");
        
        System.out.println("Agregamos un 18 al final:");
        listaLigada.agregarFinal(18);
        System.out.println(listaLigada);
        System.out.println("");
        
        System.out.println("Buscamos un valor (18):");
        System.out.println("Posición: " + listaLigada.buscar(18));
        System.out.println("");
        
        System.out.println("Actualizando el 18 a 24");
        listaLigada.actualizar(18, 24);
        System.out.println(listaLigada);
    }
}
