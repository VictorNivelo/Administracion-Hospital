/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class Medico extends Persona {

    private Especialidad especidalidad;

    public Especialidad getEspecidalidad() {
        return especidalidad;
    }

    public void setEspecidalidad(Especialidad especidalidad) {
        this.especidalidad = especidalidad;
    }

    @Override
    public String toString() {
        return this.especidalidad == null ? this.especidalidad.getNombre() : "No definido";
    }

}
