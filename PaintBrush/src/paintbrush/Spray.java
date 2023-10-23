/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintbrush;

import java.awt.Graphics;

/**
 *
 * @author diego
 */
public class Spray extends D2 {
   

    
    public int raio= 15;
      
    @Override
           public float area() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }
    public void desenhar (Graphics g){
        g.setColor(cor);
        
        for (int i = 0; i < 100; i++) {
            // Gera uma posição aleatória para o ponto
            int x2 = (int) (x + (int) (Math.random() * raio * 2) - raio );
            int y2 = (int) (y + (int) (Math.random() * raio * 2) - raio);
            
            // Verifica se o ponto está dentro do círculo
             double dist = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));

           if (dist <= raio) {
                // Desenha o ponto
                g.fillOval(x2, y2, 2, 2);
        
    }
      
             
        } 
    }
    


    @Override
    public float perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float comprimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
