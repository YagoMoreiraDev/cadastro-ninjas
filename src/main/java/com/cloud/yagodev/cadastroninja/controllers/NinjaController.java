package com.cloud.yagodev.cadastroninja.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @GetMapping
    public String teste() {
        return "Bem vindo ao Cadastro Ninja!";
    }
}
