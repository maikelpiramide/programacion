package org.example.ejercicio2.Classes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;
    private String editorial;
    private String autor;
    private String idioma;
    private int annoEdicion;
    private int paginas;
    public Book(){}
    public Book(String titulo, String editorial, String autor, String idioma, int annoEdicion, int paginas){
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.idioma = idioma;
        this.annoEdicion = annoEdicion;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", autor='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", annoEdicion=" + annoEdicion +
                ", paginas=" + paginas +
                '}';
    }
}
