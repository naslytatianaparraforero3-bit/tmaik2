package com.Proyecto.Nas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "resultado_entrenamiento")
public class ResultadoEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Column(name= "potenciaTiro")
    private double potenciaTiro;
    @Column(name= "velocidad")
    private double velocidad;
    @Column(name= "pasesEfectivos")
    private int pasesEfectivos;
    @Column(name= "puntaje")
    private double puntaje;

    @ManyToOne
    @JoinColumn(name = "jugador_id")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "entrenamiento_id")
    private Entrenamiento entrenamiento;
    
    }