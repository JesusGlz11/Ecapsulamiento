
/*import Paquete1.Default;
import Paquete1.Publica;
import Paquete1.Protected;
import Paquete1.Publica;
*/
import Paquete1.*;

public class programaMain {
    
    public static void main(String [] args){
        Publica publico=new Publica();
        publico.Publico="soy un atirbuto publico";
        System.out.println(publico.Publico);
        publico.metodoPublico();
        
        
        Default defaultobj=new Default();
        //defaultobj.atributo="soy un atributo default";
        //defaultobj.metodoDefault();
        
        
        Privado privado=new Privado();
        //privado.privado="Soy un atributo privado";
        //System.out.println(privado.privado);
        //privado.metodoprivado();
         privado.imprimePrivado();
        
        
        Protected protegido = new Protected();
        //protegido.protegido = "atributo protegido";
        //protegido.metodoProtegido();
        //System.out.println(protegido);
    }
}
