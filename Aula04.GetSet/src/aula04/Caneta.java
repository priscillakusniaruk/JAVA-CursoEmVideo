package aula04;

/**
 *
 * @author Prisc
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    private boolean tampada;
    
    public Caneta (String m, String c, float p){  //Este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta (float p){
        this.ponta = p;
    }
    
    public void status (){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void setCor (String c){
        this.cor = c;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar (){
        this.tampada = false;
    }
}
