/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author Luis Fernando
 */
public class Empleados {
    public static final double VALOR_HORAS_EXTRA = 276.5;
    public static final double PRESTACION_ANTIGUEDAD_ANUAL = 0.03;
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int horasExtras;
    private double sueldoBase;
    private int anioIngreso;

    public Empleados() {
    }

    public Empleados(int id, String nombre, String paterno, String materno, int horasExtras, double sueldoBase, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.horasExtras = horasExtras;
        this.sueldoBase = sueldoBase;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double calcularSueldo(){
        double prestacion = (2022 - this.anioIngreso)* this.PRESTACION_ANTIGUEDAD_ANUAL;
        double he = this.horasExtras * this.VALOR_HORAS_EXTRA;
        return this.sueldoBase + prestacion + he;
    }
    
    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", horasExtras=" + horasExtras + ", sueldoBase=" + sueldoBase + ", anioIngreso=" + anioIngreso + '}';
    }
    
}
