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
    public float xFinal;
    public float yFinal;
    
    public Reta(Color cor, float x, float y, float xFinal, float yFinal) {
        super(cor, x, y);
        this.xFinal = xFinal;
        this.xFinal = yFinal;
    }
    
    @Override
    public void desenhar(){
        // Desenhar o ponto aqui ok?
    }
    
}
