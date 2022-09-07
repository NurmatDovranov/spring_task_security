package com.example.spring_task_security.repository.repositoryimpl;

import com.example.spring_task_security.entity.User;
import com.example.spring_task_security.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public
class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User getUserByUsername(String name) {
        return entityManager.createQuery("select u from User u where u.username =: name", User.class)
                .setParameter("name", name).getSingleResult();
    }
}
