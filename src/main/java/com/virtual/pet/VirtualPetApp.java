package com.virtual.pet;

import com.virtual.pet.entity.device.ElectronicDevice;
import com.virtual.pet.entity.device.StimulableCommand;
import com.virtual.pet.entity.states.*;

import static java.lang.System.out;

public class VirtualPetApp {

    public static void main(String[] args) {
        StimulableCommand electronicDevice = new ElectronicDevice();
        Integer i = 1;

        out.println(i++ + "  happy state)");
        PetState happyState = new HappyState();
        electronicDevice.giveDrinkToPet(happyState);
        electronicDevice.giveFoodToPet(happyState);
        electronicDevice.giveLoveToPet(happyState);

        out.println(i++ + "  hungry state)");
        PetState hungryState = new HungryState();
        electronicDevice.giveDrinkToPet(hungryState);
        electronicDevice.giveFoodToPet(hungryState);
        electronicDevice.giveLoveToPet(hungryState);

        out.println(i++ + "  sad state)");
        PetState sadState = new SadState();
        electronicDevice.giveDrinkToPet(sadState);
        electronicDevice.giveFoodToPet(sadState);
        electronicDevice.giveLoveToPet(sadState);

        out.println(i++ + "  thirsty state)");
        PetState thirstyState = new ThirstyState();
        electronicDevice.giveDrinkToPet(thirstyState);
        electronicDevice.giveFoodToPet(thirstyState);
        electronicDevice.giveLoveToPet(thirstyState);
    }

}




