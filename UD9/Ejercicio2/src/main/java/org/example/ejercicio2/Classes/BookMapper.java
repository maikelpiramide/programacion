package org.example.ejercicio2.Classes;

import lombok.Data;
import org.springframework.stereotype.Component;
@Component
public class BookMapper {

    public static BookDto toDto(Book book){
        if(book == null){
            return null;
        }
        return new BookDto(book.getTitulo(),book.getAutor(),book.getIdioma(),book.getPaginas());
    };
}
