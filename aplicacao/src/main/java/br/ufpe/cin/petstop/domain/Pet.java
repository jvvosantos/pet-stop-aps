package br.ufpe.cin.petstop.domain;

import br.ufpe.cin.petstop.enumeration.PetType;
import jakarta.persistence.Entity;

@Entity
public class Pet extends GenericEntity {

	private static final long serialVersionUID = 1L;

	private String name;

    private int age;

    private float weight;

    private float height;

    private PetType type;

    private User owner;

    public Pet() {
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
