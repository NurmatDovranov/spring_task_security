package com.example.spring_task_security.repository;

import com.example.spring_task_security.entity.Student;

import java.util.List;

public interface StudentRepository {

    void saveStudent(Long id, Student student);

    void updateStudent(Long id,Student student);

    List<Student> getAllStudents(Long id);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

    void assignStudentToCourse(Long studentId,Long courseId);
}