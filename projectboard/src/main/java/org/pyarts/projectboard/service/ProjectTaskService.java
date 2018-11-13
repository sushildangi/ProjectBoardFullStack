package org.pyarts.projectboard.service;

import org.pyarts.projectboard.domain.ProjectTask;

public interface ProjectTaskService {

    ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask);
    Iterable<ProjectTask> findAll();
}
