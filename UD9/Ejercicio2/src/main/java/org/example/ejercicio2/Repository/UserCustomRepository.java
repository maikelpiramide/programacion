package org.example.ejercicio2.Repository;

import org.example.ejercicio2.Classes.User;

import java.util.List;

public interface UserCustomRepository {

    void save(User usuario);
    void update(User usuario);
    List<User> findAll();
    User getById(int id);
    void deleteBySurname(String apellido);

}
