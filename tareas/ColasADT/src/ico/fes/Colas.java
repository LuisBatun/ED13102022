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
public class Colas<T> {
    private dataClass<T> front;
    private dataClass<T> back;
    private int length;

    public Colas() {
        front = back = null;
        length = 0;
    }

    public boolean is_empty() {
        return front == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        if(is_empty()) {
            return null;
        }

        if(front == back) {
            back = null;
        }

        T topValue = front.getData();
        front = front.getNext();
        length--;
        return topValue;
    }

    public T front() {
        if(is_empty()) {
            return null;
        }

        return front.getData();
    }

    public void enqueue(T elem) {
        dataClass<T> newCola = new dataClass<>(elem);
        if(is_empty()) {
            front = newCola;
            back = newCola;
        } else {
            back.setNext(newCola);
            back = newCola;
        }
        length++;
    }
    
     @Override
    public String toString() {
        String stackString = "";
        dataClass<T> iteratorNode = front;
        while(iteratorNode != null){
            stackString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return stackString;
    }
}
