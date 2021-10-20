package model;

import java.util.Random;

public class Dado {
  private int faceUp;
  private Random r;
  private int cor=-1;


  public Dado() {
    faceUp = 0;
    r = new Random();
  }

  public int rolaDado() {
    faceUp = r.nextInt(5)+1;
    return faceUp;
  }

  public int getDado() {
    return faceUp;
  }
}