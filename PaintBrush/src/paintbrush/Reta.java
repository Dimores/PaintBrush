/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class Reta extends Ponto {
    public int xFinal;
    public int yFinal;
    
    public Reta(Color cor, int x, int y, int xFinal, int yFinal) {
        super(cor, x, y);
        this.xFinal = xFinal;
        this.xFinal = yFinal;
    }
    
    public void desenhar(){
        // Desenhar o ponto aqui ok?
    }
    
}
