package com.revature.characterapp.config;

import org.springframework.boot.autoconfigure.domain.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.transaction.annotation.*;

@Configuration
@EnableJpaRepositories(basePackages = "com.revature.characterapp.repositories")
@EnableTransactionManagement
@ComponentScan(basePackages = "com.revature.characterapp")
public class AppConfig {
}
