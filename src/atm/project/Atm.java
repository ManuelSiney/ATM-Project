package atm.project;

import java.util.Scanner;

/*
 @author manue
 */
public class Atm {
    
    //Atributos
    int doWhile = 0;
    int switchMenu;    
    
    //OBJETOS declarados
    Scanner recogeDatos = new Scanner(System.in);
    private Pantalla pantallaObj = new Pantalla();
    private TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    private Retiro retiroObj = new Retiro();
    
    /*/Constructor  inicializador de Metodos  
    public Atm () {
        pantallaObj = new Pantalla();
        tecladoNumericoObj = new TecladoNumerico();
        
        //solicitarDatos();
    }*/
    
    //Metodo de SMS Bienvenida y CapturaDatos     
    public int solicitarDatos() {
        do {
            if (this.doWhile != 1) {
                pantallaObj.mensaje("BIENVENIDO!\n\n");
                pantallaObj.mensaje("Ingrese su numero de cuenta: ");
                int numCuenta = tecladoNumericoObj.capturaCuenta();
                this.doWhile = tecladoNumericoObj.doWhile;
            }
            else {
                this.doWhile = 0;                
            }            
        } while (this.doWhile != 1);
        
        do {
            if (this.doWhile != 1) {
                pantallaObj.mensaje("\nDigite su NIP asociado a la cuenta: ");
                int numNip = tecladoNumericoObj.capturaCuenta();
                this.doWhile = tecladoNumericoObj.doWhile;
                return this.doWhile;
            }
            else {
                this.doWhile = 0;
            }
        } while (this.doWhile != 1);
        return this.doWhile;        
    }
    
    public int menuOpciones() {        
        pantallaObj.mensaje("\nMENU PRINCIPAL:\n\n");
        pantallaObj.mensaje("\t1 - Consultar Saldo.\n");
        pantallaObj.mensaje("\t2 - Retirar Efectivo.\n");
        pantallaObj.mensaje("\t3 - Depositar Fondos.\n");
        pantallaObj.mensaje("\t4 - Salir.\n");
        pantallaObj.mensaje("\nDigite una opcion: ");
        switchMenu = recogeDatos.nextInt();
        
        switch (switchMenu) {
            case 1: {
                pantallaObj.mensaje("\nCONSULTA DE SALDO:\n");
                retiroObj.consultaSaldo();                
            }
            switchMenu = 2;
            case 2: {
                System.out.println("Desea realizar otra operacion?");
            }
        }
        
        
        return 0;
    }

    
}
