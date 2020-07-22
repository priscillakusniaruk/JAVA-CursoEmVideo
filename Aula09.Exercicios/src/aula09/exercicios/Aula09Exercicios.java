package aula09.exercicios;

/**
 *
 * @author Prisc
 */
public class Aula09Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Priscilla", 23, "F");
        p[1] = new Pessoa("Rodrigo", 34, "M");
        
        l[0] = new Livro("Aprendendo JAVA", "GAFANHOTO", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "GAFANHOTO CHAVE", 500, p[1]);
        l[2] = new Livro("JAVA AVANÇADO", "MARIA MARIA", 800, p[0]);
        
        System.out.println(l[0].detalhes());
    }
    
    
}
