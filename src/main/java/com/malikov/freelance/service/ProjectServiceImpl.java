package com.malikov.freelance.service;

import com.malikov.freelance.model.Project;
import com.malikov.freelance.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository repository;

    @Override
    public Project save(Project project) {
        Assert.notNull(project, "project must not be null");
        return repository.save(project);
    }

    @Override
    public Project update(Project project) {
        Assert.notNull(project, "project must not be null");
        return repository.save(project);
    }

    @Override
    public Project get(int id) {
        return repository.get(id);
    }

    @Override
    public List<Project> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public List<Project> getPortfolio(int freelancerId) {
        return repository.getPortfolio(freelancerId);
    }

}
