package ru.finansicli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendMasterService {
    public static void main( String[] args ) {
        SpringApplication.run(BackendMasterService.class, args);
    }
}

//http://localhost:122/swagger-ui
//http://localhost:122/v3/api-docs
//Нужно будет сделать описание для swagger