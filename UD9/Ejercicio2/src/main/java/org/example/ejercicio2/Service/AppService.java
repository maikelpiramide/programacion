package org.example.ejercicio2.Service;

import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.*;
import org.example.ejercicio2.Repository.BookRepository;
import org.example.ejercicio2.Repository.UserCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AppService {
    @Autowired
    private UserCustomRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    public List<BookDto> findAllBooks() {
        ArrayList<BookDto> books = new ArrayList<>();
        bookRepository.findAll().forEach(book -> {
            books.add(bookMapper.toDto(book));
        });
        return books;
    }
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public List<UserDto> findAllUsers() {
        ArrayList<UserDto> users = new ArrayList<UserDto>();
        userRepository.findAll().forEach(user->{
            users.add(userMapper.toDto(user));
        });
        return users;
    }

}
