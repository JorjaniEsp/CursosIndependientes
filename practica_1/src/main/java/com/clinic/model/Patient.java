package com.clinic.model;

import java.time.LocalDate;
import java.time.Period;

public class Patient {
    // Identificador único
    private String cedula;

    // Datos personales y clínicos
    private String nombre;
    private LocalDate fechaNacimiento;
    private String genero;
    private String tipoSangre;

    // Datos de contacto
    private String telefono;
    private String correo;
    private String direccion;

    // Estado del expediente
    private boolean activo;

    // Constructor con los 9 atributos base
    public Patient(String cedula, String nombre, LocalDate fechaNacimiento, String genero,
                   String tipoSangre, String telefono,
                   String correo, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.tipoSangre = tipoSangre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.activo = true;
    }


    // getters
    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }

    // getter que devuelve la fecha de nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // getter que calcula la edad dinámicamente cada vez que se llama
    // mientras la fecha de nacimiento no sea nula
    // retornara los años del paciente calculando el periodo desde su nacimiento a la fecha actual y la convierten en años
    public int getEdad() {
        if (fechaNacimiento != null) {
            return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }
        return 0;
    }

    public String getGenero() { return genero; }
    public String getTipoSangre() { return tipoSangre; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }
    public boolean isActivo() { return activo; }

    // setters
    public void setActivo(boolean activo) { this.activo = activo; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

}
