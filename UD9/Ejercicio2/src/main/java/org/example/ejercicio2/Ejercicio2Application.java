package org.example.ejercicio2;

import org.example.ejercicio2.Classes.Book;
import org.example.ejercicio2.Classes.User;
import org.example.ejercicio2.Classes.UserDto;

import org.example.ejercicio2.Classes.UserMapper;
import org.example.ejercicio2.Repository.UserCustomRepository;
import org.example.ejercicio2.Repository.UserCustomRepositoryImplements;
import org.example.ejercicio2.Service.AppService;
import org.example.ejercicio2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Ejercicio2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

    @Autowired
    private UserCustomRepository userCustomRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private AppService appService;
    @Override
    public void run(String... args) throws Exception {

            appService.findAllBooks().forEach(System.out::println);
            appService.findAllUsers().forEach(System.out::println);
            /*Book book = new Book("libro1","edit1","maikel","español",2022,123);
            Book book2 = new Book("libro2","edit2","maikel","español",2020,234);
            Book book3 = new Book("libro3","edit1","maikel","español",2022,543);
            Book book4 = new Book("libro4","edit3","maikel","español",2000,234);
            Book book5 = new Book("libro5","edit2","maikel","español",2021,456);
            Book book6 = new Book("libro6","edit2","maikel","español",2016,456);
            Book book7 = new Book("libro7","edit1","maikel","español",20001,554);
            Book book8 = new Book("libro8","edit3","maikel","español",20005,345);
            Book book9 = new Book("libro9","edit1","maikel","español",20009,34);
            appService.saveBook(book);
            appService.saveBook(book2);
            appService.saveBook(book3);
            appService.saveBook(book4);
            appService.saveBook(book5);
            appService.saveBook(book6);
            appService.saveBook(book7);
            appService.saveBook(book8);
            appService.saveBook(book9);*/



    }
}
