package atm.project;
/*
 @author manue
 */
public class ATMProject {

    public static void main(String[] args) {
        //Atributos
        int doWhile;
        
        //OBJETOS
        Atm principalObj = new Atm();
        BaseDeDatos baseDeDatosObj = new BaseDeDatos();
        /*
        baseDeDatosObj.escribir2();
        baseDeDatosObj.leer();
        */
        do {
            principalObj.solicitarDatos();            
            doWhile = principalObj.doWhile;            
        } while (doWhile != 1);
        
        do {            
            principalObj.menuOpciones();
            doWhile = principalObj.doWhile;            
        } while (doWhile != 1);
        
        
        
    }
}
