package com.example.spring_task_security.repository;

import com.example.spring_task_security.entity.User;


public interface UserRepository {

    User getUserByUsername(String name);


}