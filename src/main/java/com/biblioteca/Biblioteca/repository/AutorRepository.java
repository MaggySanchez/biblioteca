package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <Autor, Long> {

}
