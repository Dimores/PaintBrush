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
public abstract class D2 extends Ponto {
    public Color corInterna;
    public boolean exibirArea;

    public D2(Color cor, float x, float y, Color corInterna, boolean exibirArea) {
        super(cor, x, y);
        this.corInterna = corInterna;
        this.exibirArea = exibirArea;
    }
    
    public abstract float area();
    public abstract float perimetro();
    
}
