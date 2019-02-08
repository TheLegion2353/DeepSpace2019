package frc.robot;

import edu.wpi.first.wpilibj.DigitalOutput;

public class ringLight {
    DigitalOutput hBridge;

    public void init() {
        hBridge = new DigitalOutput(2);
    }

    public void setOn() {
        hBridge.set(true);
    }

    public void setOff() {
        hBridge.set(false);
    }

    public void strobeFor(int amnt) {
        for(int i=0; i <= amnt; i++) {
            hBridge.set(true);
            hBridge.set(false);
        }
    }

    public void toggle() {
        if (hBridge.get() == true) {
            hBridge.set(false);
        } else {
            hBridge.set(true);
        }
    }
}