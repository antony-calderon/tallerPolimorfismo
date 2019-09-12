
package tallerpolimorfismo;


public class ProgramaInterfaz {
   
    public static void main(String[] args) {
        
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
