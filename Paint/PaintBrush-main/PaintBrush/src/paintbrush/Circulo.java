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
public class Circulo extends D2 {
    public int raio;
    

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(corInterna);
        g.fillOval(x - raio, y - raio, 2 * raio, 2 * raio);
        g.setColor(cor);
        g.drawOval(x - raio, y - raio, 2 * raio, 2 * raio);
        super.desenhar(g);
    }
    
}
