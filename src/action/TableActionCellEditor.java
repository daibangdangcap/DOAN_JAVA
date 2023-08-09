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
import javax.swing.JTextField;

/**
 *
 * @author TIEN THANH
 */
public class TableActionCellEditor extends DefaultCellEditor{
    private TableActionEvent event;
    public TableActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event=event;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean blnl, int row, int col)
    {
        ofLoaiTB action=new ofLoaiTB();
        action.initEvent(event, row);
        action.setBackground(Color.WHITE); 
        return action;
    }
}
