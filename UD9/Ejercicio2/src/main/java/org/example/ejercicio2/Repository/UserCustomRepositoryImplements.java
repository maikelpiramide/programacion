package org.example.ejercicio2.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.User;
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
    @Transactional
    public List<User> findAll() {
        return entityManager.createQuery("select u from User u")
                .getResultList();
    }

    @Override
    public Optional<User> getById(int id) {
        User usuario = (User) entityManager.createQuery("select e from User e where e.id = :id")
                .setParameter("id",id)
                .getResultList();
        return Optional.ofNullable(usuario);

    }

    @Override
    public void deleteBySurname(String apellido) {

    }
}
