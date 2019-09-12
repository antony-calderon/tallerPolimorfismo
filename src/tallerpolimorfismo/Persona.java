
package tallerpolimorfismo;


public class Persona implements IPuedeCantar{
    @Override
    public void cantar(){
        System.out.println("do re mi fa sol la si");
    }
}
