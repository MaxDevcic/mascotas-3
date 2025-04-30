package com.ejemplotravez.mascotas_3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

@RequestMapping("api/mascotas")
public class MascotaController {
    
    @GetMapping
    public String algo() {
        return "Ahora si";
    }
    
}
