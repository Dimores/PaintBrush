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
public class Circulo extends D2 {
    public float raio;

    public Circulo(Color cor, float x, float y, Color corInterna, boolean exibirArea, float raio) {
        super(cor, x, y, corInterna, exibirArea);
        this.raio = raio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }
    
}
