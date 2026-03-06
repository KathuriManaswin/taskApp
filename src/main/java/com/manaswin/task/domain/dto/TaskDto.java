package com.manaswin.task.domain.dto;

import com.manaswin.task.domain.entity.TaskPriority;
import com.manaswin.task.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {

}
