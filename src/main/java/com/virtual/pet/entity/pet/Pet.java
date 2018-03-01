package com.virtual.pet.entity.pet;

import com.virtual.pet.entity.device.Display;
import com.virtual.pet.entity.device.ElectronicDevice;
import com.virtual.pet.entity.states.HappyState;
import com.virtual.pet.entity.states.PetState;

public class Pet {

    private PetState state;
    private ElectronicDevice electronicDevice;

    public Pet(ElectronicDevice electronicDevice){
        this.electronicDevice = electronicDevice;
        this.state = new HappyState();
    }

    public void drink(){
            System.out.println("Pet:I'M DRINKING....!");
            state.drink(this);
    }

    public void eat(){
            System.out.println("Pet:I'M EATING....!");
            state.eat(this);
    }

    public void recvLove(){
            System.out.println("Pet:I'M RECEIVING LOVE....!");
            state.recvLove(this);
    }

    public PetState getState() {
        return state;
    }

    public ElectronicDevice getElectronicDevice(){
        return this.electronicDevice;
    }

    public void setState(PetState state) {
        this.state = state;
    }

}
