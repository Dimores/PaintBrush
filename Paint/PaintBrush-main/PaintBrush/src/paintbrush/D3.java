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
public abstract class D3 extends Ponto {
    public float altura;

    public D3(Color cor, int x, int y) {
        super(cor, x, y);
    }
    
    public abstract float volume();


    
}
