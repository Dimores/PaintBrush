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
public class Piramide extends D3 {
    public int xFinal;
    public int yFinal;
    
    /*
        "O volume da pirâmide é calculado pela multiplicação entre a área da 
        base e a altura, dividindo por três."
    */
    @Override
    public float volume(){
        int base = xFinal - super.x;
        int largura = yFinal - super.y;
        
        return altura * base * largura / 3;
    }
    
    public float areaQuadrado(float lado){
        return lado * lado;
    }
    
    public  float areaTriangulo(float base){
        return (base + altura) / 2;
    }
    
    @Override
    public float area(){
        int base = xFinal - super.x;
        
        return areaQuadrado(base) + 4 * areaTriangulo(base);
    }
    
    @Override
    public void desenhar(Graphics g){
        altura = yFinal - super.y;
        
        int tamX = xFinal - x; 
        int tamY = yFinal - y;
        int meioX = x + tamX/2;
        
        int p1X = super.x;
        int p1Y = yFinal;
        
        int p2X = xFinal;
        int p2Y = yFinal;        

        int p3X = xFinal + tamX / 10;
        int p3Y = yFinal - tamY / 10;        

        int p4X = super.x + tamX / 10;
        int p4Y = yFinal - tamY / 10;
        
        int [] baseX = {p1X, p2X, p3X, p4X};
        int [] baseY = {p1Y, p2Y, p3Y ,p4Y};
                        
        int [] t1X = {p1X, meioX ,p2X};
        int [] t1Y = {p1Y, y     ,p2Y};

        int [] t2X = {p2X, meioX ,p3X};
        int [] t2Y = {p2Y, y     ,p3Y};

        int [] t3X = {p3X, meioX ,p4X};
        int [] t3Y = {p3Y, y     ,p4Y};

        int [] t4X = {p4X, meioX ,p1X};
        int [] t4Y = {p4Y, y     ,p1Y};
        
        super.desenhar(g);
                
        //fill
        g.setColor(super.corInterna);
        
        g.fillPolygon(baseX, baseY, 4);
        
        g.fillPolygon(t1X, t1Y, 3);
        g.fillPolygon(t2X, t2Y, 3);
        g.fillPolygon(t3X, t3Y, 3);
        g.fillPolygon(t4X, t4Y, 3);
        
        //draw
        g.setColor(cor);
        
        g.drawPolygon(baseX, baseY, 4); 
        g.drawPolygon(t1X, t1Y, 3);
        g.drawPolygon(t2X, t2Y, 3);
        g.drawPolygon(t3X, t3Y, 3);
        g.drawPolygon(t4X, t4Y, 3);
        
        
    }        
    
}
