package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.entity.Autor;
import com.biblioteca.Biblioteca.services.AutorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController("/autor")
public class AutorController {
    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    public Autor create(Autor autor) {return service.create(autor);};

    public void delete(Long id) {service.delete(id);};

    @GetMapping("/autor/getAll")
    public ArrayList<Autor> getAll() {return service.getAll();};

    public Autor update(Autor autor) {return service.update(autor);};

    @GetMapping("/autor/searchById")
    public Autor searchById(Long id) {return service.searchById(id);};
}
