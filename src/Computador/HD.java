/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computador;

/**
 *
 * @author IFSC
 */
public class HD {
    private int tamanho;

    public HD(){
        tamanho=500;//Valor padrão
    }
    public HD(int tamanho){
        this.tamanho=tamanho;
        //Valor definido por você
    }
    
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
