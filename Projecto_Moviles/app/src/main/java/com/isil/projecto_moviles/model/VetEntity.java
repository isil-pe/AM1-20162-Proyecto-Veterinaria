package com.isil.projecto_moviles.model;

import java.io.Serializable;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class VetEntity implements Serializable {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String veterinaria;
    private String mascota;
    private int photo;

    public VetEntity(int id, String nombre, String apellido, String email, String telefono, String direccion, String veterinaria, String mascota, int photo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.veterinaria = veterinaria;
        this.mascota = mascota;
        this.photo = photo;
    }

    public VetEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(String veterinaria) {
        this.veterinaria = veterinaria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
