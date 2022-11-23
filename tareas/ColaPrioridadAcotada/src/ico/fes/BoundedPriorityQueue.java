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
public class BoundedPriorityQueue<T> {

    private Queue<T>[] boundedQueue;
    private int size, length;
    
    public BoundedPriorityQueue(int levels) {
        boundedQueue = new Queue[levels];
        this.size = levels;
        length = 0;
    }
    
    public boolean is_empty(){
        return length == 0;
    }
    
    public int length(){
        return length;
    }
    
    public void enqueue(int priority, T value){
        if (boundedQueue[priority] == null) {
            boundedQueue[priority] = new Queue<T>();
        }
        boundedQueue[priority].enqueue(value);
        length++;
    }
    
    public T dequeue() {
        for (int i = 0; i < size; i++) {
            if (boundedQueue[i] != null && !boundedQueue[i].is_empty()) {
                length--;
                return boundedQueue[i].dequeue();
            }
        }
        return null;
    }
    
     public T front() {
         for(int i = 0; i < size; i++) {
            if(boundedQueue[i] != null && !boundedQueue[i].is_empty()) {
                return boundedQueue[i].front();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String queueString = "";
        for(int i = 0; i < size; i++) {
            queueString += i + ": ";
            if (boundedQueue[i] != null && !boundedQueue[i].is_empty()) {
                queueString += boundedQueue[i] + "\n";
            } else {
                queueString += "null\n";
            }
        }
        return queueString;
    }
}
