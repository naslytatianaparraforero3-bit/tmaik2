package com.Proyecto.Nas.Controller;

import com.Proyecto.Nas.Service.EntrenamientoService;
import com.Proyecto.Nas.dto.EntrenamientoRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entrenamiento")
public class EntrenamientoController {

    @Autowired
    private EntrenamientoService entrenamientoService;
    @PostMapping("/guardar")
    public ResponseEntity<Object> guardarEntrenamiento(@RequestBody EntrenamientoRequestDto request) {
        return ResponseEntity.ok(entrenamientoService.guardarEntrenamiento(request));
    }

    @GetMapping("/titulares")
    public ResponseEntity<Object> obtenerTitulares() {
        return ResponseEntity.ok(entrenamientoService.obtenerTitulares());
    }
}