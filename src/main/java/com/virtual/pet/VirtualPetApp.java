package com.virtual.pet;

import com.virtual.pet.entity.device.ElectronicDevice;
import com.virtual.pet.entity.device.StimulableCommand;
import com.virtual.pet.entity.pet.states.*;



public class VirtualPetApp {

    public static void main(String[] args) {
        StimulableCommand electronicDevice = new ElectronicDevice();

        System.out.println("+++++++++++++++++++++++++(happy state)+++++++++++++++++++++++++");
        VirtualPetState happyState = new HappyStateVirtual();
        electronicDevice.giveDrinkToPet(happyState);
        electronicDevice.giveFoodToPet(happyState);
        electronicDevice.giveLoveToPet(happyState);

        System.out.println("+++++++++++++++++++++++++(hungry state)+++++++++++++++++++++++++");
        VirtualPetState hungryState = new HungryStateVirtual();
        electronicDevice.giveDrinkToPet(hungryState);
        electronicDevice.giveFoodToPet(hungryState);
        electronicDevice.giveLoveToPet(hungryState);

        System.out.println("+++++++++++++++++++++++++(sad state)+++++++++++++++++++++++++");
        VirtualPetState sadState = new SadStateVirtual();
        electronicDevice.giveDrinkToPet(sadState);
        electronicDevice.giveFoodToPet(sadState);
        electronicDevice.giveLoveToPet(sadState);

        System.out.println("+++++++++++++++++++++++++(thirsty state)+++++++++++++++++++++++++");
        VirtualPetState thirstyState = new ThirstyStateVirtual();
        electronicDevice.giveDrinkToPet(thirstyState);
        electronicDevice.giveFoodToPet(thirstyState);
        electronicDevice.giveLoveToPet(thirstyState);
    }

}




