package br.ufpe.cin.petstop.repository;

import org.springframework.stereotype.Repository;

import br.ufpe.cin.petstop.domain.Customer;

@Repository
public interface ICustomerRepository extends IGenericRepository<Customer> {
    
}
