package aula09.exercicios;

/**
 *
 * @author Prisc
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //Metodo
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("TA FICANDO VEIO" + this.getNome());
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
