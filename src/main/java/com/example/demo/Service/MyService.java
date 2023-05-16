package com.example.demo.Service;

import com.example.demo.interfaces.Entity;
import com.example.demo.repository.RepositoryHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private RepositoryHub repositoryHub;

    public void saveEntity(Entity entity) {
        repositoryHub.save(entity);
    }
}
