package com.ejemplotravez.mascotas_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplotravez.mascotas_3.repository.MascotaRepository;
import com.ejemplotravez.model.Mascota;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;

    public Mascota guardarMascota(Mascota mascota)
    {
        //System.out.println("Aqui se filtra la mascota");
        return mascotaRepository.create(mascota);
    }

    public List<Mascota> listarTodas()
    {
        return mascotaRepository.readAll();
    }
}
