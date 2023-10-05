/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Poligono extends Ponto {
    public ArrayList<Ponto> lst; 

    public Poligono(Color cor, float x, float y) {
        super(cor, x, y);
    }
    
    @Override
    public void desenhar(){
        // Desenhar o ponto aqui 
    }
    
}
