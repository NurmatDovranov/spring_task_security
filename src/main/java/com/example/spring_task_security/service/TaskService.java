package com.example.spring_task_security.service;

import com.example.spring_task_security.entity.Task;
import java.util.List;

public interface TaskService {
    void saveTask(Long lessonId, Task task);

    void updateTask(Long id,Task task);

    Task getTaskById(Long id);

    List<Task> getAllTasks(Long id);

    void deleteTaskById(Long id);
}
