/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Poligono extends Ponto {
    public ArrayList<Ponto> lstPontos;
    public int[] pontosX;
    public int[] pontosY;

    public Color corInterna;

    Ponto ponto;
    
    public Poligono() {
        lstPontos = new ArrayList();
    }
    
    public void adicionarPonto(int x, int y){
        ponto = new Ponto(x,y);
        lstPontos.add(ponto);
    }
    
    public void removerTodosPontos() {
       lstPontos.removeAll(lstPontos);
       lstPontos.clear();
    }
    
    @Override
    public void desenhar(Graphics g){
        pontosX = new int[lstPontos.size()];
        pontosY = new int[lstPontos.size()];
        for(int i =0; i<lstPontos.size(); i++){
            pontosX[i] = lstPontos.get(i).x;
            pontosY[i] = lstPontos.get(i).y;
        }
        for(int i =0;i<lstPontos.size();i++){
            g.setColor(corInterna);
            g.fillPolygon(pontosX, pontosY,lstPontos.size());
            g.setColor(cor);
            g.drawPolygon(pontosX, pontosY,lstPontos.size());
            
            
            
        }
        removerTodosPontos();
    }
    
    
    
}
