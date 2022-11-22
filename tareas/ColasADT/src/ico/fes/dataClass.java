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
public class dataClass<T> {
    private T data;
    private dataClass<T> next;

    public dataClass(T elem) {
        this.data = elem;
    }

    public dataClass(T elem, dataClass<T> next) {
        this.data = elem;
        this.next = next;
    }

    public dataClass<T> getNext() {
        return next;
    }

    public void setNext(dataClass<T> next) {
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
