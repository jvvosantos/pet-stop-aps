package br.ufpe.cin.petstop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.ufpe.cin.petstop.domain.GenericEntity;
import br.ufpe.cin.petstop.repository.IGenericRepository;

public class GenericServiceImpl<T extends GenericEntity, S extends IGenericRepository<T>> implements IGenericService<T> {

	@Autowired
	private S repository;

	@Override
	public T insert(T pojo) {
		return repository.save(pojo);
	}

	@Override
	public T update(T pojo) {
		return repository.save(pojo);
	}

	@Override
	public List<T> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Page<T> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public T findById(Long id) {
		Optional<T> optional = repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		else {			
			return null;
		}
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}


