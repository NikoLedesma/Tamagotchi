package com.virtual.pet.entity.device;

import com.virtual.pet.entity.device.HardwareModule.Buzzer;
import com.virtual.pet.entity.device.HardwareModule.HardwareCommand;
import com.virtual.pet.entity.device.HardwareModule.Display;
import com.virtual.pet.entity.pet.VirtualPet;
import com.virtual.pet.entity.pet.states.VirtualPetState;

public class ElectronicDevice implements StimulableCommand ,HardwareCommand {

    private Buzzer buzzer;
    private Display display;
    private VirtualPet virtualPet;

    public ElectronicDevice(){
        this.buzzer = new Buzzer();
        this.display = new Display();
        this.virtualPet = new VirtualPet(this);
    }



    public void giveFoodToVirtualPet(){
        this.virtualPet.eat();
    }

    public void giveDrinkToVirtualPet(){
        this.virtualPet.drink();
    }

    public void giveLoveToVirtualPet(){
        this.virtualPet.recvLove();
    }

    public void giveFoodToVirtualPet(VirtualPetState virtualPetState){
        this.virtualPet.setState(virtualPetState);
        this.virtualPet.eat();
    }

    public void giveDrinkToVirtualPet(VirtualPetState virtualPetState){
        this.virtualPet.setState(virtualPetState);
        this.virtualPet.drink();
    }

    public void giveLoveToVirtualPet(VirtualPetState virtualPetState){
        this.virtualPet.setState(virtualPetState);
        this.virtualPet.recvLove();
    }


    public void displayShowPetVomiting() {
        System.out.println("ElectronicDevice: show virtualPet vomiting on display!!!");
        this.display.showPetVomiting();
    }

    public void displayTwinckle() {
        System.out.println("ElenctronicDevice: Twinckle display!!!");
        this.display.twinkle();
    }

    public void buzzerMakeNBeeps(Integer nBeeps) {
        System.out.println("ElectronicDevice: Make "+ nBeeps +" beeps !!!");
        this.buzzer.makeNBeeps(nBeeps);
    }

}
