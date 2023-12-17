package br.ufpe.cin.petstop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpe.cin.petstop.domain.GenericEntity;

public interface IGenericRepository<T extends GenericEntity> extends JpaRepository<T, Long>{
    
}
