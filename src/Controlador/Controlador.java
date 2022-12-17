/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.GeneroComboBox;
//import Modelo.Paciente;

/**
 *
 * @author Victor
 */
public class Controlador {
//    public static String NombreVacio = "Vacio";
//    public Paciente cadenaPaciente;
//    private Paciente[] pacienteEnlazado;

//    public Paciente getCadenaPaciente() {
//        if(cadenaPaciente == null)
//            cadenaPaciente = new Paciente(NombreVacio, NombreVacio, NombreVacio, NombreVacio, NombreVacio, NombreVacio, NombreVacio, NombreVacio, NombreVacio);
//        return cadenaPaciente;
//    }
//
//    public void setCadenaPaciente(Paciente cadenaPaciente) {
//        this.cadenaPaciente = cadenaPaciente;
//    }
//
//    public Paciente[] getPacienteEnlazado() {
//        return pacienteEnlazado;
//    }
//
//    public void setPacienteEnlazado(Paciente[] pacienteEnlazado) {
//        this.pacienteEnlazado = pacienteEnlazado;
//    }

    public static GeneroComboBox getgeneroCombo(Integer i) {
        return getgeneroCombo(i).values()[i];
    }
}
