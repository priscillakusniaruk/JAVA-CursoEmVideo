package aulaexemplo.pkg05;

/**
 *
 * @author Priscilla Kusniaruk
 */
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
        
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo() == "cc"){
            this.setSaldo(50f);
            
        } else if(this.getTipo() == "cp"){
            this.setSaldo(150f);
            
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() != 0) {
            System.out.println("Você possui debitos ou creditos. Verifique sua conta");
            
        }else{
            this.setStatus(false);
            System.out.println("CONTA FECHADA COM SUCESSO");
            
        }
    }
    
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    
    public void sacar(float s){
        if(this.getStatus() == true && this.getSaldo() >= s){
            this.setSaldo(this.getSaldo() - s);
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Impossivel sacar");
        }
        
    }
    
    public void mensalidade(){
        float m = 0;
        if (this.getTipo() == "CC"){
            m = 12;
        } else if(this.getTipo() == "CP"){
            m = 20;
        }
        
        if(this.getStatus()== true){
            if(this.getSaldo() >= m){
                setSaldo(this.getSaldo() - m);
                System.out.println("Mensalidade paga com sucesso");
            }else{
                System.out.println("Saldo insuficiente");
            }
            
        }else{
            System.out.println("Immpossivel de pagar");
        }
    } 
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean stu) {
        this.status = stu;
    }
    
    
    
    
    
}
