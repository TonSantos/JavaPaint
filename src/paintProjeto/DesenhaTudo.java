/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author DULCI
 */
public class DesenhaTudo extends JPanel{
       ArrayList<Figura> figura = new ArrayList<Figura>();
       ArrayList<Circulo> circulo = new ArrayList<Circulo>();
       ArrayList<Retangulo> retangulo = new ArrayList<Retangulo>();
       ArrayList<Linha> linha = new ArrayList<Linha>();
       Circulo c;
       
       public DesenhaTudo(){
            System.out.println("inicializado sem parametro");
       }
       
    public DesenhaTudo(ArrayList<Figura> figura){
            System.out.println("inicializado com array figura");
            this.figura = figura;
            for(int i=0;i<figura.size();i++){
                if(figura.get(i) instanceof Circulo ){  
                    circulo.add((Circulo)figura.get(i));
                }
                if(figura.get(i) instanceof Retangulo ){  
                    retangulo.add((Retangulo)figura.get(i));
                }
                if(figura.get(i) instanceof Linha ){  
                    linha.add((Linha)figura.get(i));
                }
                
            }
            
       }      
      
      /* addActionListener (           
               new ActionListener() {     
           @Override
           public void actionPerformed(ActionEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               if(e.getSource().equals("botaoCriarCirculo")){
                   figura.add(new Circulo(e.getModifiers()));
               }
               if(e.getSource().equals("botaoCriarRetangulo")){
                   figura.add(new Retangulo(e.getModifiers()));
               }
               if(e.getSource().equals("botaoCriarLinha")){
                   figura.add(new Linha(e.getModifiers()));
               }
                            
                            repaint();
		
           }
           }//fim do metodo interno ActionListener()
       
       );//fim do addActionListener*/

   Graphics grphcs;
    protected void paintComponent(Graphics grphcs) {
       super.paintComponent(grphcs); //limpa area de desenho
        System.out.println("entrei no paintComponent");
        //Circulo c;
        Retangulo r;
        Linha l;
               
        //desenha todos os ponto do array
        for(int i=0;i<figura.size();i++){ 
            
                grphcs.setColor(Color.BLUE);
            if(figura.get(i) instanceof Circulo){
                c = (Circulo)figura.get(i);
                
            //grphcs.fillOval(c.getPosicao().getX(),c.getPosicao().getX(), 2*c.getRaio(), 2*c.getRaio());
                grphcs.fillOval(0,0, 2*c.getRaio(), 2*c.getRaio());
                System.out.println("desenhei "+i+1+" figuras");
            
            }    
            if(figura.get(i) instanceof Retangulo){
                r = (Retangulo)figura.get(i);
            //grphcs.fillRect(r.getPosicao().getX(),r.getPosicao().getX(),r.getLargura(),r.getLargura());
                grphcs.fillRect(0,0,r.getLargura(),r.getLargura());
                System.out.println("desenhei "+i+1+" vezes");
            }  
            if(figura.get(i) instanceof Linha){
                l = (Linha)figura.get(i);
            //grphcs.drawLine(l.getPosicao().getX(), l.getPosicao().getY(), l.getSegPonto().getX(), l.getSegPonto().getY());
                grphcs.drawLine(0, 0, l.getSegPonto().getX(), l.getSegPonto().getY());
            System.out.println("desenhei "+i+1+" figuras");
            }
        }
  
    }
    public void desenhaCirculo(int x,int y,int r1,int r){
        grphcs.fillOval(x,y,2*r1,2*r);
    }
    
}
