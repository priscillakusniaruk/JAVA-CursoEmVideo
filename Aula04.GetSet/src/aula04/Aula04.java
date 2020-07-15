package aula04;

/**
 *
 * @author Prisc
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("BIC", "Amarelo", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("FABER", "Laranja", 0.9f);
        c2.status();
        
                
        //Caneta c1 = new Caneta();
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        //c1.status();
        //c1.setCor ("azul");
        
        //System.out.print("Tenho uma caneta " + c1.getModelo() );
        //System.out.println(" de cor " + c1.getCor() + " e ponta: " + c1.getPonta());
    }
    
}
