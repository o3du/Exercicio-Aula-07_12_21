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
public class Composicao {
    public static void main(String[] args) {
        Computador pc = new Computador();
        Computador pc2 = new Computador(64, 1000, 8, "Nvidia GTX 3090");
        
        System.out.println("--Executando com valores padroes--");
        pc.imprimirDadosComputador();
        System.out.println("");
        System.out.println("--Executando com valores customizados--");
        pc2.imprimirDadosComputador();
    }
}
