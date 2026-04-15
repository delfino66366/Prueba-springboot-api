package com.example.demo.model;

public class Estudiante {

    private int numeroControl;
    private String nombre;
    private String email;
    private Direccion direccion;
    private String telefono;

    public Estudiante() {}

    public Estudiante(int numeroControl, String nombre, String email, Direccion direccion, String telefono) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getNumeroControl() { return numeroControl; }
    public void setNumeroControl(int numeroControl) { this.numeroControl = numeroControl; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}