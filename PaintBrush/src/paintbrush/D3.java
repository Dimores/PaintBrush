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
public abstract class D3 extends Ponto {
    public Color corInterna;
    public int altura;
    public boolean mostrarArea = false;
    public boolean mostrarVolume = false;

    
    public abstract float volume();
    public abstract float area();

    @Override
    public void desenhar(Graphics g) {
        if (mostrarArea) {
            g.setColor(cor);
            g.drawString("Área: " + Float.toString(area()), x-20, y-20);
       }
        if (mostrarVolume) {
            g.setColor(cor);
            g.drawString("Volume: " + Float.toString(volume()), x - 10, y - 10);
       }      
    }
}
