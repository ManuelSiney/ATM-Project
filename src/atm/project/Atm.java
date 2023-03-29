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
    private Deposito depositoObj = new Deposito();
    
    /*/Constructor  inicializador de Metodos  
    public Atm () {
        pantallaObj = new Pantalla();
        tecladoNumericoObj = new TecladoNumerico();
        
        //solicitarDatos();
    }*/
    
    //Metodo de SMS Bienvenida y Captura de Cuenta y NIP    
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
        do {
            pantallaObj.mensaje("\nMENU PRINCIPAL:\n\n");
            pantallaObj.mensaje("\t1 - Consultar Saldo.\n");
            pantallaObj.mensaje("\t2 - Retirar Efectivo.\n");
            pantallaObj.mensaje("\t3 - Depositar Fondos.\n");
            pantallaObj.mensaje("\t4 - Salir.\n");
            pantallaObj.mensaje("\nDigite una opcion: ");
            switchMenu = recogeDatos.nextInt();

            switch (switchMenu) {
                case 1: {
                    pantallaObj.mensaje("\n\tCONSULTA DE SALDO:\n\n");
                    retiroObj.consultaSaldo();
                    break;
                }                
                case 2: {
                    int monto = 56;
                    pantallaObj.mensaje("\n\tRETIRO DE EFECTIVO:\n");
                    retiroObj.retiroFondos(monto);
                    this.doWhile = retiroObj.doWhile;
                    break;
                }
                case 3: {
                    pantallaObj.mensaje("\n\tDEPOSITO DE FONDOS\n\n");
                    depositoObj.depositoFondos(56);
                    break;
                }
                case 4: {
                    pantallaObj.mensaje("\n\tUSTED HA SALIDO DEL PROGRAMA.\n\n");
                    this.doWhile = 1;
                    break;
                }
                default: {
                    pantallaObj.mensaje("\nERROR!\nLa opcion ingresada NO EXISTE!\t Vuelva a intentarlo.\n\n");
                    this.doWhile = 0;
                }
            }
        } while(this.doWhile != 1);        
        
        
        
        return 0;
    }

    
}
