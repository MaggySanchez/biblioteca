package com.biblioteca.Biblioteca.controller;

import com.biblioteca.Biblioteca.entity.Autor;
import com.biblioteca.Biblioteca.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/autor")
public class AutorController {
    private final AutorService service;

    @Autowired
    public AutorController(AutorService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Autor create(@RequestBody Autor autor) {return service.create(autor);};
    @DeleteMapping("/delete/{id}")
    public void delete(@RequestBody @PathVariable Long id) {service.delete(id);};

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        ArrayList<Autor> autores =  service.getAll();
        if(autores==null) {
            return (ResponseEntity<?>) ResponseEntity.notFound();
        } else {
            return ResponseEntity.ok(autores);
        }
    };
    @PutMapping("/update")
    public Autor update(Autor autor) {return service.update(autor);};

    @GetMapping("/searchById/{id}")
    public ResponseEntity<?> searchById(@PathVariable  Long id) {
        Autor autor = service.searchById(id);
        if (autor == null) {
            return ResponseEntity.badRequest().body("Author not found");
        } else {
            return ResponseEntity.ok(autor);
        }
    };
}
