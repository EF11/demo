package com.example.demo.repository;

import com.example.demo.interfaces.DAOInterFace;
import com.example.demo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository("UserRepository")
public class UserRepository implements DAOInterFace<User> {
    @Override
    public void save(User entity) {
        log.info("SAVED CLIENT");
    }
}
