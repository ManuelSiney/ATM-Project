/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.project;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class TecladoNumerico {
    //Atributos
    int doWhile;
    
    //Metodo declarado para el Scanner
    Scanner scan;
    
    //Constructor para inicializar el Scanner
    public TecladoNumerico() {
        scan = new Scanner(System.in);
    }
    
    //Metodo para guardar dato Cuenta
    public int capturaCuenta() {     
        int cuenta = scan.nextInt();
        if (cuenta > 9999 && cuenta < 100000) {
            doWhile = 1;
            return doWhile;
        }
        else {
            System.out.println("\nERROR! El numero debe ser de 5 digitos\nVuelva a intentarlo.\n");
            doWhile = 0;
            return doWhile;            
        }
        
    }
       
}
