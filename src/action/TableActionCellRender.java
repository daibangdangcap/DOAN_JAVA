/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package action;
import action.ofLoaiTB;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author TIEN THANH
 */
public class TableActionCellRender extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean blnl, int row, int col)
    {
        Component com=super.getTableCellRendererComponent(jtable,o,isSelected,blnl,row,col);
        ofLoaiTB action=new ofLoaiTB();
        action.setBackground(Color.white);
        return action;
    }
}
