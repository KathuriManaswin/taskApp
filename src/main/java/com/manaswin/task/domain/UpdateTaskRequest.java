package com.manaswin.task.domain;

import com.manaswin.task.domain.entity.TaskPriority;
import com.manaswin.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
