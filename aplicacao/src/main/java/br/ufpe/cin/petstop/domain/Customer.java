package br.ufpe.cin.petstop.domain;

import br.ufpe.cin.petstop.enumeration.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Customer extends GenericEntity {

    private static final long serialVersionUID = 1L;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private Role role;

    public Customer() {
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
