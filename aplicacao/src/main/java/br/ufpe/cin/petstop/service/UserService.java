package br.ufpe.cin.petstop.service;

import org.springframework.stereotype.Service;

import br.ufpe.cin.petstop.domain.User;
import br.ufpe.cin.petstop.repository.IUserRepository;

@Service
public class UserService extends GenericServiceImpl<User, IUserRepository> {
	
}
