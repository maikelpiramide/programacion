package org.example.ejercicio2.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserCustomRepositoryImplements implements UserCustomRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void save(User usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public void update(User usuario) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public void deleteBySurname(String apellido) {

    }
}
