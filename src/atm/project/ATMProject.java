package atm.project;
/*
 @author manue
 */
public class ATMProject {

    public static void main(String[] args) {
        //Atributos
        int doWhile = 0;
        
        //Objetos
        Atm principalObj = new Atm();
        
        do {
            principalObj.solicitarDatos();
            doWhile = principalObj.doWhile;            
        } while (doWhile != 1);       
        
    }
}
