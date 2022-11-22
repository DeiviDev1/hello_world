package com.example.hello.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String hello(){
     return "Olá Mundo!";
    }

    @GetMapping("/bsm")
    public String BSM(){
        return " <b>BSM Genetarion Brasil</br> " +
                "<li>Responsabilidade pessoal</li>" +
                "<li>Mentalidade de crescimento</li>" +
                "<li>Orientação ao futuro</li>" +
                "<li>Persistência</li>" +
                "<li>Comunicação</li>" +
                "<li>Adaptabilidade</li>" +
                "<li>Trabalho em equipe</li>" +
                "<li>Proatividade</li>";
    }
    @GetMapping("/obj")
    public String objetivos(){
        return " Aprender o Spring e agregar mais o meu conhecimento ";
    }


}
