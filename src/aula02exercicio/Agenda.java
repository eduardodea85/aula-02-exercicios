/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio;

import java.io.PrintStream;

/**
 *
 * @author eduar
 */
public class Agenda {
    String acordar;
    String ler;
    String cafe;
    boolean trabalho;
    boolean descanso;
    
    void status(){
        System.out.print("Quando eu acordo, " + acordar);
        System.out.print(" depois eu " + ler);
        System.out.print(" ,ai " + cafe + ".");
        
        
        //System.out.print(" , e por fim depois de um dia cansativo, decido que vou " +  + ".");
        
        
    }
    
    void trabalho(){
        if(this.trabalho = true){
            System.out.println("depois disso decido que vou trabalhar no escritório...");
        }else{
            System.out.println("depois disso decido que vou trabalhar em home-office.");
        }
    }
    
    void escritorio(){
        this.trabalho = true;
    }
    
    void emcasa(){
        this.trabalho = false;
    }
    
    void descanso(){
        if(this.descanso = true){
            System.out.println(" Por fim, vou descansar...");
        }else{
            System.out.println(" Por fim, ainda vou trabalhar remoto");
        }
    }
    
    void descansar(){
        this.descanso = true;
    }
    
    void remoto(){
        this.descanso = false;
    }
}

