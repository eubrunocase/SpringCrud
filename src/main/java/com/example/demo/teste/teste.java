package com.example.demo.teste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/final")
public class teste {

    @GetMapping("/api")
    public String teste () {
        return "Testando...";
    }


}
