package br.ufpe.cin.petstop.service;

import org.springframework.stereotype.Service;

import br.ufpe.cin.petstop.domain.Customer;
import br.ufpe.cin.petstop.repository.ICustomerRepository;

@Service
public class CustomerService extends GenericServiceImpl<Customer, ICustomerRepository> {
	
}
