/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;
import javax.swing.JPanel;
/**
 *
 * @author SANTOS
 */
public class Linha implements Figura, Serializable{
    private Ponto primePonto;
    private Ponto segPonto;
    private Color cor;
    
    
    public Linha(Ponto ini, Ponto fim, Color cor){
        primePonto = ini;
        segPonto = fim;
        this.cor = cor;
        System.out.println("uma linha foi gerada");
    }


    public Ponto getPosicao() {
        return primePonto;
    }
    public Ponto getSegPonto() {
        return segPonto;
    }

    public void setPrimePonto(Ponto primePonto) {
        this.primePonto = primePonto;
    }
    public void setSegPonto(Ponto segPonto) {
        this.segPonto = segPonto;
    }
    
    public Color getCor(){
    return cor;
    }
    
    
    
}
