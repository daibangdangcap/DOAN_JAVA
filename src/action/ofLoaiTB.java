/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author TIEN THANH
 */
public class ofLoaiTB extends javax.swing.JPanel {

    /**
     * Creates new form ofLoaiTB
     */
    public ofLoaiTB() {
        initComponents();
    }
    public void initEvent(TableActionEvent event,int row)
    {
        btnUpdateLoaiTB.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onUpdate(row);
            }
        });
        btnDeleteLoaiTB.addActionListener(new ActionListener(){
           
            @Override
            public void actionPerformed(ActionEvent e) {
                  event.onDelete(row);
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

        actionButton1 = new action.ActionButton();
        btnDeleteLoaiTB = new action.ActionButton();
        btnUpdateLoaiTB = new action.ActionButton();

        btnDeleteLoaiTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-42.png"))); // NOI18N

        btnUpdateLoaiTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pen-42.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUpdateLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDeleteLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateLoaiTB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private action.ActionButton actionButton1;
    private action.ActionButton btnDeleteLoaiTB;
    private action.ActionButton btnUpdateLoaiTB;
    // End of variables declaration//GEN-END:variables
}
