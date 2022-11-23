/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Luis Fernando
 * @param <T>
 */

//Usamos la misma clase de la tarea "Colas"
public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T elem) {
        this.data = elem;
    }

    public Node(T elem, Node<T> next) {
        this.data = elem;
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "<--|" + data + "|";
    }
    
    
}
