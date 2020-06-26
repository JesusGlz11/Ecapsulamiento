
package paquete2;

import Paquete1.*;


public class mainPaquete2{
    public static void main(String[] args){
        
        Publica publico=new Publica();
        publico.Publico="soy un atirbuto publico";
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
        //System.out.println(protegido.protegido);
        //protegido.metodoProtegido();
    }
}
