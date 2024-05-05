package org.example.ejercicio2.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.ejercicio2.Classes.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class BookRepositoryImplements implements BookRepository{
    @PersistenceContext
    private EntityManager em;
    @Override
    @Transactional
    public void save(Book book) {
         em.persist(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        em.remove(book);
    }

    @Override
    @Transactional
    public void update(Book book) {
        em.merge(book);
    }

    @Override
    @Transactional
    public Optional<Book> findById(Long id) {

        return Optional.ofNullable(em.find(Book.class, id));
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return em.createQuery("select b from Book b").getResultList();
    }
}
