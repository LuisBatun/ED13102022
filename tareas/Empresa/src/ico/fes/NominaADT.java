/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.io.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.io.FileNotFoundException;

/**
 *
 * @author Luis Fernando
 */
public class NominaADT {
    
    String nombreEmpresa;
    ArrayADT<Empleados> empleados;
    String rutaArchivo;
    Empleados emp;
   

    public NominaADT() {
    }
    
    public NominaADT(String ruta, String nombreEmp) throws IOException{
        this.rutaArchivo = ruta;
        this.nombreEmpresa = nombreEmp;
        int contador = 0;
        String linea;
        String contenido = "";
        
            BufferedReader lector = new BufferedReader(new FileReader(this.rutaArchivo));
            lector.readLine();
            while ((linea = lector.readLine()) != null){
                contenido += linea + "\r";
                contador++;
            }
            lector.close();
            
            
            String [] ArregloParrafo = contenido.split("\r");
            
            empleados = new ArrayADT<>(contador);
            
            for (int i = 0; i < ArregloParrafo.length; i++) {
                String [] ArregloRenglon = ArregloParrafo[i].split(",");
                Empleados datos = new Empleados();
                datos.setId(parseInt(ArregloRenglon[0]));
                datos.setNombre(ArregloRenglon[1]);
                datos.setPaterno(ArregloRenglon[2]);
                datos.setMaterno(ArregloRenglon[3]);
                datos.setHorasExtras(parseInt(ArregloRenglon[4]));
                datos.setSueldoBase(parseDouble (ArregloRenglon[5]));
                datos.setAnioIngreso(parseInt(ArregloRenglon[6]));
                empleados.setElemento(i, datos);
            }
    }
    
    public void calcularSueldo(){
        for (int i = 0; i < empleados.getTamanio(); i++) {
            System.out.println(empleados.getElemento(i));
            System.out.println("Sueldo total del trabajador: " + empleados.getElemento(i).calcularSueldo());
        }
    }
    
    public void obtenerMaxMin(){
        Empleados maxEmp = empleados.getElemento(0);
        Empleados minEmp = empleados.getElemento(0);
        
        for(Empleados actual : empleados) {
            if(actual.getAnioIngreso() > maxEmp.getAnioIngreso()){
                maxEmp = actual;
            }
            
            if (actual.getAnioIngreso() < minEmp.getAnioIngreso()){
                minEmp = actual;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("Trabajador con mayor antiguedad: " + minEmp);
        System.out.println("");
        System.out.println("Trabajador con menor antiguedad: " + maxEmp);
        System.out.println("------------------------------------------");
    }
}
