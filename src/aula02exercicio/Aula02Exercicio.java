/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02exercicio;

import com.sun.javafx.iio.ImageMetadata;

/**
 *
 * @author eduar
 */
public class Aula02Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Monitor m = new Monitor();
    m.modelo = "Samsung";
    m.cor = "Preto";
    m.polegada = 17;
    m.tela = "Led";
    m.situacao = true;
    
    m.status();
    m.ligar();
    m.imagem();
    
    Agenda ag = new Agenda();
    ag.acordar = "Levanto";
    ag.ler = "Leio uma publicação";
    ag.cafe = "Tomo café";
    ag.trabalho = true;
    ag.descanso = true;
    
    ag.status();
    ag.trabalho();
    ag.escritorio();
    ag.descanso(); 
    //ag.descanso();
    //ag.Descansar();
    
    }
    
}
