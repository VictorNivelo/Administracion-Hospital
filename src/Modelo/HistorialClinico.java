/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Victor
 */
public class HistorialClinico {
    private String identificacionA;
    private String nombresA;
    private String apellidosA;
    private String telefonoA;
    private String generoA;
    private String edadA;
    private String molestiaA;
    private String FechaIngresoA;
    private String HoraAtencionA;
    private String MedicamentoA;
    private String DosisA;
    
    public HistorialClinico(String identificacionA, String nombresA,String apellidosA,String edadA,String generoA, String telefonoA,String molestiaA, String FechaIngresoA, String HoraAtencionA, String MedicamentoA, String DosisA) {
        
        this.identificacionA = identificacionA;
        this.nombresA = nombresA;
        this.apellidosA = apellidosA;
        this.edadA = edadA;
        this.generoA = generoA;
        this.telefonoA = telefonoA;
        this.molestiaA = molestiaA;
        this.FechaIngresoA = FechaIngresoA;
        this.HoraAtencionA = HoraAtencionA;
        this.MedicamentoA = MedicamentoA;
        this.DosisA = DosisA;

    }

    public String getIdentificacionA() {
        return identificacionA;
    }

    public void setIdentificacionA(String identificacionA) {
        this.identificacionA = identificacionA;
    }

    public String getNombresA() {
        return nombresA;
    }

    public void setNombresA(String nombresA) {
        this.nombresA = nombresA;
    }

    public String getApellidosA() {
        return apellidosA;
    }

    public void setApellidosA(String apellidosA) {
        this.apellidosA = apellidosA;
    }

    public String getTelefonoA() {
        return telefonoA;
    }

    public void setTelefonoA(String telefonoA) {
        this.telefonoA = telefonoA;
    }

    public String getGeneroA() {
        return generoA;
    }

    public void setGeneroA(String generoA) {
        this.generoA = generoA;
    }

    public String getEdadA() {
        return edadA;
    }

    public void setEdadA(String edadA) {
        this.edadA = edadA;
    }

    public String getMolestiaA() {
        return molestiaA;
    }

    public void setMolestiaA(String molestiaA) {
        this.molestiaA = molestiaA;
    }

    public String getFechaIngresoA() {
        return FechaIngresoA;
    }

    public void setFechaIngresoA(String FechaIngresoA) {
        this.FechaIngresoA = FechaIngresoA;
    }

    public String getHoraAtencionA() {
        return HoraAtencionA;
    }

    public void setHoraAtencionA(String HoraAtencionA) {
        this.HoraAtencionA = HoraAtencionA;
    }

    public String getMedicamentoA() {
        return MedicamentoA;
    }

    public void setMedicamentoA(String MedicamentoA) {
        this.MedicamentoA = MedicamentoA;
    }

    public String getDosisA() {
        return DosisA;
    }

    public void setDosisA(String DosisA) {
        this.DosisA = DosisA;
    }
    
    
    
    
}
