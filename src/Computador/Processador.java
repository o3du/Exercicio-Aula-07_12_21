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
public class Processador {
    private int qtdeDeNucleos;
    
    public Processador(){
        qtdeDeNucleos=4;//Valor padrão
    }
    public Processador(int qtdeDeNucleos){
        this.qtdeDeNucleos=qtdeDeNucleos;
        //Valor definido por você
    }
    
    
    public int getQtdeDeNucleos() {
        return qtdeDeNucleos;
    }

    public void setQtdeDeNucleos(int qtdeDeNucleos) {
        this.qtdeDeNucleos = qtdeDeNucleos;
    }
    
}
