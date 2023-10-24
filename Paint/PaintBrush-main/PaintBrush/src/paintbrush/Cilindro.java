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
public class Cilindro extends D3 {
        
    public int raio;

    public Cilindro(Color cor, int x, int y) {
        super(cor, x, y);
    }

    
    @Override
    public void desenhar(Graphics g){
        
        
        g.setColor(cor);
        int raioBase = raio;
        int alturaCilindro = (int) altura;
        g.fillOval(x, y, raioBase * 2, raioBase * 2);

        // Desenha um retângulo com altura igual à altura do cilindro e largura igual ao comprimento da circunferência da base do cilindro
        int larguraRetangulo = (int) Math.round(2 * Math.PI * raioBase);
        g.fillRect(x-larguraRetangulo/2, y-alturaCilindro/2, larguraRetangulo, alturaCilindro);
        
    }
    

    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
