package br.ufpe.cin.petstop.service;

import org.springframework.stereotype.Service;

import br.ufpe.cin.petstop.domain.Pet;
import br.ufpe.cin.petstop.repository.IPetRepository;

@Service
public class PetService extends GenericServiceImpl<Pet, IPetRepository> {
	
}
