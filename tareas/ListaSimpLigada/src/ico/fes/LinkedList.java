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
public class LinkedList<T> {
    private Nodo<T> head;
    int tamanio;

    public LinkedList() {
        head = null;
    }
    
    public boolean estaVacia(){
        return this.head == null;
    }
    
    public int getTamanio(){
        Nodo<T> curr_node = head;
        while (curr_node != null) {            
            curr_node = curr_node.getSiguiente();
            tamanio++;
        }
        return tamanio;
    }
    
    public void agregarFinal(T valor){
        if (this.head == null) {
            head = new Nodo<>(valor);
        }else{
            Nodo<T> nuevo = new Nodo<>(valor);
            Nodo<T> curr_node = this.head;
            while (curr_node.getSiguiente() != null) {                
                curr_node = curr_node.getSiguiente();
            }
            curr_node.setSiguiente(nuevo);
        }
    }
    
    public void agregarInicio(T valor){
        if (this.head == null) {
            head = new Nodo<>(valor);
        }else{
            head.setDato(valor);
        }
    }
    
    public void agregarDespues(T referencia, T valor){
        Nodo<T> curr_node = head;
        while (curr_node.getDato() != referencia && curr_node.getSiguiente() != null) {            
            curr_node = curr_node.getSiguiente();
        }
        Nodo<T> nuevo = new Nodo<>(valor, curr_node.getSiguiente());
        curr_node.setSiguiente(nuevo);
    }
    
    public void eliminar(int posicion){
        if(this.getTamanio() <= posicion || estaVacia() || posicion < 0) return;
        if (posicion == 0) {
            eliminarPrimero();
            return;
        }
        
        int pos = 0;
        Nodo<T> curr_node = head;
        Nodo<T> prev_node = null;
        
        while (curr_node.getSiguiente() != null && pos < posicion){
            prev_node = curr_node;
            curr_node = curr_node.getSiguiente();
            pos++;
        }
        prev_node.setSiguiente(curr_node.getSiguiente());
    }
    
    public void eliminarPrimero(){
        head = head.getSiguiente();
    }
    
    public void eliminarUltimo(){
        if (getTamanio() == 1) {
            eliminarPrimero();
            return;
        }
        
        Nodo<T> curr_node = head;
        Nodo<T> prev_node = null;
        while (curr_node.getSiguiente() != null) {
            prev_node = curr_node;
            curr_node = curr_node.getSiguiente();
        }
        prev_node.setSiguiente(null);
    }
    
    public int buscar(T valor){
        int posicion = 0;
        Nodo<T> curr_node = head;
        while (curr_node != null) {            
            if (curr_node.getDato() == valor) {
                return posicion;
            }else{
                curr_node = curr_node.getSiguiente();
                posicion++;
            }
        }
        return 0;
    }
    
    public void actualizar(T a_buscar, T valor){
        Nodo<T> curr_node = head;
        while (curr_node != null && curr_node.getDato() != a_buscar) {            
            curr_node = curr_node.getSiguiente();
        }
        if (curr_node.getDato() != a_buscar) return;
        curr_node.setDato(valor);
    }
    
    @Override
    public String toString(){
        String arrayList = "";
        Nodo<T> curr_node = head;
        while(curr_node != null){
            arrayList += curr_node;
            curr_node = curr_node.getSiguiente();
        }
        return arrayList;
    }
}
