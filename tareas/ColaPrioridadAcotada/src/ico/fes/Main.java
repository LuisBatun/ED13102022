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
        BoundedPriorityQueue<String> queue = new BoundedPriorityQueue<String>(7);
        /*1, Niñas
        2, Niños, 3ra edad
        3, Mujeres, Hombres
        4, Maestro, Mecanico, Vigia, Timonel
        5, Capitan, salvavidas
        */
        queue.enqueue(5, "Capitan");
        queue.enqueue(4, "Maestra");
        queue.enqueue(3, "Mujeres");
        queue.enqueue(4, "Mecanico");
        queue.enqueue(3, "Hombres");
        queue.enqueue(4, "Vigia");
        queue.enqueue(2, "Niños");
        queue.enqueue(4, "Timonel");
        queue.enqueue(2, "3ra edad");
        queue.enqueue(1, "Niñas");
        queue.enqueue(5, "Salvavidas");
        System.out.println(queue);
    }
}
