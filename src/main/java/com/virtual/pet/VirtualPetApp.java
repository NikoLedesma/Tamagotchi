package com.virtual.pet;

import com.virtual.pet.entity.device.ElectronicDevice;
import com.virtual.pet.entity.device.StimulableCommand;
import com.virtual.pet.entity.pet.states.*;



public class VirtualPetApp {

    public static void main(String[] args) {
        StimulableCommand electronicDevice = new ElectronicDevice();

        System.out.println("+++++++++++++++++++++++++(happy state)+++++++++++++++++++++++++");
        VirtualPetState happyState = new HappyStateVirtual();
        electronicDevice.giveDrinkToVirtualPet(happyState);
        electronicDevice.giveFoodToVirtualPet(happyState);
        electronicDevice.giveLoveToVirtualPet(happyState);

        System.out.println("+++++++++++++++++++++++++(hungry state)+++++++++++++++++++++++++");
        VirtualPetState hungryState = new HungryStateVirtual();
        electronicDevice.giveDrinkToVirtualPet(hungryState);
        electronicDevice.giveFoodToVirtualPet(hungryState);
        electronicDevice.giveLoveToVirtualPet(hungryState);

        System.out.println("+++++++++++++++++++++++++(sad state)+++++++++++++++++++++++++");
        VirtualPetState sadState = new SadStateVirtual();
        electronicDevice.giveDrinkToVirtualPet(sadState);
        electronicDevice.giveFoodToVirtualPet(sadState);
        electronicDevice.giveLoveToVirtualPet(sadState);

        System.out.println("+++++++++++++++++++++++++(thirsty state)+++++++++++++++++++++++++");
        VirtualPetState thirstyState = new ThirstyStateVirtual();
        electronicDevice.giveDrinkToVirtualPet(thirstyState);
        electronicDevice.giveFoodToVirtualPet(thirstyState);
        electronicDevice.giveLoveToVirtualPet(thirstyState);
    }

}




