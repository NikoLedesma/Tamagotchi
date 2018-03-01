package com.virtual.pet.entity.device;

import com.virtual.pet.entity.pet.Pet;
import com.virtual.pet.entity.states.PetState;

public class ElectronicDevice implements StimulableCommand {

    private Buzzer buzzer;
    private Display display;
    private Pet pet;

    public ElectronicDevice(){
        this.buzzer = new Buzzer();
        this.display = new Display();
        this.pet = new Pet(this);
    }

    public Buzzer getBuzzer() {
        return this.buzzer;
    }

    public Display getDisplay(){
        return this.display;
    }

    public void giveFoodToPet(){
        this.pet.eat();
    }

    public void giveDrinkToPet(){
        this.pet.drink();
    }

    public void giveLoveToPet(){
        this.pet.recvLove();
    }

    public void giveFoodToPet(PetState petState){
        this.pet.setState(petState);
        this.pet.eat();
    }

    public void giveDrinkToPet(PetState petState){
        this.pet.setState(petState);
        this.pet.drink();
    }

    public void giveLoveToPet(PetState petState){
        this.pet.setState(petState);
        this.pet.recvLove();
    }

}
