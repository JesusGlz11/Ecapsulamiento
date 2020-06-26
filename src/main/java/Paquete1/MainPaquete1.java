
package Paquete1;


public class MainPaquete1 {
        public static void main(String args[]){
        Publica publico=new Publica();
        publico.Publico="soy un atirbuto publico";
        publico.metodoPublico();
        
        Default defaultobj=new Default();
        defaultobj.atributoDefault="soy un atributo default";
        defaultobj.metodoDefault();
        System.out.println(defaultobj);
        
        Privado privado=new Privado();
        //privado.privado="Soy un atributo privado";
        //System.out.println(privado.privado);
        //privado.metodoprivado();
         privado.imprimePrivado();
        
         Protected protegido = new Protected();
         protegido.protegido = "atributo protegido";
         protegido.metodoProtegido();
         System.out.println(protegido);
    }
}
