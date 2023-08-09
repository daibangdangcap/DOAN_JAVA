/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class CustomButtom extends  JButton{
    private boolean over;
    private Color fill;
    
    private Color fillOriginal;
    private Color fillOver;
    private Color fillClick;
    private int strokeWidth;

    public CustomButtom() {
        fillOriginal=new Color(52,152,219);
        fillOver=new Color(41,128,185);
        fillClick=new Color(211,84,0);
        fill=fillOriginal;
        strokeWidth=2;
        
        setOpaque(false);
        setBorder(null);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBackground(fillOriginal);
        setForeground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(!isOpaque()){
            Graphics2D g2d=(Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s=strokeWidth;
            int w=getWidth()-(2*s);
            int h=getHeight()-(2*s);
            
            g2d.setColor(fill);
            g2d.fillRoundRect(s, s,w, h,h, h);
        }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
