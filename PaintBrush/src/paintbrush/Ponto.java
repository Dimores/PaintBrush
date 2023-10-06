/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author diego
 */
public class Ponto {
    public Color cor;
    public int x, y;
    
    public Ponto(){
        
    }

    // Construtor com todos os parametros
    public Ponto(Color cor, int x, int y){
        this.cor = cor;
        this.x = x;
        this.y = y;
    }
    
    public void desenhar(Graphics g){
        g.setColor(cor); // Setando a cor do ponto
        g.drawLine(x, y, x, y); // A reta começa no mesmo ponto que acaba.
    }
}
