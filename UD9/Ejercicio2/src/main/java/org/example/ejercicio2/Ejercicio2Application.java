package org.example.ejercicio2;

import org.example.ejercicio2.Classes.User;
import org.example.ejercicio2.Repository.UserCustomRepository;
import org.example.ejercicio2.Repository.UserCustomRepositoryImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class Ejercicio2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Application.class, args);
    }

    @Autowired
    private UserCustomRepository userCustomRepository;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("programa cargado");
        System.out.println();

        /*User user1 = new User("juan","garcia","garcia","1234","gjuan@gmail.com", LocalDate.of(2000,3,23));

        User user2 = new User("pedro","garcia","gimenez","1234","pedrog@gmail.com", LocalDate.of(2000,3,23));

        User user3 = new User("maria","lopez","garcia","1234","marial@gmail.com", LocalDate.of(2000,3,23));

        User user4 = new User("mariano","calle","lacasa","1234","marianoc@gmail.com", LocalDate.of(2000,3,23));

        User user5 = new User("jaime","primero","aragon","1234","jaimep@gmail.com", LocalDate.of(2000,3,23));

        userCustomRepository.save(user1);
        userCustomRepository.save(user2);
        userCustomRepository.save(user3);
        userCustomRepository.save(user4);
        userCustomRepository.save(user5);*/

        System.out.println("usuarios cargados en la base de datos");
        System.out.println();
        System.out.println("------------ Mostrar usuarios ------------");
        userCustomRepository.findAll().stream().forEach(usuario-> System.out.println(usuario));
        System.out.println();
        System.out.println("---------- mod users ------------");
        Optional<User> usermod1 = userCustomRepository.getById(1);
        usermod1.ifPresent(user ->{
            user.setNombre("juanmod");
            userCustomRepository.update(user);
        });

        System.out.println("zona que peta");
        Optional<User> userMod2 = userCustomRepository.getById(2);

        userMod2.ifPresentOrElse((user)->{
            user.setNombre("juanmod2");
            userCustomRepository.update(user);
        },()->{
            System.out.println("el id del usuario no existe");
        });

        System.out.println(usermod1);

    }
}
