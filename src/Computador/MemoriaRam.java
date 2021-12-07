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
public class MemoriaRam {
    private int quantidade;

    
    public MemoriaRam(){
        quantidade=32;//Valor padrão
    }
    public MemoriaRam(int quantidade){
        this.quantidade=quantidade;
        //Valor definido por você
    }
        
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.quantidade = Quantidade;
    }
}
