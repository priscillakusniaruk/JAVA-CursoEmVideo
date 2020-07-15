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

/* Classe criada 

*/
public class Caneta {
    
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    private boolean tampada;

    /* Metodos criado
    
    */
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tapada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Destampe a caneta");
            
        }else {
            System.out.println("Pode rabiscar");
        }
    }
    
    public void tampar(){
        this.tampada = true;
        }
    
    public void destampar (){
        this.tampada = false;
    }
}

