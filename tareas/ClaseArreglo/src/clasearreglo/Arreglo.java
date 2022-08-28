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
    
    Alumno [] lista;
    int tamanio;

    public Arreglo() {
    }

    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
            lista = new Alumno[tamanio];
    }  
  
    int getLongitud(){
        return tamanio;
    }
    
    public void setElemento(int indice,Alumno valor){
        
        lista[indice] = valor;
    }
    
    public Object getElemento(int indice){
        return lista[indice];
    }
    
    public void limpiar(int valor){
        lista[valor] = null;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "tamanio=" + tamanio + '}';
    }
    
    public static void main(String[] args) {
        Arreglo alumnos = new Arreglo(58);
        Alumno datos = new Alumno();
        
        System.out.println(alumnos.getLongitud());
        
        alumnos.setElemento(53, new Alumno("Luis", 22, 319325586));
        alumnos.setElemento(42, new Alumno("Juan", 21, 319343242));
        alumnos.setElemento(23, new Alumno("Jaime", 26, 31975464));
        alumnos.setElemento(12, new Alumno("Iker", 18, 31943245));
        alumnos.setElemento(2, new Alumno("Daniel", 24, 31953753));
        alumnos.setElemento(37, new Alumno("Julio", 34, 31986536));
        
        System.out.println("---------------------");
        System.out.println(alumnos.getElemento(53));
        System.out.println(alumnos.getElemento(12));
        System.out.println(alumnos.getElemento(2));
        System.out.println("---------------------");
        alumnos.limpiar(2);
        System.out.println("---------------------");
        System.out.println(alumnos.getElemento(53));
        System.out.println(alumnos.getElemento(12));
        System.out.println(alumnos.getElemento(2));
        System.out.println("---------------------");
        
        System.out.println(alumnos.toString());
        System.out.println(datos.toString());
    }
}
    
