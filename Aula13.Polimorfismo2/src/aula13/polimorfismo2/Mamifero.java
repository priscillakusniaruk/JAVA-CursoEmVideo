package aula13.polimorfismo2;

/**
 *
 * @author Priscilla Kusniaruk
 */
public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
