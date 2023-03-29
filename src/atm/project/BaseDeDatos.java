/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manue
 */
public class BaseDeDatos {
    private File archivoObj = new File("Cuentas.txt");  //Codigo para crear un archivo con FILE.
    
    //Metodo para escribir en un archivo.
    public void escribir () {
        try {
            FileWriter fw = new FileWriter(archivoObj, true);   //Codigo para escribir en un archivo.   El "true" funciona para no sobreescribir el archivo.
            BufferedWriter bw = new BufferedWriter(fw);     //Codigo para escribir con Buffer.
            bw.write(" dpi | nip | nombre | apellido | cuenta | saldo | direccion |");
            bw.newLine();   //Codigo para insertar un enter en un archivo.
            bw.write(" 123 | 456 | Manuel | Siney | 789 | 147 | San Juan Sac |");
            bw.newLine();
            bw.write(" 321 | 654 | Juan | Vicente | 987 | 741 | San Pedro Sac |");
            bw.close();     //Codigo para cerrar un archivo.
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //EJEMPLO2
    public void escribir2() {
        try {
            FileWriter fw = new FileWriter(archivoObj);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(" dpi | nip | nombre | apellido | cuenta | saldo | direccion |");
            bw.newLine();   //Codigo para insertar un enter en un archivo.
            bw.write(" 123 | 456 | Manuel | Siney | 789 | 147 | San Juan Sac |");
            bw.newLine();
            bw.write(" 321 | 654 | Juan | Vicente | 987 | 741 | San Pedro Sac |");
            bw.close();     //Codigo para cerrar un archivo.
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para Leer un archivo.
    public void leer() {
        try {
            FileReader fr = new FileReader(archivoObj);     //Codigo para leer un archivo.
            BufferedReader br = new BufferedReader(fr);     //Codigo para leer un archivo con Buffer.
            String leeLinea;            
            while ((leeLinea = br.readLine())!= null) {         //while para leer todo el archivo.
                System.out.println(leeLinea);
            }            
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //EJEMPLO2
    public void leer2() {
        try {
            FileReader fr = new FileReader(archivoObj);
            BufferedReader br = new BufferedReader(fr);
            String leeLinea = br.readLine();      //Codigo para leer una linea de un archivo.
            System.out.println(leeLinea);
            leeLinea = br.readLine();            
            System.out.println(leeLinea);
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public void eliminar(){
        String numeroDeCuentaAEliminar = "78458";
        File cpFileObj = new File("copia_cuentas.txt");
        FileWrite fw = new FileWrite(cpFileObj);
    }*/
    
    
    
}
