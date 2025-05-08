package com.example.demo.config;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    // Instancias tiene Spring en su ApplicationContext
    public AppConfig(ApplicationContext applicationContext) {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println("beanName " + beanName);
        }
    }
}