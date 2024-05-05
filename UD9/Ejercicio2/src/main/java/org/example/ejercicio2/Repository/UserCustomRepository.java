package org.example.ejercicio2.Repository;

import org.example.ejercicio2.Classes.User;

import java.util.List;
import java.util.Optional;

public interface UserCustomRepository {

    void save(User usuario);
    void update(User usuario);
    List<User> findAll();
    Optional<User> getById(int id);
    void deleteBySurname(String apellido);
    List<User> getByFirstLeterName(String letra);

}
