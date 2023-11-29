package com.biblioteca.Biblioteca.repository;

import java.util.ArrayList;

public interface iDao <T> {
    public T create(T t);

    public void delete (Long id);

    public ArrayList<T> getAll();

    public T update(T t);

    public T searchById(Long id);

}
