package com.distribuida.model;

public class Cliente {

    // Atributos
    private int idCliente;
    private String cedula;
    private String nombre;
    private String apellido;
    private String dirreccion;
    private String telofono;
    private String correo;

    // Constructor Vacio
    public Cliente( ) { }

    // Constructor con parametros
    public Cliente(int idCliente, String cedula, String nombre, String apellido, String dirreccion, String telofono, String correo) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirreccion = dirreccion;
        this.telofono = telofono;
        this.correo = correo;
    }

    // Metodos getters and setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getTelofono() {
        return telofono;
    }

    public void setTelofono(String telofono) {
        this.telofono = telofono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                ", telofono='" + telofono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }



}
