package com.Proyecto.Nas.Repository;

import com.Proyecto.Nas.Entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    Jugador findByNombre(String nombre);
}