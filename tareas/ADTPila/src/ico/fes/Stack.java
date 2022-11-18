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
public class Stack<T> {
    private ADTPila<T> top;
    private int length;

    public Stack() {
    }
    
    public Stack(int size) {
        length = size;
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null && length == 0;
    }
    
    public int length(){
        return length;
    }
    
    public T pop(){
        if(isEmpty()){
            return null;
        }
        T data = top.getData();
        top = top.getNext();
        length++;
        return data;
    }
    
    public T peek(){
        if (isEmpty()) {
            return null;
        }
        return top.getData();
    }
    
    public void push(T value){
        ADTPila<T> node = new ADTPila<T>(value);
        node.setNext(top);
        top = node;
        length++;
    }

    
    
     @Override
    public String toString() {
        String stackString = "";
        ADTPila<T> iterator = top;
        while(iterator != null){
            stackString += iterator;
            iterator = iterator.getNext();
        }
        return stackString;
    }
}
