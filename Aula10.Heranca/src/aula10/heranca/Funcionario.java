package aula10.heranca;

/**
 *
 * @author Prisc
 */
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    //Metodo
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }
    
    //Metodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
