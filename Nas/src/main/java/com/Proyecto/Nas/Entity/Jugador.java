package com.Proyecto.Nas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="nombre")
    private String nombre;
 }