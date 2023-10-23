/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sqrt;

/**
 *
 * @author diego
 */
public class Reta extends Ponto {
    public int xFinal;
    public int yFinal;
    
    public boolean mostrarComprimento;
    
    public Reta(){
        
    }
    
    public Reta(Color cor, int x, int y, int xFinal, int yFinal) {
        super(cor, x, y);
        this.xFinal = xFinal;
        this.xFinal = yFinal;
    }
    
    @Override
    public void desenhar(Graphics g){
        // Desenhando a reta
        g.setColor(cor);
        g.drawLine(x, y, xFinal, yFinal);
        if(mostrarComprimento){
            g.drawString("Comprimento = " + Double.toString(comprimento()), x - 40, y - 40); // Amarramento tardio
        }
    }
    
    public double comprimento(){
        int a = (this.xFinal - super.x)^2;
        int b = (this.yFinal - super.y)^2;   
        return sqrt(a + b);
    }
    
}
