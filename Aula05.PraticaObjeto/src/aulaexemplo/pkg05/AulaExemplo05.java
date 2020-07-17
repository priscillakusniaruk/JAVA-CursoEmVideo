/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaexemplo.pkg05;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Prisc
 */
public class AulaExemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco p1 = new Banco();
        p1.setNumConta(1111);
        p1.setDono("Rodrigo Freitas");
        p1.abrirConta("cc");
        p1.depositar(100);
        
       
        Banco p2 = new Banco();
        p2.setNumConta(2222);
        p2.setDono("Priscilla Kusniaruk");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);
        p2.sacar(1000);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
