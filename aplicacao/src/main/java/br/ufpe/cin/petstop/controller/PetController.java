package br.ufpe.cin.petstop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petstop.domain.Pet;
import br.ufpe.cin.petstop.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController extends GenericController<Pet, PetService>{

}
