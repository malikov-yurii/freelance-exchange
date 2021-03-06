package com.malikov.freelance.service;

import com.malikov.freelance.model.Freelancer;
import com.malikov.freelance.repository.FreelancerRepository;
import com.malikov.freelance.util.BaseUserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class FreeLancerServiceImpl implements FreelancerService {

    @Autowired
    FreelancerRepository repository;

    @Override
    public Freelancer save(Freelancer freelancer) {
        Assert.notNull(freelancer, "freelancer must not be null");
        return repository.save((Freelancer) BaseUserUtil.prepareToSave(freelancer));
    }

    @Override
    public Freelancer update(Freelancer freelancer) {
        Assert.notNull(freelancer, "freelancer must not be null");
        return repository.save((Freelancer) BaseUserUtil.prepareToSave(freelancer));
    }

    @Override
    public Freelancer get(int id) {
        return repository.get(id);
    }

    @Override
    public List<Freelancer> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public Freelancer getByLogin(String login) {
        return repository.getByLogin(login);
    }
}
