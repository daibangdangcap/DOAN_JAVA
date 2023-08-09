/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package action;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

/**
 *
 * @author TIEN THANH
 */
public class viewActionCellEditor extends DefaultCellEditor{
    private viewEvent event;
    public viewActionCellEditor(viewEvent event) {
        super(new JCheckBox());
        this.event=event;
    }
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean blnl, int row, int col)
    {
        ofHD action=new ofHD();
        action.initEvent(event, row);
        action.setBackground(Color.WHITE); 
        return action;
    }
}
