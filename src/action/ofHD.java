/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import laptrinhjava_doan.TrangChu;

/**
 *
 * @author TIEN THANH
 */
public class ofHD extends javax.swing.JPanel {

    /**
     * Creates new form ofHD
     */
    public ofHD() {
        initComponents();
    }
    public void initEvent(viewEvent event,int row)
    {
        btnView.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onView(row);
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnView = new javax.swing.JButton();

        btnView.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-view-30.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnView)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnView)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    // End of variables declaration//GEN-END:variables
}