package com.example.spring_task_security.service;

import com.example.spring_task_security.entity.Course;

import java.util.List;

public interface CourseService {

    void saveCourse(Long id, Course course);

    void updateCourse(Long id,Course course);

    List<Course> getAllCourse(Long id);

    Course getCourseById(Long id);

    void deleteCourseById(Long id);
}
