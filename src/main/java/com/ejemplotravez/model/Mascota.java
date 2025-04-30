package com.ejemplotravez.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
    private int id;
    private String mombre;
    private String tipo;
}
