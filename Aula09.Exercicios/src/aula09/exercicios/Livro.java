package aula09.exercicios;

/**
 *
 * @author Priscilla Kusniaruk
 */
public class Livro implements Publicação{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Metodo

    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + "\n autor = " + autor 
                + ", totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual 
                + ", aberto = " + aberto + ", leitor = " + leitor.getNome() 
                + "\n idade = " + leitor.getIdade() + "\n sexo = " + leitor.getSexo() + '}';
    }
    
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    
    //Metodos Especiais
    
    
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String livro) {
        this.titulo = livro;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private boolean getAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        }else{
           this.pagAtual = p; 
        }
        
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    
}
