/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.util.ArrayList;

/**
 *
 * @author Luis Fernando
 */
public class ConjuntoADT <T>{
    ArrayList<T> dato = new ArrayList<>();

    public ConjuntoADT() {
    }
    
    public int longitud(){
        return dato.size();
    }
    
     public boolean contiene(T elemento) {
        return dato.indexOf(elemento) != -1;
    }

    public void agregar(T elemento) {
        if(!contiene(elemento)) {
            dato.add(elemento);
        }
    }

    public void eliminar(T elemento) {
        dato.remove(elemento);
    }

    public boolean equals(ConjuntoADT<T> other) {
        if(longitud() != other.longitud()) {
            return false;
        }
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(dato.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubConjunto(ConjuntoADT<T> other) {
        if(longitud() > other.longitud()){
            return false;
        }
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(dato.get(i))) {
                return false;
            }
        }
        return true;
    }

    public void union(ConjuntoADT<T> other) {
        for(int i = 0; i < other.longitud(); i++) {
            agregar(other.dato.get(i));
        }
    }

    public ConjuntoADT<T> interseccion(ConjuntoADT<T> other) {
        ConjuntoADT<T> inter = new ConjuntoADT();
        for(int i = 0; i < longitud(); i++) {
            if(other.contiene(dato.get(i))) {
                inter.agregar(dato.get(i));
            }
        }
        return inter;
    }

    public ConjuntoADT<T> differencia(ConjuntoADT<T> other) {
        ConjuntoADT<T> dif = new ConjuntoADT();
        for(int i = 0; i < longitud(); i++) {
            if(!other.contiene(dato.get(i))) {
                dif.agregar(dato.get(i));
            }
        }
        for(int i = 0; i < other.longitud(); i++) {
            if(!contiene(other.dato.get(i))) {
                dif.agregar(other.dato.get(i));
            }
        }
        return dif;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
    
}
