package com.virtual.pet.entity.states;

import com.virtual.pet.entity.pet.Pet;

public class SadState extends PetStateAbs {

    public void eat(Pet pet) {
        //DO 2 beeps
        //DO Show pet swallowing(mascota vomitando) in display
        System.out.println("Sad State:Make 2 beeps");
        pet.getElectronicDevice().getBuzzer().makeNBeeps(2);
        System.out.println("Sad State:Show pet vomiting");
        pet.getElectronicDevice().getDisplay().showPetVomiting();
    }

    public void drink(Pet pet) {
        //DO 3 beeps
        //Titila display
        System.out.println("Sad State:Make 3 beeps");
        pet.getElectronicDevice().getBuzzer().makeNBeeps(3);
        System.out.println("Sad State:Twinkle");
        pet.getElectronicDevice().getDisplay().twinkle();
    }

    public void recvLove(Pet pet) {
        System.out.println("Sad State:Change to happy state");
        this.changeState(pet,new HappyState());
    }

}
