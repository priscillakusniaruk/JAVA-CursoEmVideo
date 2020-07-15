/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.objeto;

/**
 *
 * @author Priscilla Kusniaruk
 */
public class Aula02Objeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "BIC Cristal";
       c1.cor = "azul";
       //c1.ponta = 0.5f;
       c1.carga = 80;
       //c1.tampada = true;
       c1.destampar();
       c1.status();
       c1.rabiscar();
       
       
       
    }
    
}
