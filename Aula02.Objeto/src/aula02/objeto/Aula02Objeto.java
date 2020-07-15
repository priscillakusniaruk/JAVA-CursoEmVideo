package aula02.objeto;

/**
 *
 * @author Priscilla Kusniaruk
 */
public class Aula02Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul" ;
       c1.ponta = 0.5f ;
       c1.destampar();
       c1.rabiscar();
       c1.status();
       
       Caneta c2 = new Caneta();
       c2.modelo = "BIC";
       c2.cor = "Vermelha";
       c2.ponta = 0.9f;
       c2.tampar();
       c2.status();
       c2.rabiscar();
       
    }
    
}
