package com.manaswin.task.mapper;

import com.manaswin.task.domain.CreateTaskRequest;
import com.manaswin.task.domain.UpdateTaskRequest;
import com.manaswin.task.domain.dto.CreateTaskRequestDto;
import com.manaswin.task.domain.dto.TaskDto;
import com.manaswin.task.domain.dto.UpdateTaskRequestDto;
import com.manaswin.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
