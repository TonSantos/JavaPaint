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
public class Retangulo implements Figura, Serializable {
    private int largura;
    private int altura;
    private Ponto posicao;
    private Color cor;
    
    public Retangulo(Ponto posicao , int altura , int largura, Color cor){
        this.largura = largura;
        this.altura = altura;
        this.posicao = posicao;
        this.cor = cor;
    }

    Retangulo(int modifiers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getLargura(){
        return largura;
    }
    public int getAltura(){
        return altura;
    }
    
    public void setlargura(){
        this.largura = largura;
    }
    public void setAltura(){
        this.altura = altura;
    }
    
    public Color getCor(){
    return cor;
    }
    
    public Ponto getPosicao(){
    return posicao;
    }

}
