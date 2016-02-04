/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author DULCI
 */
public class desenhaC extends JPanel{
    private int contPontos = 0; //contador de numero de Pontos 
    private Point[] pontos = new Point[10000]; //array com dez mil pontos
    ArrayList<Figura> figuras = new ArrayList<Figura>(); 
    Color cx = new Color(0);
    
    public desenhaC(){
        this.setBackground(Color.white);
    //trata evento demovimento de mouse no frame
        addMouseMotionListener(
                
                new MouseMotionAdapter(){ //classe interna anomina
                    //armazena coordenadas de arrastar e repinta
                   public void mouseDragged(MouseEvent evento){
                       if (contPontos < pontos.length){
                           pontos[contPontos] = evento.getPoint(); //localiza ponto
                           contPontos++; //incrementa numero de pontos no array
                           repaint(); //repita o frame
                        } //fim do if
                    }//fim do mouseDragged
                }//fim de MouseMotionAdapter
        );//fim de addMouseMotionListener
    
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("ÁREA DE DESENHO",320,176);
    }
    public void desenhoCirculo(Ponto Posicao,int raio, Color cor){
        //System.out.println("fui chamado");
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.setColor(cor);
        //g2d.drawOval(Posicao.getX(), Posicao.getY(), 2*raio, 2*raio);
        g2d.fillOval(Posicao.getX(), Posicao.getY(), 2*raio, 2*raio);
        figuras.add(new Circulo(Posicao,raio,cor));
        
    }
    
    public void desenhoRetangulo (Ponto posicao, int altura , int largura, Color cor){
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.setColor(cor);
        g2d.fillRect(posicao.getX(), posicao.getY(), altura, largura);
        figuras.add(new Retangulo(posicao,altura,largura,cor));
    }
    
    public void desenhoLinha (Ponto posicaoIni, Ponto posicaoFim, Color cor){
        Graphics2D g2d = (Graphics2D) this.getGraphics();
        g2d.setColor(cor);
        g2d.drawLine(posicaoIni.getX(), posicaoIni.getY(), posicaoFim.getX(),posicaoFim.getY());
        //figuras.add(new Linha(posicaoIni, posicaoFim, cor));
        figuras.add(new Linha(posicaoIni, posicaoFim, cor));
    }
    
    public void definirCor(Color cx){
        this.cx = cx;
    }
     public void paintComponent(Graphics g){
        super.paintComponent(g); //limpa area de desenho
        //desenha todos os ponto do array
        
        for(int i=0;i<contPontos;i++){
          
            g.setColor(cx);
            g.fillOval(pontos[i].x, pontos[i].y, 9,10 );
        }
        for(int i=0;i<figuras.size();i++){
            if(figuras.get(i) instanceof Circulo){
                Circulo c = (Circulo)figuras.get(i);
                g.setColor(c.getCor());
                g.fillOval(c.getPosicao().getX(),c.getPosicao().getX(), 2*c.getRaio(), 2*c.getRaio());
              //g.drawOval(c.getPosicao().getX(),c.getPosicao().getX(), 2*c.getRaio(), 2*c.getRaio());
            }    
            if(figuras.get(i) instanceof Retangulo){
               Retangulo r = (Retangulo)figuras.get(i);
                g.fillRect(r.getPosicao().getX(),r.getPosicao().getX(),r.getLargura(),r.getLargura());   
            }  
            if(figuras.get(i) instanceof Linha){
                Linha l = (Linha)figuras.get(i);
                g.drawLine(l.getPosicao().getX(), l.getPosicao().getY(), l.getSegPonto().getX(), l.getSegPonto().getY());   
            }
        }
    }  
}
