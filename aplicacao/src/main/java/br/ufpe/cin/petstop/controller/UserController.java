package br.ufpe.cin.petstop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.petstop.domain.User;
import br.ufpe.cin.petstop.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController extends GenericController<User, UserService>{

}
