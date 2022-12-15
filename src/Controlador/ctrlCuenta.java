/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GeneroComboBox;

/**
 *
 * @author Victor
 */
public class ctrlCuenta {
    
    public static GeneroComboBox getgeneroCombo(Integer i) {
        return getgeneroCombo(i).values()[i];
    }
}
