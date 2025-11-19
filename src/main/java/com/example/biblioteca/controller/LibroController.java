package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> obtenerTodos() {
        return this.libroService.getLibros();
    }

    @GetMapping(path = "/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id) {
        return this.libroService.getLibro(id);
    }

    @PostMapping
    public void guardarOActualizarLibro(@RequestBody Libro libro) {
        this.libroService.guardarOActualizarLibro(libro);
    }

    @DeleteMapping(path = "/{libroId}")
    public void eliminarLibro(@PathVariable("libroId") Long libroId) {
        this.libroService.eliminarLibro(libroId);
    }
}