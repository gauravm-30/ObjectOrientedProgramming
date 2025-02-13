package com.java.inheritance.boat;

public class Rowboat extends Boat {
    private int id;

    private int length;
    public Rowboat(){

    }
    public Rowboat(int id) {
        this.id = id;
    }

    public Rowboat(int id,int length){
        super(length);
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void rowTheBoat() {
    System.out.print("stroke natasha");
  }

  public void getBoatLength(){
    System.out.println(super.getLength());
  }
}