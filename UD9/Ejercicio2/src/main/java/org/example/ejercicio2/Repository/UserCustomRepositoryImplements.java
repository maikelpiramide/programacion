package org.example.ejercicio2.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> getById(int id) {

        return Optional.ofNullable((User) entityManager.createQuery("select e from User e where e.id = " + id));
    }

    @Override
    public void deleteBySurname(String apellido) {

    }
}
