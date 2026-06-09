package com.Proyecto.Nas.dto;

import lombok.Data;

@Data
public class JugadorRequestDto {
    private String nombre;
    private double potenciaTiro;
    private double velocidad;
    private int pasesEfectivos;
}