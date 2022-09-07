package com.example.spring_task_security.service.serviceimpl;

import com.example.spring_task_security.entity.Course;
import com.example.spring_task_security.repository.CourseRepository;
import com.example.spring_task_security.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void saveCourse(Long id, Course course) {
        courseRepository.saveCourse(id,course);
    }

    @Override
    public void updateCourse(Long id,Course course) {
        courseRepository.updateCourse(id,course);
    }

    @Override
    public List<Course> getAllCourse(Long id) {
        return courseRepository.getAllCourse(id);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.getCourseById(id);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteCourseById(id);
    }
}
