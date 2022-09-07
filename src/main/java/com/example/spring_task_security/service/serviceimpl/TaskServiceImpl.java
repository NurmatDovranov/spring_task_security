package com.example.spring_task_security.service.serviceimpl;

import com.example.spring_task_security.entity.Task;
import com.example.spring_task_security.repository.TaskRepository;
import com.example.spring_task_security.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void saveTask(Long lessonId, Task task) {
        taskRepository.saveTask(lessonId,task);
    }

    @Override
    public void updateTask(Long id,Task task) {
        taskRepository.updateTask(id,task);
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public List<Task> getAllTasks(Long id) {
        return taskRepository.getAllTasks(id);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteTaskById(id);
    }
}
