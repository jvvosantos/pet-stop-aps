package br.ufpe.cin.petstop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.ufpe.cin.petstop.domain.GenericEntity;
import br.ufpe.cin.petstop.repository.IGenericRepository;
import br.ufpe.cin.petstop.service.GenericServiceImpl;

public class GenericController<T extends GenericEntity, S extends GenericServiceImpl<T, ? extends IGenericRepository<T>>> {
	
	@Autowired
	private S service;
	
	@PostMapping
	public T post(@RequestBody T object) {
		return service.insert(object);
	}
	
	@PutMapping
	public T put(@RequestBody T object) {
		return service.update(object);
	}
	
	@GetMapping("/{id}")
	public T findOne(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public Object findAll(Pageable pageable) {
		if (pageable == null) {			
			return service.findAll();
		}
		else {
			return service.findAll(pageable);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.service.delete(id);
	}

}
