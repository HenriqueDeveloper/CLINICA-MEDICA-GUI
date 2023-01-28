/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.clinica.model.tabela;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Henrique
 */
public class PintarTabela extends JTable {
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {

        Component component = super.prepareRenderer(renderer, row, column);
        component.setBackground(Color.WHITE);
        component.setForeground(Color.BLACK);

        Object valor = String.valueOf(getValueAt(row, column));
        if (valor.equals("Pago")) {
            component.setBackground(Color.GREEN);
            component.setForeground(Color.BLACK);
           
            
            
        }

        return component;
    }
    
    
}
