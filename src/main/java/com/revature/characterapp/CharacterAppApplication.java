package com.revature.characterapp;

import com.revature.characterapp.config.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

@SpringBootApplication
@Import({AppConfig.class})
public class CharacterAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharacterAppApplication.class, args);
    }

}
