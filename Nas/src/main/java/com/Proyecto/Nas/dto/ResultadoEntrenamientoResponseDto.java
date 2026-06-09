package com.Proyecto.Nas.dto;

import lombok.Data;

@Data
public class ResultadoEntrenamientoResponseDto {
     private Long id;

    private double potenciaTiro;
    private double velocidad;
    private int pasesEfectivos;
    private double puntaje;
}
