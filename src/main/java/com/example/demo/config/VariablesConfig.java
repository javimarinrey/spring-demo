package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VariablesConfig {

    @Value("${color}")
    private String color;

    @Value("#{'${servicios}'.split(',')}")
    private List<String> servicios;

    @Value("${nombre:Aplicación por defecto}")
    private String nombre;

    public void imprimir() {
        System.out.println("color: " + color);
        System.out.println("num. servicios: " + servicios.size());
        System.out.println("nombre: " + servicios.size());
    }
}
