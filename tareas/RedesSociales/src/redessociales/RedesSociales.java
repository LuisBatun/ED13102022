/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redessociales;

import java.io.FileNotFoundException;


/**
 *
 * @author Luis Fernando
 */
public class RedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Calculador archivo = new Calculador();
        archivo.leerArchivo();
        archivo.diferenciaSeg();
        archivo.visYouTube();
        archivo.promedioTyFB();
        
    }
    
    
    
    
}
