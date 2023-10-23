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
    public int X2;
    public int Y2;
    
    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void desenhar(Graphics g) {
        altura = Y2 - super.y; // Calcula a altura do cilindro com base nas coordenadas Y.
        int base = X2 - super.x; // Calcula a largura da base do cilindro com base nas coordenadas X.
        super.desenhar(g); // Chama o método desenhar da classe pai (D3).

        // Desenho do retângulo lateral
        g.setColor(super.corInterna); // Define a cor interna do cilindro.
        g.fillRect(super.x, super.y, base, altura); // Desenha um retângulo preenchido para representar o corpo do cilindro.
        g.setColor(cor); // Define a cor das bordas do cilindro.
        g.drawRect(super.x, super.y, base, altura); // Desenha o contorno do retângulo.

        // Desenho do topo do cilindro
        g.setColor(super.corInterna); // Define a cor interna do topo do cilindro.
        g.fillOval(super.x, super.y - (altura) / 10, raio * 2, 2 * (altura) / 12); // Desenha uma elipse preenchida para representar o topo do cilindro.
        g.setColor(super.cor); // Define a cor das bordas do topo do cilindro.
        g.drawOval(super.x, super.y - (altura) / 10, raio * 2, 2 * (altura) / 12); // Desenha o contorno do topo do cilindro.

        // Desenho da base do cilindro
        g.setColor(super.corInterna); // Define a cor interna da base do cilindro.
        g.fillOval(super.x, super.y + altura - altura / 10, raio * 2, 2 * (altura) / 12); // Desenha uma elipse preenchida para representar a base do cilindro.
        g.setColor(super.cor); // Define a cor das bordas da base do cilindro.
        g.drawOval(super.x, super.y + altura - altura / 10, raio * 2, 2 * (altura) / 12); // Desenha o contorno da base do cilindro.
    }
    
}
