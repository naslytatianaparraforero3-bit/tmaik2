package com.Proyecto.Nas.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "entrenamiento")
public class Entrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Column(name= "numero")
    private int numero;
 }