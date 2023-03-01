/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio;

/**
 *
 * @author eduar
 */
public class Monitor {
    String modelo;
    String cor;
    double polegada;
    String tela;
    boolean situacao;
    
    void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Polegada " + polegada);
        System.out.println("Tela: " + tela);
        }
    
    void imagem(){
        if(this.situacao == true){
            System.out.println("Meu monitor está ligado...");
        }else {
            System.out.println("Meu monitor está desligado.");
        }
    }
    
    void ligar(){
        this.situacao = true;
    }
    
    void desligar(){
        this.situacao = false;
    }
    
}
