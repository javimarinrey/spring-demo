package com.example.demo.controller;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormularioController {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }

}
