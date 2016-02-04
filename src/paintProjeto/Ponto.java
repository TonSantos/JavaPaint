/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;

import java.io.Serializable;

/**
 *
 * @author DULCI
 */
public class Ponto implements  Serializable {
    private int x;
    private int y;
    
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public Ponto(int x) {
       this(x,x);
    }

    public Ponto() {
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setPonto (Ponto p) {
    this.setX(p.x);
    this.setY(p.y);
    }
    
    
    
    
    
    
}
