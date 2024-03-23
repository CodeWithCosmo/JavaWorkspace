package Inheritence;

//* We can achieve multiple inheritance in java by using Interfaces. */

interface Camera {
    
    void takeSnap();
    void recordVideo();
}

interface GPS {
    
    void gpson();
    void gpsoff();
    void getLoc();
    void setLoc();
    void currentLoc();
}

interface Microphone {
    
    void micon();
    void micoff();
    void record();
    void play();
}

class phone implements Camera, GPS, Microphone {
    
    public void on() {
        System.out.println("Phone is on");
    }
    
    public void off() {
        System.out.println("Phone is off");
    }

    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    
    public void gpson() {
        System.out.println("GPS is on");
    }

    public void gpsoff() {
        System.out.println("GPS is off");
    }

    public void getLoc() {
        System.out.println("Getting location");
    }

    public void setLoc() {
        System.out.println("Setting location");
    }
    
    public void currentLoc() {
        System.out.println("Getting current location");
    }
    
    public void micon() {
        System.out.println("Microphone is on");
    }

    public void micoff() {
        System.out.println("Microphone is off");
    }

    public void record() {
        System.out.println("Recording audio");
    }

    public void play() {
        System.out.println("Playing audio");
    }
        
}

public class MultipleInheritance {
    
    public static void main(String[] args) {
        
        phone p = new phone();
        p.on();
        p.off();
        p.takeSnap();
        p.recordVideo();
        p.gpson();
        p.gpsoff();
        p.getLoc();
        p.setLoc();
        p.currentLoc();
        p.micon();
        p.micoff();
        p.record();
        p.play();
    }    
}
