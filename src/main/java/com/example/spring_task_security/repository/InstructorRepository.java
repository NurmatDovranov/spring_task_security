package com.example.spring_task_security.repository;

import com.example.spring_task_security.entity.Instructor;


import java.util.List;

public interface InstructorRepository {

    void saveInstructor(Long id, Instructor instructor);

    void updateInstructor(Long id,Instructor instructor);

    List<Instructor> getAllInstructor(Long id);

    Instructor getInstructorById(Long id);

    void deleteInstructorById(Long id);

    void assignInstructorToCourse(Long instructorId,Long courseId);
}