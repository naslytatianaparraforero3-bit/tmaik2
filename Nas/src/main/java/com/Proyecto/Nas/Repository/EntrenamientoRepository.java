package com.Proyecto.Nas.Repository;

import com.Proyecto.Nas.Entity.Entrenamiento;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrenamientoRepository extends JpaRepository<Entrenamiento, Long> {
     List<Entrenamiento> findByNumero(int numero);

}