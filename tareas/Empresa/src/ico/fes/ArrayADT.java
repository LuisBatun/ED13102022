/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.util.ArrayList;

/**
 *
 * @author Luis Fernando
 * @param 
 */
public class ArrayADT<T> implements Iterable<T>{
    
    private int tamanio;
    ArrayList<T> datos;

    public ArrayADT() {
    }    

    public ArrayADT(int tam) {
        this.tamanio = tam;
        datos = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
    }
    
    public T getElemento(int indice)throws IndexOutOfBoundsException{
        return datos.get(indice);
    }
    
    public void setElemento(int indice, T dato){
        this.datos.set(indice, dato);
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void limpiar(T dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.set(i, dato);
        }
    }

    @Override
    public String toString() {
        return "ArrayADT{" + "tamanio=" + tamanio + ", datos=" + datos + '}';
    }
    
   @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int indice = 0;

            @Override
            public boolean hasNext() {
                return indice < tamanio;
            }

            @Override
            public T next() {
                return datos.get(indice++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}
