package com.virtual.pet.entity.device;

import java.awt.*;

public class Buzzer {

    public void makeNBeeps(Integer nBeeps) {
        while (nBeeps-->0) {
            System.out.println("Buzzer:beep");
            Toolkit.getDefaultToolkit().beep();
        }
    }

}
