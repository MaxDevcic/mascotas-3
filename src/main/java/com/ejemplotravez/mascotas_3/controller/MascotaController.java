package com.ejemplotravez.mascotas_3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ejemplotravez.mascotas_3.service.MascotaService;
import com.ejemplotravez.model.Mascota;

@RestController

@RequestMapping("api/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaservice;

    @GetMapping
    public String algo() {
        return "Ahora si";
    }
    
    @PostMapping("path")
    public Mascota postMascota(@RequestBody Mascota mascota){
        return mascotaservice.guardarMascota(mascota);
    }
    
}
