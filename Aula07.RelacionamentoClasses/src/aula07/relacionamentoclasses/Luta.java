package aula07.relacionamentoclasses;

import java.util.Random;

/**
 *
 * @author Prisc
 */
public class Luta {
    //Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
        
    //Metodos Principais
    
    public void  marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())
            && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiado = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            
        }
            
    }
    
    public void lutar(){
        if(this.aprovada){
           System.out.println("### DESAFIADO ###");
           this.desafiado.apresentar();
           System.out.println("### DESAFIANTE ###");
           this.desafiado.apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); // 0 1 2 
            System.out.println("===== RESULTADO DA LUTA =====");
           switch(vencedor){
               case 0:  // Empate
                   System.out.println("Empatou");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
                   
               case 1:  // Desafiado vence
                   System.out.println(this.desafiado.getNome() + " VENCEU");
                   this.desafiado.ganharLuta();
                   this.desafiado.perderLuta();
                   break;
                   
               case 2:  //Desafiante vence 
                   System.out.println(this.desafiante.getNome() + " VENCEU");
                   this.desafiante.ganharLuta();    
                   this.desafiado.perderLuta();
                   break;
           }
            System.out.println("==================");
           
        }else{
            System.out.println("A luta nao pode acontecer");
        }
        
    }
    
    //Metodos Espeicias

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
