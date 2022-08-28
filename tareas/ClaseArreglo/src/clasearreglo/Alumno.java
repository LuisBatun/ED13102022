/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author Luis Fernando
 */
public class Alumno {
    
    private String nombre;
    private int edad;
    private int numeroCuenta;

    public Alumno() {
    }

    public Alumno(String nombre, int edad, int numeroCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", numeroCuenta=" + numeroCuenta + '}';
    }
}
