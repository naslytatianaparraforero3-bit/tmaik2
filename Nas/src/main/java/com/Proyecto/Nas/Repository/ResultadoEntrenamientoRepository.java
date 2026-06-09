package com.Proyecto.Nas.Repository;

import com.Proyecto.Nas.Entity.ResultadoEntrenamiento;
import com.Proyecto.Nas.Entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultadoEntrenamientoRepository extends JpaRepository<ResultadoEntrenamiento, Long> {

    List<ResultadoEntrenamiento> findByJugador(Jugador jugador);
}