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
public class Retangulo extends D2 {
    public int base;
    public int largura;

    
    
    public Retangulo(Color cor, int x, int y, Color corInterna, boolean exibirArea, int base, int largura) {
        super(cor, x, y, corInterna, exibirArea);
        this.base = base;
        this.largura = largura;
    }

    @Override
    public float area() {
        return this.base * this.largura;
    }

    @Override
    public float perimetro() {
        return 2 * (base + largura);
    }
    
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g); // para plotar a area
        g.setColor(corInterna);
        g.fillRect(x,y,base,largura);
        g.setColor(cor);
        g.drawRect(x, x, base, largura);
    }
    
}
