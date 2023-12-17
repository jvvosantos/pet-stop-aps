package br.ufpe.cin.petstop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petstop.domain.Vet;
import br.ufpe.cin.petstop.service.VetService;

@RestController
@RequestMapping("/vets")
public class VetController extends GenericController<Vet, VetService>{

}
