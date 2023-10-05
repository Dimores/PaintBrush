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
public class Retangulo extends D2 {
    public float base;
    public float largura;

    public Retangulo(Color cor, float x, float y, Color corInterna, boolean exibirArea, float base, float largura) {
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
    
}
