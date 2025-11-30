package com.cursos.rocktseat.fernandakipper.service.main;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {
    @Value("${message: Não foi possível carregar configurações remotas}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return this.message;
    }
    
}
