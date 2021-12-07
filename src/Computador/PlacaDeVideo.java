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
public class PlacaDeVideo {
    private String modelo;
    
    public PlacaDeVideo(){
        modelo="Nvidia Geforce 1080";//Modelo padrão
    }
    public PlacaDeVideo(String modelo){
        this.modelo=modelo;
        //Modelo definido por você
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
