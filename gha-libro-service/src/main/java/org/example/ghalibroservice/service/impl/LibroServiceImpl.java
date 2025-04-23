package org.example.ghalibroservice.service.impl;

import org.example.ghalibroservice.entity.Libro;
import org.example.ghalibroservice.repository.LibroRepository;
import org.example.ghalibroservice.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro registrarLibro(Libro libro) {
        if (libroRepository.findByIsbn(libro.getIsbn()).isPresent()) {
            throw new IllegalArgumentException("ISBN ya existe");
        }
        return libroRepository.save(libro);
    }

    @Override
    public Libro actualizarLibro(Long id, Libro libro) {
        Libro existente = libroRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Libro no encontrado"));

        existente.setTitulo(libro.getTitulo());
        existente.setAutor(libro.getAutor());
        existente.setEditorial(libro.getEditorial());
        existente.setNumeroCopias(libro.getNumeroCopias());
        existente.setCategoria(libro.getCategoria());

        return libroRepository.save(existente);
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id);
    }

    @Override
    public Libro obtenerLibroPorId(Long id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Libro no encontrado"));
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }
}