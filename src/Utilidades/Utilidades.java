/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Modelo.GeneroComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Utilidades extends Vista.frmUsuarioIngresarDatos{
    
    //obtener el valor de la clase enum GeneroComboBox
    public static JComboBox cargarComboGenero(JComboBox cbx){
        cbx.removeAllItems();
        for(GeneroComboBox tipo: GeneroComboBox.values()) {
            cbx.addItem(tipo);
        }
        return cbx;
    }
    
    public static GeneroComboBox getComboGenero(JComboBox  cbx){
        return (GeneroComboBox)cbx.getSelectedItem();
    }
    
    public static String Cedula(){
        String NumeroCedula = txtNumeroCedula.getText();
        if(NumeroCedula.length()==10){
            
        }else{
            JOptionPane.showMessageDialog(null, "El numero de cedula esta mal establecido", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        return NumeroCedula;
    }
}
