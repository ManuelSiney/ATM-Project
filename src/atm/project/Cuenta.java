/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.project;

/**
 *
 * @author manue
 */
public class Cuenta {
   private float saldo, saldoFlotante;
    private int numeroDeCuenta, nip;
    
    //Los constructures: 1 se ejecutan despues del New del objeto. 2: Deben de tener el mismo nombre que la clase. 3: No tiene tipo de retorno.
        Cuenta(String nombre) {
        System.out.println("Hola" + nombre);
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    int obtenerSaldo(int numeroDeCuenta) {    
        return 0;
    }
    void acreditar(int monto) {
    }
    void debitar(int monto) {
    }
    
}
