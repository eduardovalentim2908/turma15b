package br.valentim.spring01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World! Modificando o código!");
    }

    @PostMapping("/hello")
    public ResponseEntity<String> hello2(){
        return ResponseEntity.ok("Hello World! Modificando o código!");
    }

}
