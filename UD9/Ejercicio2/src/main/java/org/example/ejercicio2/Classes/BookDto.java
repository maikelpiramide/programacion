package org.example.ejercicio2.Classes;

import lombok.Data;

@Data
public class BookDto {
    private String titulo;
    private String autor;
    private String idioma;
    private int paginas;

    public BookDto(String titulo, String autor, String idioma, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
