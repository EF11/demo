package com.example.demo.repository;

import com.example.demo.interfaces.DAOInterFace;
import com.example.demo.model.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository("ClientRepository")
public class ClientRepository implements DAOInterFace<Client> {
    @Override
    public void save(Client entity) {
        log.info("SAVED CLIENT");
    }
}