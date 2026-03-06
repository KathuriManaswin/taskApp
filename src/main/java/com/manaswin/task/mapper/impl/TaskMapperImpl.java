package com.manaswin.task.mapper.impl;

import com.manaswin.task.domain.CreateTaskRequest;
import com.manaswin.task.domain.UpdateTaskRequest;
import com.manaswin.task.domain.dto.CreateTaskRequestDto;
import com.manaswin.task.domain.dto.TaskDto;
import com.manaswin.task.domain.dto.UpdateTaskRequestDto;
import com.manaswin.task.domain.entity.Task;
import com.manaswin.task.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {
    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
          dto.title(),
          dto.description(),
          dto.dueDate(),
          dto.priority()
        );
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
        return new UpdateTaskRequest(
          dto.title(),
          dto.description(),
          dto.dueDate(),
          dto.status(),
          dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDuedate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
