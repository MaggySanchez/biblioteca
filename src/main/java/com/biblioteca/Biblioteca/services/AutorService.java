package com.biblioteca.Biblioteca.services;

import com.biblioteca.Biblioteca.entity.Autor;
import com.biblioteca.Biblioteca.repository.AutorDao;
import com.biblioteca.Biblioteca.repository.iDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class AutorService {
    private iDao <Autor> autorDao;

    @Autowired
    public AutorService(iDao autorDao) {
        this.autorDao = autorDao;
    }

    public iDao getAutorDao() {
        return autorDao;
    }

    public void setAutorDao(iDao autorDao) {
        this.autorDao = autorDao;
    }

    public Autor create(Autor autor) {return autorDao.create(autor);};

    public void delete(Long id) {autorDao.delete(id);};

    public ArrayList<Autor> getAll() {return autorDao.getAll();};

    public Autor update(Autor autor) {return autorDao.update(autor);};

    public Autor searchById(Long id) {return autorDao.searchById(id);};
}
