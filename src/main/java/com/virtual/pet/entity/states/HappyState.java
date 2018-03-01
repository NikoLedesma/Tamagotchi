package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

public class HappyState extends PetStateAbs {

    public void drink(Pet pet) {
        //DO 5 beeps
        System.out.println("HappyState:Make 5 beeps");
        pet.getElectronicDevice().getBuzzer().makeNBeeps(5);
    }


}
