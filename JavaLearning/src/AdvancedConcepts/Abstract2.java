package AdvancedConcepts;
abstract class Game {
  abstract public void rendering();
  abstract public void updating();
}
class racingGame extends Game {
  public void rendering(){
    System.out.println("Rendering grass and hills.");  
  }
  public void updating() {
    System.out.println("Updating new cars and roads.");
  }
}

class arcadeGame extends Game {
  public void rendering(){
    System.out.println("Rendering new level data.");  
  }
  public void updating() {
    System.out.println("Updating new levles and missions.");
  }
}

public class Abstract2 {
  public static void main(String[] args) {
    racingGame rg = new racingGame();
    arcadeGame ag = new arcadeGame();
    rg.rendering();
    rg.updating();
    ag.rendering();
    ag.updating();

  }

}