/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhjava_doan;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;

/**
 *
 * @author Admin
 */
public class CustomJTextField extends javax.swing.JTextField{
    private Color fillColor;
    private Color lineColor;
    private int strokeWidth;

    public CustomJTextField() {
        fillColor=Color.WHITE;
        lineColor=Color.BLACK;
        strokeWidth=2;
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(2,10,2,10));
        setBackground(lineColor);
        setForeground(fillColor);
        
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        if(!isOpaque()){
            Graphics2D g2d=(Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            int s=strokeWidth;
            int w=getWidth()-(2*s);
            int h=getHeight()-(2*s);
            
            g2d.setColor(Color.GREEN);
            g2d.fillRoundRect(h, h, WIDTH, HEIGHT, WIDTH, HEIGHT);
            g2d.setStroke(new BasicStroke(s));
            
            g2d.setColor(lineColor);
            g2d.drawRoundRect(s, s, w,h , h, h);
        }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
