package Inheritence;

class CellPhone {

    public void call(){
        System.out.println("Calling...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }

}

class SmartPhone extends CellPhone{ 
    public void PlayMusic(){
        System.out.println("Playing music...");
    }
    public void PlayVideo(){
        System.out.println("Playing video...");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        
        SmartPhone a = new SmartPhone();
        a.call();
        a.ring();
        a.vibrate();
        a.PlayMusic();
        a.PlayVideo();
    }
}
