package com.example.demo.repository;

import com.example.demo.interfaces.DAOInterFace;
import com.example.demo.interfaces.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RepositoryHub {

    @Autowired
    private ApplicationContext applicationContext;

    public <T extends Entity> void save(T entity) {
        String entityClassName = entity.getClass().getSimpleName() + "Repository";
        DAOInterFace<T> repository = applicationContext.getBean(entityClassName, DAOInterFace.class);

        if (repository != null) {
            repository.save(entity);
        } else {
            throw new IllegalArgumentException("Repository not found for entity type: " + entityClassName);
        }
    }
}