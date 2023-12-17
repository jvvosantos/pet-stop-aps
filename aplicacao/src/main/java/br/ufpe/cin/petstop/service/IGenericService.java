package br.ufpe.cin.petstop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.ufpe.cin.petstop.domain.GenericEntity;

public interface IGenericService<T extends GenericEntity> {
	
	public T insert(T pojo);
	
	public T update(T pojo);
	
	public T findById(Long id);
	
	public List<T> findAll();
	
	public Page<T> findAll(Pageable pageable);

	public void delete(Long id);
}