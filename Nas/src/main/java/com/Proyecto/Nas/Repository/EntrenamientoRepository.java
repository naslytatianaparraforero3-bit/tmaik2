package com.Proyecto.Nas.Repository;

import com.Proyecto.Nas.Entity.Entrenamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrenamientoRepository extends JpaRepository<Entrenamiento, Long> {
    Entrenamiento findByNumero(int numero);
}