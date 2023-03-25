/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.project;

/**
 *
 * @author manue
 */
public abstract class Transaccion {
    private int monto;
    
    public void consultaSaldo() {
        System.out.println("\nSu saldo disponible es de: "+56+"\n");
        //return 0;
    }    
        
    public void ejecutar(int monto) {
        System.out.println("Transaccion.ejecutar()");
    }
    
}
