package com.manaswin.task.service;

import com.manaswin.task.domain.CreateTaskRequest;
import com.manaswin.task.domain.UpdateTaskRequest;
import com.manaswin.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
    List<Task> listTasks();
    Task updteTask(UUID taskId, UpdateTaskRequest request);
    void deleteTask(UUID taskId);
}
