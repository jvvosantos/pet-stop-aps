package br.ufpe.cin.petstop.domain;

import br.ufpe.cin.petstop.enumeration.PetType;

public class PetBuilder {
    
    private Pet obj;

    public PetBuilder() {
        this.obj = new Pet();
    }

    public Pet name(String name) {
        obj.setName(name);
        return obj;
    }

    public Pet age(int age) {
        obj.setAge(age);
        return obj;
    }

    public Pet weight(float weight) {
        obj.setWeight(weight);
        return obj;
    }

    public Pet height(float height) {
        obj.setHeight(height);
        return obj;
    }

    public Pet type(PetType type) {
        obj.setType(type);
        return obj;
    }

    public Pet owner(Customer owner) {
        obj.setOwner(owner);
        return obj;
    }

    public Pet build() {
        return obj;
    }
}
