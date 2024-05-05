package org.example.ejercicio2.Classes;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String email;
    private LocalDate fechaNacimiento;

    public UserDto(String nombre, String primerApellido, String segundoApellido, String email, LocalDate fechaNacimiento) {

        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
}
