package br.ufpe.cin.petstop.repository;

import org.springframework.stereotype.Repository;

import br.ufpe.cin.petstop.domain.User;

@Repository
public interface IUserRepository extends IGenericRepository<User> {
    
}
