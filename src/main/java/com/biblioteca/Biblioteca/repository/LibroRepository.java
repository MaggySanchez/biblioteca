package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
