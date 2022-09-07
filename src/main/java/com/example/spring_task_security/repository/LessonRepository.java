package com.example.spring_task_security.repository;

import com.example.spring_task_security.entity.Lesson;

import java.util.List;

public interface LessonRepository {

    void saveLesson(Long courseId, Lesson lesson);

    void updateLesson(Long id,Lesson lesson);

    List<Lesson> getAllLessons(Long id);

    Lesson getLessonById(Long id);

    void deleteLessonById(Long id);
}