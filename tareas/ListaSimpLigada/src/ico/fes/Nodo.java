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
public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;

    public Nodo(){
    }
    
    public Nodo(T valor){
        this.dato = valor;
    }

    public Nodo(T valor, Nodo<T> siguiente) {
        this.dato = valor;
        this.siguiente = siguiente;
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }
    
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString() {
        return "|" + dato + "| -->";
    }
}
