/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author Luis Fernando
 */
public class Arreglo {
    
    private String nombre;
    private int edad;
    private int numCuenta;
    
    int lugar;
    int tamaño;
    int indicep;
    private Object valor;
    
    
    
    Arreglo [] lista = new Arreglo[lugar];
    
    
    Arreglo (int tamanio){
        tamaño = tamanio;
    }
    public Arreglo(String nombre, int edad, int numCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.numCuenta = numCuenta;
    }
    
    int getLongitud(){
        return tamaño;
    }
    
    public void setElemento(int indice,Arreglo valor){
        
        lugar = indice;
        lista[lugar] = valor;
    }
    
    Object getElemento(int indice){
        indicep = indice;
        return valor;
    }
    
    public void limpiar(Object valor){
        
    }
    
    @Override
    public String toString() {
        return "Arreglo{" + "nombre=" + nombre + ", edad=" + edad + ", numCuenta=" + numCuenta + '}';
    }
    
    public static void main(String[] args) {
        Arreglo alumnos = new Arreglo(58);
        System.out.println(alumnos.getLongitud());
        alumnos.setElemento(3, new Arreglo("Luis", 22, 319325586));
        alumnos.setElemento(5, new Arreglo("Fer",21,41123244));
        alumnos.setElemento(12, new Arreglo("Jose", 19, 413848723));
        System.out.println(alumnos);
    }
}
    
