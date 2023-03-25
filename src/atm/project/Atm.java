package atm.project;
/*
 @author manue
 */
public class Atm {
    
    //Atributos
    int doWhile = 0;    
    
    //Metodos declarados
    private Pantalla pantallaObj = new Pantalla();
    private TecladoNumerico tecladoNumericoObj = new TecladoNumerico();
    
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
                pantallaObj.mensajeBienvenida("BIENVENIDO!\n\n");
                pantallaObj.mensajeBienvenida("Ingrese su numero de cuenta: ");
                int numCuenta = tecladoNumericoObj.capturaCuenta();
                this.doWhile = tecladoNumericoObj.doWhile;
            }
            else {
                this.doWhile = 0;                
            }            
        } while (this.doWhile != 1);
        
        do {
            if (this.doWhile != 1) {
                pantallaObj.mensajeBienvenida("\nDigite su NIP asociado a la cuenta: ");
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

    
}
