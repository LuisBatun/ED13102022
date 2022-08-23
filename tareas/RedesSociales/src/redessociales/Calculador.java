/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redessociales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Fernando
 */
public class Calculador {
   
    
    ArrayList<String> meses = new ArrayList<>();
    ArrayList<ArrayList<String>> matriz = new ArrayList<>(); //Arreglo bidimensional
    Scanner teclado = new Scanner(System.in);
    
    public void leerArchivo(){
        try{
            BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Luis Fernando\\Documents\\FES ARAGON\\SEMESTRE 3 2023-I\\ED13102022\\tareas\\RedesSociales\\src\\redessociales\\presenciaredes.csv"));
            
            String linea;
            while ((linea = lector.readLine()) != null){
                String [] filas = linea.split(",");
                ArrayList<String> temporal = new ArrayList<>();
                for (String dato : filas) {
                    temporal.add(dato);
                    
                }
                matriz.add(temporal);
                temporal = null;
            }
            for (int i = 3; i < 9; i++) {
                meses.add(matriz.get(0).get(i));
            }
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR DE COMPILACION", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public void diferenciaSeg(){
        ArrayList<Integer> seguidoresT = new ArrayList<>();
        System.out.println("1. La diferencia de seguidores (followers) en Twitter entre el mes de enero y junio.");
        for (int i = 3; i < 9; i++) {
            seguidoresT.add(Integer.valueOf(matriz.get(8).get(i)));
        }
        System.out.println(meses);
        System.out.println(seguidoresT);
        System.out.println("");
        System.out.println("======================================================================================");
        System.out.println("");
    }
    
    
    public void visYouTube(){
        ArrayList<Integer> visualizacionesYT = new ArrayList<>();
        for (int i = 3; i < 9; i++) {
            visualizacionesYT.add(Integer.valueOf(matriz.get(16).get(i)));
        }
        
        System.out.println("2. Calcular la diferencia de visualizaciones de YouTube entre los meses seleccionados por teclado (enero a junio).");
        System.out.println("Selecciona el mes en base a su número, ejemplo: enero = 1, febrero = 2, etc. Hasta junio");
        System.out.print("Primer mes: ");
        int mes1 = teclado.nextInt();
        System.out.println("");
        System.out.print("Segundo mes: ");
        int mes2 = teclado.nextInt();
        System.out.println("");
        int resultado = visualizacionesYT.get(mes1-1) - visualizacionesYT.get(mes2-1);
        
        System.out.println("La diferencia de visualizaciones entre el mes de " + meses.get(mes1-1) + " y " + meses.get(mes2-1) + " es de: " + resultado);
        System.out.println("");
        System.out.println("======================================================================================");
        System.out.println("");
    }
    
    
    
    public void promedioTyFB(){
        System.out.println("3. Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio.");
        System.out.println("");
        ArrayList<Integer> crecimientoT = new ArrayList<>();
        ArrayList<Integer> crecimientoFB = new ArrayList<>();
        
        for (int i = 3; i < 9; i++) {
            crecimientoT.add(Integer.valueOf(matriz.get(9).get(i)));   
            crecimientoFB.add(Integer.valueOf(matriz.get(2).get(i)));   
        }
        double promT = ((crecimientoT.get(0)+crecimientoT.get(1)+crecimientoT.get(2)+crecimientoT.get(3)+crecimientoT.get(4)+crecimientoT.get(5))/6);
        System.out.println("El crecimiento de Twitter entre los meses de enero a junio ha sido de esta manera: ");
        System.out.print("Teniendo como promedio: " + promT);
        System.out.println("");
        
        double promFB = ((crecimientoFB.get(0)+crecimientoFB.get(1)+crecimientoFB.get(2)+crecimientoFB.get(3)+crecimientoFB.get(4)+crecimientoFB.get(5))/6);
        System.out.println("El crecimiento de Facebook entre los meses de enero a junio ha sido de esta manera: ");
        System.out.print("Teniendo como promedio: " + promFB);
        System.out.println("");
        System.out.println("======================================================================================");
        
    }
    
}
