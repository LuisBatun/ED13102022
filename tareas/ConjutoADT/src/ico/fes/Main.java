/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Luis Fernando
 */
public class Main {
    public static void main(String[] args) {
        ConjuntoADT<Integer> conjuntoADT1 = new ConjuntoADT();
        ConjuntoADT<Integer> conjuntoADT2 = new ConjuntoADT();
        
        for (int i = 1; i <= 5; i++) {
            conjuntoADT1.agregar(i);
        }
        
        for (int i = 3; i <= 7; i++) {
            conjuntoADT2.agregar(i);
        }
        
        //Muestra la longitud de los conjuntos
        System.out.println("Longitud del Conjunto 1: " + conjuntoADT1.longitud());
        System.out.println("Longitud del Conjunto 2: " + conjuntoADT2.longitud());

        //Muestra si los conjuntos contienen los valores marcados
        System.out.println("¿Conjunto1 contiene 3?: " + conjuntoADT1.contiene(3));
        System.out.println("¿Conjunto1 contiene 0?: " + conjuntoADT1.contiene(6));
        
        //Eliminamos un dato del conjunto 1
        conjuntoADT1.eliminar(4);
        
        //Nos dice si los conjuntos tienen los mismos elementos
        System.out.println("¿Conjunto1 es igual a Conjunto2? " + conjuntoADT1.equals(conjuntoADT2));

        //Nos dice si un conjunto esta dentro de otro conjunto
        System.out.println("¿Conjunto1 es subconjunto de Conjunto2?: " + conjuntoADT1.esSubConjunto(conjuntoADT2));

        //Nos dice los valores que comparten los conjuntos
        ConjuntoADT<Integer> conjunto_intersection = conjuntoADT1.interseccion(conjuntoADT2);
        System.out.println("La interseccion de los valores de los conjuntos (los que comparten) son: " + conjunto_intersection);

        //Nos dice los valores que no comparten los conjuntos
        ConjuntoADT<Integer> conjunto_difference = conjuntoADT1.differencia(conjuntoADT2);
        System.out.println("Los valores diferentes de cada conjunto son: " + conjunto_difference);
        
        //Nos muestra los valores de los conjuntos, unidos
        conjuntoADT1.union(conjuntoADT2);
        System.out.println("La union de los conjuntos (c1 u c2) es: " + conjuntoADT1);

    }
}
