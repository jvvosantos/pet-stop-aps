package br.ufpe.cin.petstop.repository;

import java.util.List;

public interface IRepository<T> {

    public T insert(T entity);
    
    public T update(T entity);

    public T findOne(Long id);

    public List<T> findAll();

    public T removeById(Long id);

    public T remove(T entity);
    
}
