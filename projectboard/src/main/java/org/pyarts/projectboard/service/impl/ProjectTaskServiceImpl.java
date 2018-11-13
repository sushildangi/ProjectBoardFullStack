package org.pyarts.projectboard.service.impl;

import org.pyarts.projectboard.repository.ProjectTaskRepository;
import org.pyarts.projectboard.service.ProjectTaskService;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {

    private final ProjectTaskRepository projectTaskRepository;

    public ProjectTaskServiceImpl(ProjectTaskRepository projectTaskRepository) {
        this.projectTaskRepository = projectTaskRepository;
    }
}
