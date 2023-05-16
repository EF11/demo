package com.example.demo.interfaces;

public interface DAOInterFace<T extends Entity> {

    void save(T entity);
}
