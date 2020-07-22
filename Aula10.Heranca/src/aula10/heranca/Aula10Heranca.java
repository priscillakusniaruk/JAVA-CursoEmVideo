package aula10.heranca;

/**
 *
 * @author Prisc
 */
public class Aula10Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Rodrigo");
        
        p1.setSexo("M");
        p4.setSexo("M");
        p2.setIdade(18);
        
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //p1.receberAum(550.2f);
        //p2.mudarTrabalho();
        //p4.cancelarMatricula();
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
