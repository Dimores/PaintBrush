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
public abstract class D2 extends Ponto {
    public Color corInterna;
    public boolean exibirArea = false;     
    public boolean exibirPerimetro = false;
    public boolean exibirComprimento = false;
    
    public abstract float area(); // Função abstrata para calcular area
    public abstract float perimetro(); // Função abstrata para calcular o perimetro
    public abstract float comprimento(); // Função abstrata para calcular o comprimento
    
    @Override
    public void desenhar(Graphics g){
        if(exibirArea){
            g.drawString("Área = " + Float.toString(area()), x - 20, y - 20); // Amarramento tardio
        }
        if(exibirPerimetro){
            g.drawString("Perímetro = " + Float.toString(perimetro()), x - 30, y - 30); // Amarramento tardio
        }
        if(exibirComprimento){
            g.drawString("Comprimento = " + Float.toString(comprimento()), x - 40, y - 40); // Amarramento tardio
        }
    }
    
}
