package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements com.example.demo.interfaces.Entity {
    @Id
    Long id;
    String name;
    String surName;
}
