package projetofinal.videoyoutube;

/**
 *
 * @author Prisc
 */
public class ProjetoFinalVideoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video [3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto [2];
        g[0] = new Gafanhoto("oioi" , "Rodrigo", 34, "M", 1254);
        g[1] = new Gafanhoto("titi", "Pripri", 23, "M", 12036);
        
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
