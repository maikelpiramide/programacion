package org.example.ejercicio2.Classes;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private long id;

    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="primer_apellido",nullable = false)
    private String primerApellido;
    @Column(name="segundo_apellido",nullable = false)
    private String segudoApellido;
    @Column(name="token",nullable = false)
    private String token;
    @Column(name="email",nullable = false,unique = true)
    private String email;
    @Column(name="fecha_nacimiento",nullable = false)
    private LocalDate fechaNaciento;

    public User(){}

    public User(String nombre, String primerApellido, String segudoApellido, String token, String email, LocalDate fechaNaciento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segudoApellido = segudoApellido;
        this.token = token;
        this.email = email;
        this.fechaNaciento = fechaNaciento;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegudoApellido() {
        return segudoApellido;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNaciento() {
        return fechaNaciento;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segudoApellido='" + segudoApellido + '\'' +
                ", token='" + token + '\'' +
                ", email='" + email + '\'' +
                ", fechaNaciento=" + fechaNaciento +
                '}';
    }
}
