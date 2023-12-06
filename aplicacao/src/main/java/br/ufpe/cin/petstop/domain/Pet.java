package br.ufpe.cin.petstop.domain;

import br.ufpe.cin.petstop.enumeration.PetType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {

    @Id
    private Long id;

    private String name;

    private int age;

    private float weight;

    private float height;

    private PetType type;

    private User owner;

    public Pet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
    
}
