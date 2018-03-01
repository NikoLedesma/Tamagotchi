package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

public class HungryState extends PetStateAbs{

    public void eat(Pet pet) {
        System.out.println("Hungry State:Change hungry state to happy state.");
        this.changeState(pet,new HappyState());
    }


}
