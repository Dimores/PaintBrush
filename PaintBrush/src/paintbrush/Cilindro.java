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
public class Cilindro extends D3 {
    public float altura;

    public Cilindro(Color cor, float x, float y, float altura) {
        super(cor, x, y);
        this.altura = altura;
    }

    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
