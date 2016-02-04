/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author ReSid5
 */
public class Circulo implements Figura, Serializable {
    private int raio;
    private Color corC;
    private Ponto posicaoCirc;

    Circulo(Ponto posicao, int raio, Color corC) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        posicaoCirc = posicao;
        this.raio = raio;
        this.corC = corC;
        
    }
    
    Circulo (int raio){
        this.raio = raio;
    }

    public void Circulo(int x){
    
        this.posicaoCirc.setX(x);
    }

    public int getRaio(){
        return raio;
    }
    
    public void setRaio(){
        this.raio = raio;
    }

    public Color getCor(){
        return corC;
    }
    
    public void setCor(Color corC){
        this.corC = corC;
    }
    
    public Ponto getPosicao(){
    return posicaoCirc;
    }
    
    public void setPosicao(Ponto p){
        this.posicaoCirc = p;
    }


}
