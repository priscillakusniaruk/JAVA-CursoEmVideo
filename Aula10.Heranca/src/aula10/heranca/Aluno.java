package aula10.heranca;

/**
 *
 * @author Prisc
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    //Metodos
    
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada");
        
        //Metodos Especiais
        
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
