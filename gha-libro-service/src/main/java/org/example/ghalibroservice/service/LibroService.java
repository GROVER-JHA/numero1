package org.example.ghalibroservice.service;

import org.example.ghalibroservice.entity.Libro;
import java.util.List;

public interface LibroService {
    Libro registrarLibro(Libro libro);
    Libro actualizarLibro(Long id, Libro libro);
    void eliminarLibro(Long id);
    Libro obtenerLibroPorId(Long id);
    List<Libro> listarLibros();
}