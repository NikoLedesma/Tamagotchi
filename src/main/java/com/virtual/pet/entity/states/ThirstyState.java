package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

public class ThirstyState extends PetStateAbs {
    public void drink(Pet pet) {
        System.out.println("Thirsty State:change thirsty state to happy state");
        this.changeState(pet, new HappyState());
    }
}
