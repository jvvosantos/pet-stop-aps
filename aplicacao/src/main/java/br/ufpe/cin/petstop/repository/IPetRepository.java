package br.ufpe.cin.petstop.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.ufpe.cin.petstop.domain.Pet;

@Repository
public interface IPetRepository extends IGenericRepository<Pet> {

    public List<Pet> findByOwnerId(Long ownerId);
    
}
