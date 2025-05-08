package com.example.demo.controller;

import com.example.demo.config.AppProperties;
import com.example.demo.config.VariablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @Autowired
    private AppProperties appProperties;
    @Autowired
    private VariablesConfig variablesConfig;

    @GetMapping("/propiedades")
    public String propiedades() {
        return "App: " + appProperties.getNombre() +
                " | Puerto: " + appProperties.getPuerto() +
                " | Autor: " + appProperties.getAutor();
    }

    @GetMapping("/variables")
    public String variables() {
        variablesConfig.imprimir();
        return "";
    }
}
