/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpolimorfismo;

/**
 *
 * @author antony
 */
public class ProgramaInterfaz {
    //IPuedeCantar ip;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p=new Persona();
        hacerCantar(p);
        
        Canario c=new Canario();
        hacerCantar(c);
        
        Burro b=new Burro();
        hacerCantar(b);
    }
    public static void hacerCantar (IPuedeCantar ip){
        ip.cantar();
    }
    
}
