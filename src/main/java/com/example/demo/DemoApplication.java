package com.example.demo;

import com.example.demo.Service.MyService;
import com.example.demo.model.User;
import com.example.demo.repository.RepositoryHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
