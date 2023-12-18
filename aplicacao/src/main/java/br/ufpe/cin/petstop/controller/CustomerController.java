package br.ufpe.cin.petstop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petstop.domain.Customer;
import br.ufpe.cin.petstop.service.CustomerService;

@RestController
@RequestMapping("/users")
public class CustomerController extends GenericController<Customer, CustomerService>{

}
