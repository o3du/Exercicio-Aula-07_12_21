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
public class Computador {
    private MemoriaRam memRam; //mem = Memória
    private HD hd;
    private Processador processador;
    private PlacaDeVideo pdv; //pdv = Placa de Video

    
    public void imprimirDadosComputador(){
        System.out.println("Quantidade de Memória RAM: "+memRam.getQuantidade());
        System.out.println("Tamanho do HD: "+hd.getTamanho());
        System.out.println("Quantidade de núcleos do processador: "+processador.getQtdeDeNucleos());
        System.out.println("Modelo da Placa de Vídeo: "+pdv.getModelo());
    }
    
    
    public void Computador(){
        memRam = new MemoriaRam();
        hd = new HD();
        processador = new Processador();
        pdv = new PlacaDeVideo();
    }
    
    public Computador(){
        memRam = new MemoriaRam();
        hd = new HD();
        processador = new Processador();
        pdv = new PlacaDeVideo();
    }
    public Computador(int quantidade, int tamanho, int qtdeDeNucleos, String modelo){
        memRam = new MemoriaRam(quantidade);
        hd = new HD(tamanho);
        processador = new Processador(qtdeDeNucleos);
        pdv = new PlacaDeVideo(modelo);
    }
    
    
    
    
    public MemoriaRam getMemRam() {
        return memRam;
    }

    public void setMemRam(MemoriaRam memRam) {
        this.memRam = memRam;
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public PlacaDeVideo getPdv() {
        return pdv;
    }

    public void setPdv(PlacaDeVideo pdv) {
        this.pdv = pdv;
    }
    
    
}
