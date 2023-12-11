package com.biblioteca.Biblioteca.services;

import com.biblioteca.Biblioteca.entity.Autor;
import com.biblioteca.Biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor create(Autor autor){return autorRepository.save(autor);};

    public void delete(Long id) {autorRepository.deleteById(id);}

    public Optional<Autor> searchById(Long id) {return autorRepository.findById(id);};

    public List<Autor> getAll() {return autorRepository.findAll();};

    public Autor update(Autor autor) {return autorRepository.save(autor);};
}
