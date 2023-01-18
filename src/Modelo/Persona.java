/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author Victor
 */
public class Persona {

    // Rol: Medico, Paciente, Enfermera
    private Rol rol;
    // Identificador único
    private String identificacion;
    // Informacion personal
    private String nombres;
    private String apellidos;
    private String genero;
    private String telefono;
    private String direccion;
    private Date fechaNacimiento;
    private Integer edad;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEdad() {
        if (this.fechaNacimiento == null) {
            this.edad = null;
        } else {
            Integer anio_actual = Year.now().getValue();
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/Bogota"));
            calendar.setTime(this.fechaNacimiento);
            int anioNacimiento = calendar.get(Calendar.YEAR);
            this.edad = anio_actual - anioNacimiento;
        }

        return this.edad;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        boolean cedulaValida = validarCedula(identificacion);
        
        if(!cedulaValida) throw new Error("Cédula no válida");
        
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento.toString();
    }

    public void setFechaNacimiento(Integer anio, Integer mes, Integer dia) {
        this.fechaNacimiento = new GregorianCalendar(anio, mes - 1, dia).getTime();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean validarCedula(String cedula){
        // por ahora solo valida que sea una cadena de 10 dígitos
        return cedula.matches("\\d{10}");
    }
    
    public boolean esMedico(){
        if(this.rol == null) return false;
        
        return "Medico".equals(this.rol.getNombre());
    }
    
    public boolean esEnfermera(){
        if(this.rol == null) return false;
        
        return "Enfermera".equals(this.rol.getNombre());
    }
}
