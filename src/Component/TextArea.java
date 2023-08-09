/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Component;

import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import javax.swing.JTextArea;

/**
 *
 * @author Admin
 */
public class TextArea extends JTextArea{
    public TextArea(){
        setEditable(false);
        setFocusable(false);
        setWrapStyleWord(true);
        setLineWrap(true);
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
    }

    @Override
    public void addNotify() {
    }
    
}
