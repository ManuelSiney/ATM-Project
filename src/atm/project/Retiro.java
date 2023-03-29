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
public class Retiro extends Transaccion {
    //ATRIBUTOS
    int doWhile;
    int switchRetiro;
    
    //OBJETOS
    private Scanner recogeDatos = new Scanner(System.in);
    private Pantalla pantallaObj = new Pantalla();
    
    //METODO PARA RETIRO DE FONDOS
    public int retiroFondos (int monto) {
        do {
            pantallaObj.mensaje("\nMENU DE RETIRO:\n\n");
            pantallaObj.mensaje("\t 1 - Q20 \t 4 - Q100 \n");
            pantallaObj.mensaje("\t 2 - Q40 \t 5 - Q200 \n");
            pantallaObj.mensaje("\t 3 - Q60 \t 6 - Cancelar Transaccion.\n\n");
            pantallaObj.mensaje("DIGITE UN MONTO DE RETIRO: ");
            switchRetiro = recogeDatos.nextInt();
            
            switch (switchRetiro) {
                case 1: {
                    pantallaObj.mensaje("\n\tUsted retiro Q20\n\n");
                    doWhile = 1;
                    break;
                }
            }
        } while(doWhile != 1);
        return doWhile;        
    }
    
}
