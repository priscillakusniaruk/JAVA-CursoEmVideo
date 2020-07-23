package aula11.heranca2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Prisc
 */
public class Aula11Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); << nao pode ser instaciado devido a classe ser abstrata
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Engenharia");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();
       
        Bolsista  b1 = new Bolsista();
        b1.setMatricula(1121);
        b1.setNome("Jubis");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
        
    }
    
}
