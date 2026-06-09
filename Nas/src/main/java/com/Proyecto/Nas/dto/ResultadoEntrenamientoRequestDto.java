package com.Proyecto.Nas.dto;

import lombok.Data;
import java.util.List;

@Data
public class EntrenamientoRequestDto {
        
    private int numero;
    private List<JugadorRequestDto> jugadores;
}