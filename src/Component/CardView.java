
package Component;

import Model.Model_card;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import laptrinhjava_doan.DanhMucThietBi;
import laptrinhjava_doan.TrangChu;

/**
 *
 * @author Admin
 */
public class CardView extends javax.swing.JPanel {

    public final Model_card db ;
    private final Timer timer;
    private final Timer timerStop;
    private final CardDescription cardDescription;
    private  int y=140;
    private int speed=3;
    private boolean showing =false;
    
    public CardView(Model_card db) {
        this.db=db;
        initComponents();
        setOpaque(false);
        cardDescription=new CardDescription(db.getTitle(),db.getDescription());
        cardDescription.setLocation(0,y);
        setPreferredSize(new Dimension(150,200));
        cardDescription.setSize(new Dimension(150,150));
        add(cardDescription);
        timer=new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(showing){
                    y-=speed;
                    if(y<=50){
                           y=50;
                           cardDescription.setLocation(0,y);
                           timer.stop();
                    }else{
                           cardDescription.setLocation(0,y);
                    }
                }else{
                    y+=speed;
                    if(y>=140){
                        y=140;
                        cardDescription.setLocation(0,y);
                        timer.stop();
                    }else{
                        cardDescription.setLocation(0,y);
                    }
                }
            }
        });
        timerStop=new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showing=false;
                timerStop.stop();
                timer.start();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                showing=true;
                timerStop.stop();
                timer.start();
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                timerStop.start();
            }
        });
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        Rectangle size=getAutoSize(db.getIcon());
        g2.drawImage(toImage(db.getIcon()), size.x, size.y,size.width,size.height,null);
        
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint=new GradientPaint(0, getHeight(), new Color(39, 64, 139), 0, getHeight()-50, new Color(0,0,0,0));
        g2.setPaint(gradientPaint);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
    }
    
    private Rectangle getAutoSize(Icon image){
        int w=150;
        int h=200;
        int iw=image.getIconWidth();
        int ih=image.getIconHeight();
        double xScale=(double)  w / iw;
        double yScale=(double) h / ih;
        double scale=Math.max(xScale, yScale);
        int width=(int)(scale*iw);
        int height=(int)(scale*ih);
        int x=(w-width)/2;
        int y=(h-height)/2;
        return new Rectangle(new Point(x,y), new Dimension(width,height));
    }
    private Image toImage(Icon icon){
        return((ImageIcon) icon).getImage();
    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
