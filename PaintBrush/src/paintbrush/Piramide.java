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
public class Piramide extends D3 {
    public float base;
    public float altura;

    public Piramide(Color cor, float x, float y, float base, float altura) {
        super(cor, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
