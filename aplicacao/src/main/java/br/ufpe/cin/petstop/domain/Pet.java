package br.ufpe.cin.petstop.domain;

import br.ufpe.cin.petstop.enumeration.PetType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pet extends GenericEntity {

	private static final long serialVersionUID = 1L;

	@Column
	private String name;

	@Column
    private int age;

	@Column
    private float weight;

	@Column
    private float height;

	@Column
    private PetType type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
    private Customer owner;

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

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    
}
