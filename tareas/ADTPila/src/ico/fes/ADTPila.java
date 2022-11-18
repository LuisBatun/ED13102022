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
public class ADTPila<T> {
    T data;
    ADTPila<T> next;

    public ADTPila() {
    }

    public ADTPila(T valor) {
        this.data = valor;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ADTPila<T> getNext() {
        return next;
    }

    public void setNext(ADTPila<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "|" + data + "| \n";
    }
    
    
    
}
