/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.io.IOException;

/**
 *
 * @author Luis Fernando
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        NominaADT nomina = new NominaADT("C:\\Users\\Luis Fernando\\Documents\\ED13102022\\tareas\\Empresa\\src\\ico\\fes\\junio.dat", "Constructores ED");
        nomina.calcularSueldo();
        nomina.obtenerMaxMin();
    }
    
    
}
