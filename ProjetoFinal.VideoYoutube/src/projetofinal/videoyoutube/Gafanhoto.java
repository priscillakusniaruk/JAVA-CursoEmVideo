package projetofinal.videoyoutube;

/**
 *
 * @author Prisc
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    public void viuMaisUm(){
        
    }

    public Gafanhoto(String login, String nome, int idade, String sexo, float experiencia) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
        
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login = " + login + ", totAssistido = " + totAssistido + '}';
    }
    
    
    
}
