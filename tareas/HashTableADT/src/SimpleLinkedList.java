/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Fernando
 * @param <T>
 */

//Usamos la tarea de ListasLigadasADT para complementar esta
public class SimpleLinkedList<T> {
     private Node<T> head;

    public SimpleLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int size = 0;
        Node<T> aux = head;

        while(aux != null) {
            aux = aux.getNext();
            size++;
        }
        return size;
    }

    public int search(T value) {
        int indexPosition = 0;
        Node<T> iteratorNode = head;
        while(iteratorNode != null){
            if(value.equals(iteratorNode.getData())) {
                return indexPosition;
            }
            iteratorNode = iteratorNode.getNext();
            indexPosition++;
        } 
       return -1;
    }
    
    public T getValue(T valor) {
        Node<T> iteratorNode = head;
        while(iteratorNode != null){
            if(valor.equals(iteratorNode.getData())) {
                return iteratorNode.getData();
            }
            iteratorNode = iteratorNode.getNext();
        }
        return null;
    }

    public void addLast(T value) {
        if(isEmpty()) {
            Node<T> newNode = new Node<>(value);
            head = newNode;
            return;
        }

        Node<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            iteratorNode = iteratorNode.getNext();
        }
        Node<T> newNode = new Node<>(value);
        iteratorNode.setNext(newNode);
    }

    public void addFirst(T valor) {
        Node<T> newNode = new Node<>(valor, head);
        head = newNode;
    }

    public void addAfter(T reference, T value) {
        if(search(reference) < 0) return;

        Node<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && !reference.equals(iteratorNode.getData())){
            iteratorNode = iteratorNode.getNext();
        }
        Node<T> newNode = new Node<>(value, iteratorNode.getNext());
        iteratorNode.setNext(newNode);
    }

    public void deleteAt(T index) {
        if(isEmpty()) return;
        Node<T> prevNode = null;
        Node<T> iteratorNode = head;
        while(iteratorNode.getNext() != null && !index.equals(iteratorNode.getData())){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }

        if(prevNode != null) {
            prevNode.setNext(iteratorNode.getNext());
        } else {
            deleteStart();
        }
    }

    public void deleteStart() {
        if(isEmpty()) return;
        head = head.getNext();
    }

    public void deleteLast() {
        if(isEmpty()) return;
        if(getSize() == 1) {
            deleteStart();
            return;
        }
        Node<T> prevNode = null;
        Node<T> iteratorNode = head;
        while(iteratorNode.getNext() != null){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        prevNode.setNext(null);
    }

    public void update(T a_search, T value){
        if(search(a_search) < 0) return;

        Node<T> iteratorNode = head;
        while(iteratorNode != null && !a_search.equals(iteratorNode.getData())){
            iteratorNode = iteratorNode.getNext();
        }
        if(iteratorNode.getData() != a_search) return;
        iteratorNode.setData(value);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Node<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getNext();
        }
        return arrrayListString;
    }
}
