package com.biblioteca.Biblioteca.repository;

import com.biblioteca.Biblioteca.entity.Autor;

import java.util.ArrayList;
import java.util.Scanner;

public class AutorDao implements iDao <Autor>{

    private Autor autor = new Autor(1L, "Julio", "Verne");
    private Autor autor1 = new Autor(2L,"Jane", "Austen");
    private Autor autor3 = new Autor(3L,"Gabriel", "Garcia Marquez");
    private ArrayList<Autor> autores = new ArrayList<>();
    @Override
    public Autor create(Autor autor) {
        autores.add(autor);
        return autor;
    }

    @Override
    public void delete(Long id) {
        for (Autor autor:autores) {
            if (autor.getId().equals(id)) {
                autores.remove(autor);
            }
        }
    }

    @Override
    public ArrayList<Autor> getAll() {
        return autores;
    }

    @Override
    public Autor update(Autor autor) {
        Autor returnedAuthor = null;
        for (Autor a:autores) {
            if(a.equals(autor)){
                returnedAuthor = autor;
            }
        }
        return autor;
    }

    @Override
    public Autor searchById(Long id) {
        Autor returnedAuthor = null;
        for (Autor autor : autores) {
            if(autor.getId().equals(id)) {
                returnedAuthor = autor;
            }

        }
        return returnedAuthor;
    }
}
