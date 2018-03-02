package com.virtual.pet.entity.pet;

import com.virtual.pet.entity.device.HardwareModule.HardwareCommand;
import com.virtual.pet.entity.pet.states.HappyStateVirtual;
import com.virtual.pet.entity.pet.states.VirtualPetState;

public class VirtualPet {

    private VirtualPetState state;


    private HardwareCommand electronicDevice;

    public VirtualPet(HardwareCommand electronicDevice) {
        this.electronicDevice = electronicDevice;
        this.state = new HappyStateVirtual();
    }

    public void drink() {
        System.out.println("Pet:I'M DRINKING....!");
        state.drink(this);
    }

    public void eat() {
        System.out.println("Pet:I'M EATING....!");
        state.eat(this);
    }

    public void recvLove() {
        System.out.println("Pet:I'M RECEIVING LOVE....!");
        state.recvLove(this);
    }

    public void setState(VirtualPetState state) {
        this.state = state;
    }


    public HardwareCommand getElectronicDevice() {
        return electronicDevice;
    }

}
