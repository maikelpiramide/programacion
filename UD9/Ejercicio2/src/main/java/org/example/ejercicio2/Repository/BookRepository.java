package org.example.ejercicio2.Repository;

import org.example.ejercicio2.Classes.Book;


import java.util.List;
import java.util.Optional;

public interface BookRepository{
    void save(Book book);
    void delete(Book book);
    void update(Book book);
    Optional<Book> findById(Long id);
    List<Book> findAll();
}
