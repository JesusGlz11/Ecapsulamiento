
package Paquete1;


public class Privado {
    private String privado;
    
    public void metodoprivado(){
        System.out.println("soy un metodo privado");
    }
    public void imprimePrivado(){
        this.privado = "Soy un metodo privado no puedes acceder";
        System.out.println(this.privado);
        this.metodoprivado();
    }
        
}

