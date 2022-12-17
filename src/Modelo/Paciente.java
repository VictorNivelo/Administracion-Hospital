/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Victor
 */

public class Paciente {
    
    private Integer id;
    private Rol rol;
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String telefono;
    private GeneroComboBox genero;
    private String edad;
    private String molestia;
    private String FechaIngreso;
    private String HoraAtencion;
    
    private Paciente unionPaciente[];
    
    private ArrayList <Paciente> pacienteU;
    
    public Paciente(String identificacionL, String nombresL, String apellidosL, String edadL, GeneroComboBox generoL, String telefonoL, String fechaIngresoL, String horaAtencionL, String molestiasL){
        this.identificacion = identificacionL;
        this.nombres = nombresL;
        this.apellidos = apellidosL;
        this.edad = edadL;
        this.genero = generoL;
        this.telefono = telefonoL;
        this.FechaIngreso = fechaIngresoL;
        this.HoraAtencion = horaAtencionL;
        this.molestia = molestiasL;
        
        this.pacienteU = new ArrayList(); 
    }

    public String getMolestia() {
        return this.molestia;
    }

    public void setMolestia(String molestia) {
        this.molestia = molestia;
    }

    public String getFechaIngreso() {
        return this.FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getHoraAtencion() {
        return this.HoraAtencion;
    }

    public void setHoraAtencion(String HoraAtencion) {
        this.HoraAtencion = HoraAtencion;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEdad() {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public GeneroComboBox getGenero() {
        return this.genero;
    }

    public void setGenero(GeneroComboBox genero) {
        this.genero = genero;
    }

    public Paciente[] getUnionPaciente() {
        return unionPaciente;
    }

    public void setUnionPaciente(Paciente[] unionPaciente) {
        this.unionPaciente = unionPaciente;
    }
    

    @Override
    public String toString() {
        return " identificacion =" + identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", genero=" + genero + ", edad=" + edad + ", molestia=" + molestia + ", FechaIngreso=" + FechaIngreso + ", HoraAtencion=" + HoraAtencion;
    }
 
}
