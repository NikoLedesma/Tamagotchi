package com.virtual.pet.entity.device;

import com.virtual.pet.entity.device.HardwareModule.Buzzer;
import com.virtual.pet.entity.device.HardwareModule.HardwareCommand;
import com.virtual.pet.entity.device.HardwareModule.Display;
import com.virtual.pet.entity.pet.VirtualPet;
import com.virtual.pet.entity.pet.states.VirtualPetState;

public class ElectronicDevice implements StimulableCommand ,HardwareCommand {

    private Buzzer buzzer;
    private Display display;
    private VirtualPet pet;

    public ElectronicDevice(){
        this.buzzer = new Buzzer();
        this.display = new Display();
        this.pet = new VirtualPet(this);
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

    public void giveFoodToPet(VirtualPetState virtualPetState){
        this.pet.setState(virtualPetState);
        this.pet.eat();
    }

    public void giveDrinkToPet(VirtualPetState virtualPetState){
        this.pet.setState(virtualPetState);
        this.pet.drink();
    }

    public void giveLoveToPet(VirtualPetState virtualPetState){
        this.pet.setState(virtualPetState);
        this.pet.recvLove();
    }


    public void displayShowPetVomiting() {
        System.out.println("ElectronicDevice: show pet vomiting on display!!!");
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
