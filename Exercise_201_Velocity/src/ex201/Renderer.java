package ex201;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Renderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        int col = table.convertColumnIndexToModel(column);
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

       

        if (col == 5) {
            
            
            
            if (Integer.parseInt(value.toString())>30) {
                        setBackground(Color.red);
                                                         } 
            else 
                if (Integer.parseInt(value.toString())<=30 && Integer.parseInt(value.toString())>20) {
                            setBackground(Color.orange);
                                                                                                         } 
                else 
                    if (Integer.parseInt(value.toString())<=20 && Integer.parseInt(value.toString())>10) {
                             setBackground(Color.yellow);
                                                                                                             } 
                    else 
                        if (Integer.parseInt(value.toString())<=10) {
                                setBackground(Color.blue);
                                                                      }
                      
        
                        }
        
        
        
        else {
            setBackground(Color.white);
             }

        
        
        if (isSelected) 
        {
            setForeground(Color.black);
            setBackground(Color.green);
        }

        return comp;
    }

}
