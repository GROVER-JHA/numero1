package org.example.ghalibroservice.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "libros", uniqueConstraints = {@UniqueConstraint(columnNames = "isbn")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String autor;

    @Column(nullable = false)
    private String editorial;

    @Column(nullable = false)
    private int numeroCopias;

    @Column(nullable = false)
    private String categoria;
}