package br.ufpe.cin.petstop.repository;

import java.util.List;

import br.ufpe.cin.petstop.domain.Pet;

public interface IRepositoryPet extends IRepository<Pet> {

    public List<Pet> findByOwnerId(Long ownerId);
    
}
