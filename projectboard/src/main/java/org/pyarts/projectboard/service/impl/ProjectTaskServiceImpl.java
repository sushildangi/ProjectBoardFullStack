package org.pyarts.projectboard.service.impl;

import org.pyarts.projectboard.domain.ProjectTask;
import org.pyarts.projectboard.repository.ProjectTaskRepository;
import org.pyarts.projectboard.service.ProjectTaskService;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskServiceImpl implements ProjectTaskService {

    private final ProjectTaskRepository projectTaskRepository;

    public ProjectTaskServiceImpl(ProjectTaskRepository projectTaskRepository) {
        this.projectTaskRepository = projectTaskRepository;
    }

    @Override
    public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask) {
        if(projectTask.getStatus() == null || projectTask.getStatus().equalsIgnoreCase("")){
            projectTask.setStatus("TO_DO");
        }
        return projectTaskRepository.save(projectTask);
    }

    @Override
    public Iterable<ProjectTask> findAll() {
        return projectTaskRepository.findAll();
    }
}
